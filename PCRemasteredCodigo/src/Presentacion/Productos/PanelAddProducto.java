/**
 * 
 */
package Presentacion.Productos;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Presentacion.Ventana;
import Presentacion.Command.Contexto;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author nacho710
 * @uml.annotations
 *     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_P4uSsFMOEemdZLpuw9I4eQ"
 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_P4uSsFMOEemdZLpuw9I4eQ"
 */
public class PanelAddProducto extends JPanel implements Ventana {
	


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField idText;
	private JTextField nombreText;
	private JTextField descripcionText;
	private JTextField stockText;
	private JTextField precioText;
	
	
	public PanelAddProducto(){
		
		setLayout(null);
		setOpaque(false);
		
		idText=new JTextField();
		idText.setColumns(10);
		idText.setBounds(109, 80, 279, 57);
		add(idText);
		
		JLabel labelID = new JLabel("ID ");
		labelID.setBounds(37, 101, 46, 14);
		add(labelID);
		
		nombreText = new JTextField();
		nombreText.setColumns(10);
		nombreText.setBounds(109, 148, 279, 57);
		add(nombreText);

		JLabel labelNombre = new JLabel("Nombre ");
		labelNombre.setBounds(37, 169, 75, 14);
		add(labelNombre);
		
		descripcionText = new JTextField();
		descripcionText.setColumns(10);
		descripcionText.setBounds(109, 216, 279, 57);
		add(descripcionText);

		JLabel labelDescrip = new JLabel("Descripcion");
		labelDescrip.setBounds(37, 237, 75, 14);
		add(labelDescrip);
		
		stockText = new JTextField();
		stockText.setColumns(10);
		stockText.setBounds(109, 216, 279, 57);
		add(stockText);

		JLabel labelStock = new JLabel("Stock");
		labelStock.setBounds(37, 237, 75, 14);
		add(labelStock);
		
		precioText = new JTextField();
		precioText.setColumns(10);
		precioText.setBounds(109, 216, 279, 57);
		add(precioText);

		JLabel labelPrecio = new JLabel("Precio");
		labelPrecio.setBounds(37, 237, 75, 14);
		add(labelPrecio);
		
		
		
		
		
		
		
		
		
	}
	
	@Override
	public void Actualizar(Contexto contexto) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}