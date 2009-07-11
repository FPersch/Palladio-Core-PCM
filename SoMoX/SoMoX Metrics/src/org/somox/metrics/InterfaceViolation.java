package org.somox.metrics;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import de.fzi.gast.accesses.Access;
import de.fzi.gast.core.ModelElement;
import de.fzi.gast.core.Root;
import de.fzi.gast.helpers.DerivationHelper;
import de.fzi.gast.types.GASTClass;

/**
 * InterfaceViolation metric
 * 
 * @author Grischa Liebel
 *
 */
public class InterfaceViolation implements Metric {

	protected HashSet<String> componentAClassNameSet, componentBClassNameSet;
	protected HashSet<String> componentAIFaceNameSet, componentBIFaceNameSet;
	
	List<GASTClass> componentAClasses;
	List<GASTClass> componentBClasses;
	
	/**
	 * {@inheritDoc}
	 */
	public MetricTab getLaunchConfigurationTab() {
		return null;
	}
	
	/**
	 * Default-constructor initializing the namesets
	 */
	public InterfaceViolation () {
		componentAClassNameSet = new HashSet<String>();
		componentBClassNameSet = new HashSet<String>();
		componentAIFaceNameSet = new HashSet<String>();
		componentBIFaceNameSet = new HashSet<String>();
		componentAClasses = new LinkedList<GASTClass>();
		componentBClasses = new LinkedList<GASTClass>();
	}

	/**
	 * {@inheritDoc}
	 */
	public double compute (Root root, List<GASTClass> elements1, List<GASTClass> elements2) {
		double referencesToClasses = 0.0;
		double referencesToWholeComponent = 0.0;
		double ifaceViol = 0.0;

		extractLists(root,elements1,elements2);

		for (GASTClass currentClass : componentAClasses) {
			EList<Access> accesses = DerivationHelper.selectAccessesInSubtree(currentClass);

			for (Access currentAccess : accesses) {
				GASTClass accessedClass = currentAccess.getAccessedClass();
				
				if (accessedClass != null) {
					if (componentBClassNameSet.contains(accessedClass.getQualifiedName())) {
						referencesToClasses += 1.0;
						referencesToWholeComponent += 1.0;
					} else if (componentBIFaceNameSet.contains(accessedClass.getQualifiedName())) {
						referencesToWholeComponent += 1.0;
					}
				}
			}
		}
		
		if (referencesToWholeComponent != 0) {
			ifaceViol = referencesToClasses/referencesToWholeComponent;
		}
		
		return ifaceViol;

	}

	/**
	 * Extracts from the ModelElement lists the non-blacklisted
	 * or whitelisted (depending on blacklistIndicator) classes
	 * 
	 * @param root Root-Object of the Software-Project modeled as GAST-model
	 * @param elements1 First part of the composite component
	 * @param elements2 Second part of the composite component
	 */
	private void extractLists(Root root, List<GASTClass> elements1,
			List<GASTClass> elements2) {
		for (ModelElement current : elements1) {
			if (current instanceof GASTClass) {
				componentAClasses.add((GASTClass)current);
				if (((GASTClass) current).isInterface()) {
					componentAIFaceNameSet.add(((GASTClass)current).getQualifiedName());
				} else {
					componentAClassNameSet.add(((GASTClass)current).getQualifiedName());
				}
			}
		}
		for (ModelElement current : elements2) {
			if (current instanceof GASTClass) {
				componentBClasses.add((GASTClass)current);
				if (((GASTClass) current).isInterface()) {
					componentBIFaceNameSet.add(((GASTClass)current).getQualifiedName());
				} else {
					componentBClassNameSet.add(((GASTClass)current).getQualifiedName());
				}
			}
		}
		
	}

	/**
	 * {@inheritDoc}
	 */
	public MetricID getMID() {
		return new MetricID(5);
	}

	/**
	 * {@inheritDoc}
	 */
	public void initialize(Root root) {
	}

}
