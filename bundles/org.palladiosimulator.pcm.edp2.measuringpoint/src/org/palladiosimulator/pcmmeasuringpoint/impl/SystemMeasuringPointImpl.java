/**
 */
package org.palladiosimulator.pcmmeasuringpoint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.commons.emfutils.EMFLoadHelper;
import org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringPointImpl;

import org.palladiosimulator.pcmmeasuringpoint.PcmmeasuringpointPackage;
import org.palladiosimulator.pcmmeasuringpoint.SystemMeasuringPoint;
import org.palladiosimulator.pcmmeasuringpoint.SystemReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Measuring Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcmmeasuringpoint.impl.SystemMeasuringPointImpl#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemMeasuringPointImpl extends MeasuringPointImpl implements SystemMeasuringPoint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemMeasuringPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmmeasuringpointPackage.Literals.SYSTEM_MEASURING_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.palladiosimulator.pcm.system.System getSystem() {
		return (org.palladiosimulator.pcm.system.System) eDynamicGet(
				PcmmeasuringpointPackage.SYSTEM_MEASURING_POINT__SYSTEM,
				PcmmeasuringpointPackage.Literals.SYSTEM_REFERENCE__SYSTEM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.palladiosimulator.pcm.system.System basicGetSystem() {
		return (org.palladiosimulator.pcm.system.System) eDynamicGet(
				PcmmeasuringpointPackage.SYSTEM_MEASURING_POINT__SYSTEM,
				PcmmeasuringpointPackage.Literals.SYSTEM_REFERENCE__SYSTEM, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystem(org.palladiosimulator.pcm.system.System newSystem) {
		eDynamicSet(PcmmeasuringpointPackage.SYSTEM_MEASURING_POINT__SYSTEM,
				PcmmeasuringpointPackage.Literals.SYSTEM_REFERENCE__SYSTEM, newSystem);
	}

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public String getStringRepresentation() {
        if (this.getSystem() == null) {
            return "";
        }

        if (this.getSystem().getEntityName() == null) {
            return super.getStringRepresentation();
        }

        EcoreUtil.resolveAll(this);

        final StringBuilder result = new StringBuilder();

        result.append(this.getSystem().getEntityName());

        return result.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public String getResourceURIRepresentation() {
        if (this.getSystem() == null) {
            return "";
        }
        EcoreUtil.resolveAll(this);
        return EMFLoadHelper.getResourceURI(this.getSystem());
    }
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PcmmeasuringpointPackage.SYSTEM_MEASURING_POINT__SYSTEM:
			if (resolve)
				return getSystem();
			return basicGetSystem();
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
		case PcmmeasuringpointPackage.SYSTEM_MEASURING_POINT__SYSTEM:
			setSystem((org.palladiosimulator.pcm.system.System) newValue);
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
		case PcmmeasuringpointPackage.SYSTEM_MEASURING_POINT__SYSTEM:
			setSystem((org.palladiosimulator.pcm.system.System) null);
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
		case PcmmeasuringpointPackage.SYSTEM_MEASURING_POINT__SYSTEM:
			return basicGetSystem() != null;
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
		if (baseClass == SystemReference.class) {
			switch (derivedFeatureID) {
			case PcmmeasuringpointPackage.SYSTEM_MEASURING_POINT__SYSTEM:
				return PcmmeasuringpointPackage.SYSTEM_REFERENCE__SYSTEM;
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
		if (baseClass == SystemReference.class) {
			switch (baseFeatureID) {
			case PcmmeasuringpointPackage.SYSTEM_REFERENCE__SYSTEM:
				return PcmmeasuringpointPackage.SYSTEM_MEASURING_POINT__SYSTEM;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SystemMeasuringPointImpl
