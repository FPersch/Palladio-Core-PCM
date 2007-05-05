/**
 * 
 */
package de.uka.ipd.sdq.dialogs.stoex;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import de.uka.ipd.sdq.pcm.repository.CollectionDataType;
import de.uka.ipd.sdq.pcm.repository.CompositeDataType;
import de.uka.ipd.sdq.pcm.repository.DataType;
import de.uka.ipd.sdq.pcm.repository.InnerDeclaration;
import de.uka.ipd.sdq.pcm.repository.Parameter;
import de.uka.ipd.sdq.pcm.repository.PrimitiveDataType;
import de.uka.ipd.sdq.pcm.repository.Signature;
import de.uka.ipd.sdq.pcm.seff.ResourceDemandingSEFF;

/**
 * @author admin
 *
 */
public class VariableUsageContentProvider implements ITreeContentProvider {

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
	 */
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof Signature) {
			return getChildren(inputElement);
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	public void dispose() {
		// TODO Auto-generated method stub
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
	 */
	public Object[] getChildren(Object parent) {
		/**
		 * SEFF
		 */
		if (parent instanceof ResourceDemandingSEFF) {
			ResourceDemandingSEFF seff = (ResourceDemandingSEFF) parent;
			return new Object[] {seff.getDescribedService__SEFF()};
		}
		
		/**
		 * Signatur
		 */
		if (parent instanceof Signature) {
			Signature signature = (Signature) parent;
			return signature.getParameters__Signature().toArray();
		}
		/**
		 * Parameter
		 */
		if (parent instanceof Parameter) {
			Parameter parameter = (Parameter) parent;
			DataType dataType = (DataType) parameter.getDatatype__Parameter();
			
			if (dataType instanceof CompositeDataType) {
				return getCompositeTypeElements(dataType, parameter);
			}
			
			return new Object[] {new DataTypeContainer(dataType,parent)};
		}
		
		/**
		 * TreeType
		 */
		if (parent instanceof DataTypeContainer) {
			DataType innerType = getTreeTypeInner(parent);
			
			if (innerType instanceof PrimitiveDataType)
				return new Object[0];
			
			if (innerType instanceof CompositeDataType)
				return getCompositeTypeElements(innerType,parent);
			
			return new Object[] { new DataTypeContainer(innerType,parent) };
		}
		
		/**
		 * TreeDeclaration
		 */
		if (parent instanceof InnerDeclarationContainer) {
			DataType innerType = getTreeDeclarationInner(parent);

			if (innerType instanceof CompositeDataType) {
				return getCompositeTypeElements(innerType, parent);
			}

			CollectionDataType collDataType = (CollectionDataType) innerType;
			return new Object[] { new DataTypeContainer(collDataType
					.getInnerType_CollectionDataType(),parent) };
		}

		return new Object[0];
	}

	/**
	 * @return - return the DataType from InnerDeclaration of
	 *         TreeDeclaration-Object
	 */
	private DataType getTreeDeclarationInner(Object parent) {
		InnerDeclarationContainer treeDeclaration = (InnerDeclarationContainer) parent;
		InnerDeclaration declaration = (InnerDeclaration) treeDeclaration
				.getObject();
		return declaration.getDatatype_InnerDeclaration();
	}

	/**
	 * @return - return the DataType from inner collection datatype of
	 *         TreeType-Object
	 */
	private DataType getTreeTypeInner(Object parent) {
		DataTypeContainer treeType = (DataTypeContainer) parent;
		DataType dataType = (DataType) treeType.getObject();
		
		if (dataType instanceof PrimitiveDataType) {
			return dataType;
			
		}
		CollectionDataType collDataType = (CollectionDataType) dataType;
		return collDataType.getInnerType_CollectionDataType();
	}
	
	/**
	 * TODO
	 * 
	 * @return - array of TreeDeclaration from composite datatype
	 */
	private Object[] getCompositeTypeElements(DataType dataType, Object parent) {
		CompositeDataType compDataType = (CompositeDataType) dataType;
		EList<InnerDeclaration> list = compDataType
				.getInnerDeclaration_CompositeDataType();
		Object[] objects = new Object[list.size()];
		
		int i = 0;
		
		for (InnerDeclaration inner : list)
			objects[i++] = new InnerDeclarationContainer(inner, parent);
		
		return objects;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
	 */
	public Object getParent(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
	 */
	public boolean hasChildren(Object element) {
		if (element instanceof ResourceDemandingSEFF)
			return true;
		if (element instanceof Signature)
			return true;
		if (element instanceof Parameter)
			return true;
		if (element instanceof DataTypeContainer){
			DataType innerType = getTreeTypeInner(element);
			if (innerType instanceof PrimitiveDataType)
				return false;
			return true;
		}
		if (element instanceof InnerDeclarationContainer){
			DataType dataType = getTreeDeclarationInner(element);
			if (dataType instanceof CollectionDataType){
				CollectionDataType collDataType = (CollectionDataType) dataType;
				DataType innerType = collDataType.getInnerType_CollectionDataType();
				if (innerType instanceof PrimitiveDataType)
					return false;
			}
			if (dataType instanceof PrimitiveDataType)
				return false;
			return true;
		}
		return false;
	}
}




