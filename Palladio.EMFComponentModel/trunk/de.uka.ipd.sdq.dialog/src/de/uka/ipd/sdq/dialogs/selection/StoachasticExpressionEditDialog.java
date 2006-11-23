/**
 * 
 */
package de.uka.ipd.sdq.dialogs.selection;

import java.io.StringBufferInputStream;
import java.io.StringReader;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.ITextListener;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.TextEvent;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.AnnotationModel;
import org.eclipse.jface.text.source.AnnotationPainter;
import org.eclipse.jface.text.source.AnnotationRulerColumn;
import org.eclipse.jface.text.source.CompositeRuler;
import org.eclipse.jface.text.source.IAnnotationAccess;
import org.eclipse.jface.text.source.IAnnotationAccessExtension;
import org.eclipse.jface.text.source.ImageUtilities;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.jface.text.source.VerticalRuler;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import com.swtdesigner.SWTResourceManager;

import antlr.CharScanner;
import antlr.RecognitionException;
import antlr.TokenStreamException;
import de.uka.ipd.sdq.pcm.core.stochastics.Expression;
import de.uka.ipd.sdq.pcm.stochasticexpressions.StoExPrettyPrintVisitor;
import de.uka.ipd.sdq.pcm.stochasticexpressions.parser.StochasticExpressionsLexer;
import de.uka.ipd.sdq.pcm.stochasticexpressions.parser.StochasticExpressionsParser;

/**
 * @author Snowball
 * 
 */
public class StoachasticExpressionEditDialog extends Dialog {

	public static final String ERROR_TYPE = "ERROR";

	private Expression result;

	// private Text editText;
	private SourceViewer textViewer;

	private String newText = "= ";

	private AnnotationModel fAnnotationModel;

	/**
	 * @param parent
	 */
	public StoachasticExpressionEditDialog(Shell parent) {
		super(parent);
	}

	/**
	 * @param parent
	 * @param style
	 */
	public StoachasticExpressionEditDialog(Shell parent, int style) {
		super(parent);
	}

	public void setInitialExpression(Expression ex) {
		newText = "= " + new StoExPrettyPrintVisitor().prettyPrint(ex);
	}

	@Override
	protected void okPressed() {
		super.okPressed();
	}

	@Override
	protected Control createDialogArea(Composite parent) {

		IAnnotationAccess fAnnotationAccess = new AnnotationMarkerAccess();

		final Group editStochasticExpressionGroup = new Group(parent, SWT.NONE);
		editStochasticExpressionGroup.setText("Edit stochastic expression");
		editStochasticExpressionGroup.setLayout(new GridLayout());

		fAnnotationModel = new AnnotationModel();
		CompositeRuler fCompositeRuler = new CompositeRuler();
		AnnotationRulerColumn annotationRuler = new AnnotationRulerColumn(
				fAnnotationModel, 16, fAnnotationAccess);
		fCompositeRuler.setModel(fAnnotationModel);
		// annotation ruler is decorating our composite ruler
		fCompositeRuler.addDecorator(0, annotationRuler);

		// add what types are show on the different rulers
		annotationRuler.addAnnotationType(ERROR_TYPE);
		textViewer = new SourceViewer(editStochasticExpressionGroup,
				fCompositeRuler, SWT.V_SCROLL | SWT.MULTI | SWT.H_SCROLL);
		final StyledText styledText = textViewer.getTextWidget();
		styledText.setFont(SWTResourceManager.getFont("Courier New", 12,
				SWT.NONE));

		// to paint the annotations
		AnnotationPainter ap = new AnnotationPainter(textViewer,
				fAnnotationAccess);
		ap.addAnnotationType(ERROR_TYPE);
		ap.setAnnotationTypeColor(ERROR_TYPE, new Color(Display.getDefault(),
				new RGB(255, 0, 0)));

		// this will draw the squigglies under the text
		textViewer.addPainter(ap);

		textViewer.configure(new StoExSourceViewerConfiguration(fAnnotationModel));
		GridData layoutData = new GridData(GridData.FILL_BOTH
				| GridData.GRAB_HORIZONTAL | GridData.GRAB_VERTICAL);
		layoutData.heightHint = 300;
		layoutData.widthHint = 450;
		textViewer.getControl().setLayoutData(layoutData);
		// editText.setText(newText);
		textViewer.setDocument(new Document(newText), fAnnotationModel);
		textViewer.addTextListener(new ITextListener(){

			public void textChanged(TextEvent event) {
				if (event.getDocumentEvent() != null)
				{
					parseInputAndRefreshAnnotations();
				}
			}
			
		});
		return textViewer.getControl();
	}

	protected void parseInputAndRefreshAnnotations() {
		EObject value = null;
		fAnnotationModel.removeAllAnnotations();
		StochasticExpressionsLexer lexer = null;
		try {
			String text = this.textViewer.getDocument().get();
			lexer = new StochasticExpressionsLexer(
					new StringReader(text));
			StochasticExpressionsParser parser = new StochasticExpressionsParser(
					lexer);
			value = parser.expression();
		} catch (RecognitionException e) {
			showInputInvalidInfo(e);
			return;
		} catch (TokenStreamException e) {
			showInputInvalidInfo(e,lexer);
			return;
		} catch (Exception e) {
			showInputInvalidInfo(e);
			return;
		}
		this.getButton(IDialogConstants.OK_ID).setEnabled(true);
		result = (Expression) value;
	}

	private void showInputInvalidInfo(TokenStreamException e,CharScanner scanner) {
		result = null;
		fAnnotationModel.addAnnotation(
				new Annotation(ERROR_TYPE, false, 
				e.getMessage()),
				new Position(ParserHelper.positionToOffset(textViewer.getDocument(), scanner.getLine(), scanner.getColumn()),1));
		this.getButton(IDialogConstants.OK_ID).setEnabled(false);
	}

	/**
	 * @param e
	 */
	private void showInputInvalidInfo(Exception e) {
		result = null;
		fAnnotationModel.addAnnotation(
				new Annotation(ERROR_TYPE, false, 
				e.getMessage()),
				guessPosition(e));
		this.getButton(IDialogConstants.OK_ID).setEnabled(false);
	}

	/**
	 * @param e 
	 * @return
	 */
	private Position guessPosition(Exception e) {
		if (e instanceof RecognitionException)
		{
			RecognitionException recException = (RecognitionException) e;
			int col = recException.getColumn(); 
			int line = recException.getLine();
			int offset = ParserHelper.positionToOffset(textViewer.getDocument(),line,col);
			return new Position(offset, textViewer.getDocument().getLength()-offset);
		}
		return new Position(0, textViewer.getDocument().getLength());
	}

	public Expression getResult() {
		return result;
	}

	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Edit stochastic expression");
	}
}

class AnnotationMarkerAccess implements IAnnotationAccess,
		IAnnotationAccessExtension {
	public Object getType(Annotation annotation) {
		return annotation.getType();
	}

	public boolean isMultiLine(Annotation annotation) {
		return true;
	}

	public boolean isTemporary(Annotation annotation) {
		return !annotation.isPersistent();
	}

	public String getTypeLabel(Annotation annotation) {
		if (annotation instanceof Annotation)
			return "Errors";

		return null;
	}

	public int getLayer(Annotation annotation) {
		return 0;
	}

	public void paint(Annotation annotation, GC gc, Canvas canvas,
			Rectangle bounds) {
		ImageUtilities.drawImage(SWTResourceManager.getImage("xxx.gif"),
				gc, canvas, bounds, SWT.CENTER, SWT.TOP);
	}

	public boolean isPaintable(Annotation annotation) {
		return true;
	}

	public boolean isSubtype(Object annotationType, Object potentialSupertype) {
		if (annotationType.equals(potentialSupertype))
			return true;

		return false;
	}

	public Object[] getSupertypes(Object annotationType) {
		return new Object[0];
	}
}
