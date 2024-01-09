/**
 */
package dtmc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dtmc.Module#getDtmc <em>Dtmc</em>}</li>
 * </ul>
 *
 * @see dtmc.DtmcPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends EObject {
	/**
	 * Returns the value of the '<em><b>Dtmc</b></em>' containment reference list.
	 * The list contents are of type {@link dtmc.Dtmc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtmc</em>' containment reference list.
	 * @see dtmc.DtmcPackage#getModule_Dtmc()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dtmc> getDtmc();

} // Module
