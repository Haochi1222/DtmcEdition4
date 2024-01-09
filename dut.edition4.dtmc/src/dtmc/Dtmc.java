/**
 */
package dtmc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dtmc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dtmc.Dtmc#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link dtmc.Dtmc#getStateVariable <em>State Variable</em>}</li>
 *   <li>{@link dtmc.Dtmc#getStates <em>States</em>}</li>
 *   <li>{@link dtmc.Dtmc#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link dtmc.Dtmc#getRewards <em>Rewards</em>}</li>
 * </ul>
 *
 * @see dtmc.DtmcPackage#getDtmc()
 * @model
 * @generated
 */
public interface Dtmc extends EObject {
	/**
	 * Returns the value of the '<em><b>Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Name</em>' attribute.
	 * @see #setModuleName(String)
	 * @see dtmc.DtmcPackage#getDtmc_ModuleName()
	 * @model
	 * @generated
	 */
	String getModuleName();

	/**
	 * Sets the value of the '{@link dtmc.Dtmc#getModuleName <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Name</em>' attribute.
	 * @see #getModuleName()
	 * @generated
	 */
	void setModuleName(String value);

	/**
	 * Returns the value of the '<em><b>State Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Variable</em>' attribute.
	 * @see #setStateVariable(String)
	 * @see dtmc.DtmcPackage#getDtmc_StateVariable()
	 * @model
	 * @generated
	 */
	String getStateVariable();

	/**
	 * Sets the value of the '{@link dtmc.Dtmc#getStateVariable <em>State Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Variable</em>' attribute.
	 * @see #getStateVariable()
	 * @generated
	 */
	void setStateVariable(String value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link dtmc.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see dtmc.DtmcPackage#getDtmc_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link dtmc.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see dtmc.DtmcPackage#getDtmc_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Rewards</b></em>' containment reference list.
	 * The list contents are of type {@link dtmc.Reward}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rewards</em>' containment reference list.
	 * @see dtmc.DtmcPackage#getDtmc_Rewards()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reward> getRewards();

} // Dtmc
