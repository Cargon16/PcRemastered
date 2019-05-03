/**
 * 
 */
package Presentacion.Command;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author nacho710
 * @uml.annotations
 *     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#__dQy8EmjEemGrfQ_CenZZA"
 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#__dQy8EmjEemGrfQ_CenZZA?DATATYPE"
 */
public enum Evento {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_WV1GIEmkEemGrfQ_CenZZA"
	*/
	createClienteCommnad,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_Y_i6YEmkEemGrfQ_CenZZA"
	 */
	createClienteErrorCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_ryuUwFSVEemyTotpzKBrqw"
	 */
	deleteClienteCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_zWMGMFSVEemyTotpzKBrqw"
	 */
	deleteClienteErrorCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_zW7tEFSVEemyTotpzKBrqw"
	 */
	updateClienteCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_zYa60FSVEemyTotpzKBrqw"
	 */
	updateClienteErrorCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_zZKhsFSVEemyTotpzKBrqw"
	 */
	readClienteCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_zbHCcFSVEemyTotpzKBrqw"
	 */
	readClienteErrorCommand,
	
	readByDNIClienteCommand,
	
	readByDNIClienteCommandError,
	

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_zdC8IFSVEemyTotpzKBrqw"
	 */
	readAllClienteCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_zdyjAFSVEemyTotpzKBrqw"
	 */
	readAllClienteErrorCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_zf3moFSVEemyTotpzKBrqw"
	 */
	createProductoCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_zhD5cFSVEemyTotpzKBrqw"
	 */
	createProductoErrorCommand,

	readByIDProdcutoErrorCommand,

	readByIDProductoCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_zjAaMFSVEemyTotpzKBrqw"
	 */
	deleteProductoCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_zjwBEFSVEemyTotpzKBrqw"
	 */
	deleteProductoErrorCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_zj5LAFSVEemyTotpzKBrqw"
	 */
	updateProductoCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_zoqWQFSVEemyTotpzKBrqw"
	 */
	updateProductoErrorCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_zq5x8FSVEemyTotpzKBrqw"
	 */
	readProductoCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_zrgO4FSVEemyTotpzKBrqw"
	 */
	readProductoErrorCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_zu79YFSVEemyTotpzKBrqw"
	 */
	readAllProductoCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_zvrkQFSVEemyTotpzKBrqw"
	 */
	readAllProductoErrorCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_zvrkQVSVEemyTotpzKBrqw"
	 */
	createProveedorCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_zxxO8FSVEemyTotpzKBrqw"
	 */
	createProveedorErrorCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_zz2SkFSVEemyTotpzKBrqw"
	 */
	readByIDProveedorErrorCommand,

	readByIDProveedorCommand,
	
	deleteProveedorCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_z1VgUFSVEemyTotpzKBrqw"
	 */
	deleteProveedorErrorCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_z2YpMFSVEemyTotpzKBrqw"
	 */
	updateProveedorCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_z4Kx4FSVEemyTotpzKBrqw"
	 */
	updateProveedorErrorCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_z5g1sFSVEemyTotpzKBrqw"
	 */
	readProveedorCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_z7mgYFSVEemyTotpzKBrqw"
	 */
	readProveedorErrorCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_OlmoYFSXEemyTotpzKBrqw"
	 */
	readAllProveedorCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_O_7M4FSXEemyTotpzKBrqw"
	 */
	readAllProveedorErrorCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_PMqBUFSXEemyTotpzKBrqw"
	 */
	createEnvioCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_PXFvsFSXEemyTotpzKBrqw"
	 */
	createEnvioErrorCommand,
	
	readByIDEnvioErrorCommand,

	readByIDEnvioCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_PgbR4FSXEemyTotpzKBrqw"
	 */
	deleteEnvioCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_PqjeQFSXEemyTotpzKBrqw"
	 */
	deleteEnvioErrorCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_RMhAQFSXEemyTotpzKBrqw"
	 */
	updateEnvioCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_RNaYIFSXEemyTotpzKBrqw"
	 */
	updateEnvioErrorCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_RNaYIVSXEemyTotpzKBrqw"
	 */
	readEnvioCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_ROTwAFSXEemyTotpzKBrqw"
	 */
	readEnvioErrorCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_RRoJwFSXEemyTotpzKBrqw"
	 */
	readAllEnvioCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_RS-NkFSXEemyTotpzKBrqw"
	 */
	readAllEnvioErrorCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_RTt0cFSXEemyTotpzKBrqw"
	 */
	createVentasCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_RTt0cVSXEemyTotpzKBrqw"
	 */
	createVentasErrorCommand,
	
	readByIDVentasErrorCommand,

	readByIDVentasCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_RX5J0FSXEemyTotpzKBrqw"
	 */
	deleteVentasCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_RYCTwFSXEemyTotpzKBrqw"
	 */
	deleteVentasErrorCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_RYCTwVSXEemyTotpzKBrqw"
	 */
	updateVentasCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_RYCTwlSXEemyTotpzKBrqw"
	 */
	updateVentasErrorCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_RYMEwFSXEemyTotpzKBrqw"
	 */
	readVentasCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_RYMEwVSXEemyTotpzKBrqw"
	 */
	readVentasErrorCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_RcqVEFSXEemyTotpzKBrqw"
	 */
	readAllVentasCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_RczfAFSXEemyTotpzKBrqw"
	 */
	readAllVentasErrorCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_RczfAVSXEemyTotpzKBrqw"
	 */
	createPersonalCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_RhH-UFSXEemyTotpzKBrqw"
	 */
	createPersonalErrorCommand,
	
	readByIDPersonalErrorCommand,

	readByIDPersonalCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_RhH-UVSXEemyTotpzKBrqw"
	 */
	deletePersonalCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_RhRvUFSXEemyTotpzKBrqw"
	 */
	deletePersonalErrorCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_RlN0IFSXEemyTotpzKBrqw"
	 */
	updatePersonalCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_RlhWIFSXEemyTotpzKBrqw"
	 */
	updatePersonalErrorCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_Rp11cFSXEemyTotpzKBrqw"
	 */
	readPersonalCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_Rp11cVSXEemyTotpzKBrqw"
	 */
	readPersonalErrorCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_Rp-_YFSXEemyTotpzKBrqw"
	 */
	readAllPersonalCommand,
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_Rp-_YVSXEemyTotpzKBrqw"
	 */
	readAllPersonalErrorCommand, 
	
	crearVentanaCliente,
	crearVentanaVentas,
	crearVentanaProductos,
	crearVentanaEnvios,
	crearVentanaPersonal,
	crearVentanaProveedores,
	
	readByNombreProductosCommand,
	
	
	
	
	
	INIT, readByNombreProductoCommand, ErrorCommand, VistaCliente, VentanaCliente;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_rH8SYFSVEemyTotpzKBrqw"
	*/
	private Object atributo1;

	/** 
	* @return the atributo1
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_rH8SYFSVEemyTotpzKBrqw?GETTER"
	*/
	public Object getAtributo1() {
		// begin-user-code
		return atributo1;
		// end-user-code
	}

	/** 
	* @param atributo1 the atributo1 to set
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_rH8SYFSVEemyTotpzKBrqw?SETTER"
	*/
	public void setAtributo1(Object atributo1) {
		// begin-user-code
		this.atributo1 = atributo1;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_rnmp4FSVEemyTotpzKBrqw"
	*/
	private Object atributo2;

	/** 
	* @return the atributo2
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_rnmp4FSVEemyTotpzKBrqw?GETTER"
	*/
	public Object getAtributo2() {
		// begin-user-code
		return atributo2;
		// end-user-code
	}

	/** 
	* @param atributo2 the atributo2 to set
	* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_rnmp4FSVEemyTotpzKBrqw?SETTER"
	*/
	public void setAtributo2(Object atributo2) {
		// begin-user-code
		this.atributo2 = atributo2;
		// end-user-code
	}
}