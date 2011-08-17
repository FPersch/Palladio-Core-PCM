/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fzi.se.quality.qualityannotation.impl;

import de.fzi.se.quality.qualityannotation.NumberOfCallsDeviation;
import de.fzi.se.quality.qualityannotation.QualityAnnotation;
import de.fzi.se.quality.qualityannotation.QualityAnnotationPackage;
import de.fzi.se.quality.qualityannotation.REPrecision;
import de.fzi.se.quality.qualityannotation.RequiredElement;

import de.fzi.se.quality.qualityannotation.util.QualityAnnotationValidator;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fzi.se.quality.qualityannotation.impl.RequiredElementImpl#getNumberOfCallsDeviation <em>Number Of Calls Deviation</em>}</li>
 *   <li>{@link de.fzi.se.quality.qualityannotation.impl.RequiredElementImpl#getChildREs <em>Child REs</em>}</li>
 *   <li>{@link de.fzi.se.quality.qualityannotation.impl.RequiredElementImpl#getParentRE <em>Parent RE</em>}</li>
 *   <li>{@link de.fzi.se.quality.qualityannotation.impl.RequiredElementImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link de.fzi.se.quality.qualityannotation.impl.RequiredElementImpl#getQualityAnnotation <em>Quality Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequiredElementImpl extends IdentifierImpl implements RequiredElement {
	/**
	 * The cached value of the '{@link #getChildREs() <em>Child REs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildREs()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredElement> childREs;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected REPrecision precision;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QualityAnnotationPackage.Literals.REQUIRED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberOfCallsDeviation getNumberOfCallsDeviation() {
		if (eContainerFeatureID() != QualityAnnotationPackage.REQUIRED_ELEMENT__NUMBER_OF_CALLS_DEVIATION) return null;
		return (NumberOfCallsDeviation)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfCallsDeviation(NumberOfCallsDeviation newNumberOfCallsDeviation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNumberOfCallsDeviation, QualityAnnotationPackage.REQUIRED_ELEMENT__NUMBER_OF_CALLS_DEVIATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfCallsDeviation(NumberOfCallsDeviation newNumberOfCallsDeviation) {
		if (newNumberOfCallsDeviation != eInternalContainer() || (eContainerFeatureID() != QualityAnnotationPackage.REQUIRED_ELEMENT__NUMBER_OF_CALLS_DEVIATION && newNumberOfCallsDeviation != null)) {
			if (EcoreUtil.isAncestor(this, newNumberOfCallsDeviation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNumberOfCallsDeviation != null)
				msgs = ((InternalEObject)newNumberOfCallsDeviation).eInverseAdd(this, QualityAnnotationPackage.NUMBER_OF_CALLS_DEVIATION__REQUIRED_ELEMENT, NumberOfCallsDeviation.class, msgs);
			msgs = basicSetNumberOfCallsDeviation(newNumberOfCallsDeviation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityAnnotationPackage.REQUIRED_ELEMENT__NUMBER_OF_CALLS_DEVIATION, newNumberOfCallsDeviation, newNumberOfCallsDeviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredElement> getChildREs() {
		if (childREs == null) {
			childREs = new EObjectContainmentWithInverseEList<RequiredElement>(RequiredElement.class, this, QualityAnnotationPackage.REQUIRED_ELEMENT__CHILD_RES, QualityAnnotationPackage.REQUIRED_ELEMENT__PARENT_RE);
		}
		return childREs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredElement getParentRE() {
		if (eContainerFeatureID() != QualityAnnotationPackage.REQUIRED_ELEMENT__PARENT_RE) return null;
		return (RequiredElement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentRE(RequiredElement newParentRE, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentRE, QualityAnnotationPackage.REQUIRED_ELEMENT__PARENT_RE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentRE(RequiredElement newParentRE) {
		if (newParentRE != eInternalContainer() || (eContainerFeatureID() != QualityAnnotationPackage.REQUIRED_ELEMENT__PARENT_RE && newParentRE != null)) {
			if (EcoreUtil.isAncestor(this, newParentRE))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentRE != null)
				msgs = ((InternalEObject)newParentRE).eInverseAdd(this, QualityAnnotationPackage.REQUIRED_ELEMENT__CHILD_RES, RequiredElement.class, msgs);
			msgs = basicSetParentRE(newParentRE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityAnnotationPackage.REQUIRED_ELEMENT__PARENT_RE, newParentRE, newParentRE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REPrecision getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecision(REPrecision newPrecision, NotificationChain msgs) {
		REPrecision oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QualityAnnotationPackage.REQUIRED_ELEMENT__PRECISION, oldPrecision, newPrecision);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(REPrecision newPrecision) {
		if (newPrecision != precision) {
			NotificationChain msgs = null;
			if (precision != null)
				msgs = ((InternalEObject)precision).eInverseRemove(this, QualityAnnotationPackage.RE_PRECISION__REQUIRED_ELEMENT, REPrecision.class, msgs);
			if (newPrecision != null)
				msgs = ((InternalEObject)newPrecision).eInverseAdd(this, QualityAnnotationPackage.RE_PRECISION__REQUIRED_ELEMENT, REPrecision.class, msgs);
			msgs = basicSetPrecision(newPrecision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityAnnotationPackage.REQUIRED_ELEMENT__PRECISION, newPrecision, newPrecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityAnnotation getQualityAnnotation() {
		if (eContainerFeatureID() != QualityAnnotationPackage.REQUIRED_ELEMENT__QUALITY_ANNOTATION) return null;
		return (QualityAnnotation)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQualityAnnotation(QualityAnnotation newQualityAnnotation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newQualityAnnotation, QualityAnnotationPackage.REQUIRED_ELEMENT__QUALITY_ANNOTATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualityAnnotation(QualityAnnotation newQualityAnnotation) {
		if (newQualityAnnotation != eInternalContainer() || (eContainerFeatureID() != QualityAnnotationPackage.REQUIRED_ELEMENT__QUALITY_ANNOTATION && newQualityAnnotation != null)) {
			if (EcoreUtil.isAncestor(this, newQualityAnnotation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newQualityAnnotation != null)
				msgs = ((InternalEObject)newQualityAnnotation).eInverseAdd(this, QualityAnnotationPackage.QUALITY_ANNOTATION__STIPULATED_RE_PRECISIONS, QualityAnnotation.class, msgs);
			msgs = basicSetQualityAnnotation(newQualityAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityAnnotationPackage.REQUIRED_ELEMENT__QUALITY_ANNOTATION, newQualityAnnotation, newQualityAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean StipulatedPrecisionMustBeSetInStipulationContext(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QualityAnnotationValidator.DIAGNOSTIC_SOURCE,
						 QualityAnnotationValidator.REQUIRED_ELEMENT__STIPULATED_PRECISION_MUST_BE_SET_IN_STIPULATION_CONTEXT,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StipulatedPrecisionMustBeSetInStipulationContext", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QualityAnnotationPackage.REQUIRED_ELEMENT__NUMBER_OF_CALLS_DEVIATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNumberOfCallsDeviation((NumberOfCallsDeviation)otherEnd, msgs);
			case QualityAnnotationPackage.REQUIRED_ELEMENT__CHILD_RES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildREs()).basicAdd(otherEnd, msgs);
			case QualityAnnotationPackage.REQUIRED_ELEMENT__PARENT_RE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentRE((RequiredElement)otherEnd, msgs);
			case QualityAnnotationPackage.REQUIRED_ELEMENT__PRECISION:
				if (precision != null)
					msgs = ((InternalEObject)precision).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QualityAnnotationPackage.REQUIRED_ELEMENT__PRECISION, null, msgs);
				return basicSetPrecision((REPrecision)otherEnd, msgs);
			case QualityAnnotationPackage.REQUIRED_ELEMENT__QUALITY_ANNOTATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetQualityAnnotation((QualityAnnotation)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QualityAnnotationPackage.REQUIRED_ELEMENT__NUMBER_OF_CALLS_DEVIATION:
				return basicSetNumberOfCallsDeviation(null, msgs);
			case QualityAnnotationPackage.REQUIRED_ELEMENT__CHILD_RES:
				return ((InternalEList<?>)getChildREs()).basicRemove(otherEnd, msgs);
			case QualityAnnotationPackage.REQUIRED_ELEMENT__PARENT_RE:
				return basicSetParentRE(null, msgs);
			case QualityAnnotationPackage.REQUIRED_ELEMENT__PRECISION:
				return basicSetPrecision(null, msgs);
			case QualityAnnotationPackage.REQUIRED_ELEMENT__QUALITY_ANNOTATION:
				return basicSetQualityAnnotation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case QualityAnnotationPackage.REQUIRED_ELEMENT__NUMBER_OF_CALLS_DEVIATION:
				return eInternalContainer().eInverseRemove(this, QualityAnnotationPackage.NUMBER_OF_CALLS_DEVIATION__REQUIRED_ELEMENT, NumberOfCallsDeviation.class, msgs);
			case QualityAnnotationPackage.REQUIRED_ELEMENT__PARENT_RE:
				return eInternalContainer().eInverseRemove(this, QualityAnnotationPackage.REQUIRED_ELEMENT__CHILD_RES, RequiredElement.class, msgs);
			case QualityAnnotationPackage.REQUIRED_ELEMENT__QUALITY_ANNOTATION:
				return eInternalContainer().eInverseRemove(this, QualityAnnotationPackage.QUALITY_ANNOTATION__STIPULATED_RE_PRECISIONS, QualityAnnotation.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QualityAnnotationPackage.REQUIRED_ELEMENT__NUMBER_OF_CALLS_DEVIATION:
				return getNumberOfCallsDeviation();
			case QualityAnnotationPackage.REQUIRED_ELEMENT__CHILD_RES:
				return getChildREs();
			case QualityAnnotationPackage.REQUIRED_ELEMENT__PARENT_RE:
				return getParentRE();
			case QualityAnnotationPackage.REQUIRED_ELEMENT__PRECISION:
				return getPrecision();
			case QualityAnnotationPackage.REQUIRED_ELEMENT__QUALITY_ANNOTATION:
				return getQualityAnnotation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QualityAnnotationPackage.REQUIRED_ELEMENT__NUMBER_OF_CALLS_DEVIATION:
				setNumberOfCallsDeviation((NumberOfCallsDeviation)newValue);
				return;
			case QualityAnnotationPackage.REQUIRED_ELEMENT__CHILD_RES:
				getChildREs().clear();
				getChildREs().addAll((Collection<? extends RequiredElement>)newValue);
				return;
			case QualityAnnotationPackage.REQUIRED_ELEMENT__PARENT_RE:
				setParentRE((RequiredElement)newValue);
				return;
			case QualityAnnotationPackage.REQUIRED_ELEMENT__PRECISION:
				setPrecision((REPrecision)newValue);
				return;
			case QualityAnnotationPackage.REQUIRED_ELEMENT__QUALITY_ANNOTATION:
				setQualityAnnotation((QualityAnnotation)newValue);
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
			case QualityAnnotationPackage.REQUIRED_ELEMENT__NUMBER_OF_CALLS_DEVIATION:
				setNumberOfCallsDeviation((NumberOfCallsDeviation)null);
				return;
			case QualityAnnotationPackage.REQUIRED_ELEMENT__CHILD_RES:
				getChildREs().clear();
				return;
			case QualityAnnotationPackage.REQUIRED_ELEMENT__PARENT_RE:
				setParentRE((RequiredElement)null);
				return;
			case QualityAnnotationPackage.REQUIRED_ELEMENT__PRECISION:
				setPrecision((REPrecision)null);
				return;
			case QualityAnnotationPackage.REQUIRED_ELEMENT__QUALITY_ANNOTATION:
				setQualityAnnotation((QualityAnnotation)null);
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
			case QualityAnnotationPackage.REQUIRED_ELEMENT__NUMBER_OF_CALLS_DEVIATION:
				return getNumberOfCallsDeviation() != null;
			case QualityAnnotationPackage.REQUIRED_ELEMENT__CHILD_RES:
				return childREs != null && !childREs.isEmpty();
			case QualityAnnotationPackage.REQUIRED_ELEMENT__PARENT_RE:
				return getParentRE() != null;
			case QualityAnnotationPackage.REQUIRED_ELEMENT__PRECISION:
				return precision != null;
			case QualityAnnotationPackage.REQUIRED_ELEMENT__QUALITY_ANNOTATION:
				return getQualityAnnotation() != null;
		}
		return super.eIsSet(featureID);
	}

} //RequiredElementImpl
