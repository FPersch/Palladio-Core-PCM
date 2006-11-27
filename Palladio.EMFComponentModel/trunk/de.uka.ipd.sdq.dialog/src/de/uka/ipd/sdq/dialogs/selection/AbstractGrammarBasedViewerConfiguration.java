/**
 * 
 */
package de.uka.ipd.sdq.dialogs.selection;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.ITokenScanner;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationHover;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;

/**
 * @author Snowball
 * 
 */
public class AbstractGrammarBasedViewerConfiguration extends SourceViewerConfiguration {

	private IAnnotationModel annotationModel;
	private Class myLexerClass;
	private ITokenMapper myMapper;

	/**
	 * 
	 */
	public AbstractGrammarBasedViewerConfiguration(IAnnotationModel annotationModel, Class lexerClass, ITokenMapper myMapper) {
		this.annotationModel = annotationModel;
		this.myLexerClass = lexerClass;
		this.myMapper = myMapper;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.text.source.SourceViewerConfiguration#getPresentationReconciler(org.eclipse.jface.text.source.ISourceViewer)
	 */
	@Override
	public IPresentationReconciler getPresentationReconciler(
			ISourceViewer sourceViewer) {
		PresentationReconciler reconciler = new PresentationReconciler();

		DefaultDamagerRepairer dr = new DefaultDamagerRepairer(
				getKeywordScanner());
		reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);

		return reconciler;
	}

	public IAnnotationHover getAnnotationHover(ISourceViewer sourceViewer) {
		return new AnnotationHover(annotationModel);
	}

	private ITokenScanner getKeywordScanner() {
		return new ANTLRTokenScannerAdapter(myLexerClass,myMapper);
	}

	public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {

		ContentAssistant assistant = new ContentAssistant();
		assistant.setContentAssistProcessor(new StoExCompletionProcessor(),
				IDocument.DEFAULT_CONTENT_TYPE);
		assistant.setAutoActivationDelay(1);
		assistant.enableAutoActivation(true);

		return assistant;
	}
}

// annotation hover manager
class AnnotationHover implements IAnnotationHover, ITextHover {
	private IAnnotationModel fAnnotationModel;

	public AnnotationHover(IAnnotationModel annotationModel) {
		this.fAnnotationModel = annotationModel;
	}

	public String getHoverInfo(ISourceViewer sourceViewer, int lineNumber) {
		Iterator ite = fAnnotationModel.getAnnotationIterator();

		ArrayList all = new ArrayList();

		while (ite.hasNext()) {
			Annotation a = (Annotation) ite.next();
			if (a instanceof Annotation) {
				all.add(((Annotation) a).getText());
			}
		}

		StringBuffer total = new StringBuffer();
		for (int x = 0; x < all.size(); x++) {
			String str = (String) all.get(x);
			total.append(" " + str + (x == (all.size() - 1) ? "" : "\n"));
		}

		return total.toString();
	}

	public String getHoverInfo(ITextViewer textViewer, IRegion hoverRegion) {
		return null;
	}

	public IRegion getHoverRegion(ITextViewer textViewer, int offset) {
		return null;
	}
}