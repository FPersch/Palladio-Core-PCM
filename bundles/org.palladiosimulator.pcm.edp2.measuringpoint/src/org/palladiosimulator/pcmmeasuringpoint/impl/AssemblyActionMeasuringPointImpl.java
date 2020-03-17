/**
 */
package org.palladiosimulator.pcmmeasuringpoint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.commons.emfutils.EMFLoadHelper;
import org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringPointImpl;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

import org.palladiosimulator.pcm.seff.AbstractAction;

import org.palladiosimulator.pcmmeasuringpoint.ActionReference;
import org.palladiosimulator.pcmmeasuringpoint.AssemblyActionMeasuringPoint;
import org.palladiosimulator.pcmmeasuringpoint.AssemblyReference;
import org.palladiosimulator.pcmmeasuringpoint.PcmmeasuringpointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Action Measuring Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcmmeasuringpoint.impl.AssemblyActionMeasuringPointImpl#getAssembly <em>Assembly</em>}</li>
 *   <li>{@link org.palladiosimulator.pcmmeasuringpoint.impl.AssemblyActionMeasuringPointImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyActionMeasuringPointImpl extends MeasuringPointImpl implements AssemblyActionMeasuringPoint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyActionMeasuringPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmmeasuringpointPackage.Literals.ASSEMBLY_ACTION_MEASURING_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssemblyContext getAssembly() {
		return (AssemblyContext) eDynamicGet(PcmmeasuringpointPackage.ASSEMBLY_ACTION_MEASURING_POINT__ASSEMBLY,
				PcmmeasuringpointPackage.Literals.ASSEMBLY_REFERENCE__ASSEMBLY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetAssembly() {
		return (AssemblyContext) eDynamicGet(PcmmeasuringpointPackage.ASSEMBLY_ACTION_MEASURING_POINT__ASSEMBLY,
				PcmmeasuringpointPackage.Literals.ASSEMBLY_REFERENCE__ASSEMBLY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssembly(AssemblyContext newAssembly) {
		eDynamicSet(PcmmeasuringpointPackage.ASSEMBLY_ACTION_MEASURING_POINT__ASSEMBLY,
				PcmmeasuringpointPackage.Literals.ASSEMBLY_REFERENCE__ASSEMBLY, newAssembly);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractAction getAction() {
		return (AbstractAction) eDynamicGet(PcmmeasuringpointPackage.ASSEMBLY_ACTION_MEASURING_POINT__ACTION,
				PcmmeasuringpointPackage.Literals.ACTION_REFERENCE__ACTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAction basicGetAction() {
		return (AbstractAction) eDynamicGet(PcmmeasuringpointPackage.ASSEMBLY_ACTION_MEASURING_POINT__ACTION,
				PcmmeasuringpointPackage.Literals.ACTION_REFERENCE__ACTION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAction(AbstractAction newAction) {
		eDynamicSet(PcmmeasuringpointPackage.ASSEMBLY_ACTION_MEASURING_POINT__ACTION,
				PcmmeasuringpointPackage.Literals.ACTION_REFERENCE__ACTION, newAction);
	}
	
	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public String getStringRepresentation() {
        if (this.getAssembly() == null || this.getAction() == null) {
            return "";
        }

        if (this.getAssembly().getEntityName() == null) {
            return super.getStringRepresentation();
        }

        EcoreUtil.resolveAll(this);
        final StringBuilder result = new StringBuilder();

        result.append("Action: ");
        result.append(this.getAssembly().getEntityName());
        result.append(".");
        result.append(this.getAction().getEntityName());

        return result.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public String getResourceURIRepresentation() {
        if (this.getAction() == null) {
            return "";
        }
        EcoreUtil.resolveAll(this);
        return EMFLoadHelper.getResourceURI(this.getAction());
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PcmmeasuringpointPackage.ASSEMBLY_ACTION_MEASURING_POINT__ASSEMBLY:
			if (resolve)
				return getAssembly();
			return basicGetAssembly();
		case PcmmeasuringpointPackage.ASSEMBLY_ACTION_MEASURING_POINT__ACTION:
			if (resolve)
				return getAction();
			return basicGetAction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PcmmeasuringpointPackage.ASSEMBLY_ACTION_MEASURING_POINT__ASSEMBLY:
			setAssembly((AssemblyContext) newValue);
			return;
		case PcmmeasuringpointPackage.ASSEMBLY_ACTION_MEASURING_POINT__ACTION:
			setAction((AbstractAction) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PcmmeasuringpointPackage.ASSEMBLY_ACTION_MEASURING_POINT__ASSEMBLY:
			setAssembly((AssemblyContext) null);
			return;
		case PcmmeasuringpointPackage.ASSEMBLY_ACTION_MEASURING_POINT__ACTION:
			setAction((AbstractAction) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PcmmeasuringpointPackage.ASSEMBLY_ACTION_MEASURING_POINT__ASSEMBLY:
			return basicGetAssembly() != null;
		case PcmmeasuringpointPackage.ASSEMBLY_ACTION_MEASURING_POINT__ACTION:
			return basicGetAction() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AssemblyReference.class) {
			switch (derivedFeatureID) {
			case PcmmeasuringpointPackage.ASSEMBLY_ACTION_MEASURING_POINT__ASSEMBLY:
				return PcmmeasuringpointPackage.ASSEMBLY_REFERENCE__ASSEMBLY;
			default:
				return -1;
			}
		}
		if (baseClass == ActionReference.class) {
			switch (derivedFeatureID) {
			case PcmmeasuringpointPackage.ASSEMBLY_ACTION_MEASURING_POINT__ACTION:
				return PcmmeasuringpointPackage.ACTION_REFERENCE__ACTION;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AssemblyReference.class) {
			switch (baseFeatureID) {
			case PcmmeasuringpointPackage.ASSEMBLY_REFERENCE__ASSEMBLY:
				return PcmmeasuringpointPackage.ASSEMBLY_ACTION_MEASURING_POINT__ASSEMBLY;
			default:
				return -1;
			}
		}
		if (baseClass == ActionReference.class) {
			switch (baseFeatureID) {
			case PcmmeasuringpointPackage.ACTION_REFERENCE__ACTION:
				return PcmmeasuringpointPackage.ASSEMBLY_ACTION_MEASURING_POINT__ACTION;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AssemblyActionMeasuringPointImpl
