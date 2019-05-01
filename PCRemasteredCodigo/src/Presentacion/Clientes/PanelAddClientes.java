/**
 * 
 */
package Presentacion.Clientes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Integracion.Clientes.TCliente;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author nacho710
 * @uml.annotations
 *     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_0zbAcFOpEemH9v7SOzgnzQ"
 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_0zbAcFOpEemH9v7SOzgnzQ"
 */
public class PanelAddClientes extends JPanel {

private static final long serialVersionUID = 1L;

private JTextField dniText;
private JTextField nombreText;
private JTextField telefonoText;
private JTextField activoText;
private JTextField direccionText;
public PanelAddClientes() {
	setLayout(null);
	setOpaque(false);
	dniText = new JTextField();
	dniText.setColumns(10);
	dniText.setBounds(49, 80, 279, 57);
	add(dniText);

	JLabel label = new JLabel("DNI");
	label.setBounds(386, 101, 46, 14);
	add(label);

	nombreText = new JTextField();
	nombreText.setColumns(10);
	nombreText.setBounds(49, 148, 279, 57);
	add(nombreText);

	JLabel label_1 = new JLabel("Nombre");
	label_1.setBounds(386, 169, 75, 14);
	add(label_1);

	telefonoText = new JTextField();
	telefonoText.setColumns(10);
	telefonoText.setBounds(49, 216, 279, 57);
	add(telefonoText);

	JLabel label_2 = new JLabel("Telefono");
	label_2.setBounds(386, 237, 75, 14);
	add(label_2);
	
	
	direccionText = new JTextField();
	direccionText.setColumns(10);
	direccionText.setBounds(49, 286, 279, 57);
	add(direccionText);
	
	JLabel labelDIreccion = new JLabel("Direccion");
	labelDIreccion.setBounds(386, 305, 75, 14);
	add(labelDIreccion);

	JRadioButton activoRB = new JRadioButton("Activo");
	activoRB.setToolTipText("Activo");
	activoRB.setBounds(59, 370, 109, 23);
	activoRB.setOpaque(false);
	JRadioButton inactivoRB = new JRadioButton("Inactivo");
	activoRB.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			inactivoRB.setSelected(false);
			activoRB.setSelected(true);
		}
	});
	add(activoRB);

	inactivoRB.setBounds(170, 370, 109, 23);
	inactivoRB.setOpaque(false);
	add(inactivoRB);
	inactivoRB.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			inactivoRB.setSelected(true);
			activoRB.setSelected(false);
		}
	});
	JButton button = new JButton("Añadir");
	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			boolean ok = false ;
			if(activoRB.isSelected()) 
				ok = true;
			TCliente cliente = new TCliente(null,dniText.getText(),nombreText.getText(),Integer.valueOf(telefonoText.getText()), direccionText.getText(), ok);
			Contexto contexto = new Contexto(Evento.createClienteCommnad, cliente);
			Controller.getInstance().ejecutar(contexto);
			
		}
	});
	button.setBounds(517, 281, 132, 62);
	add(button);
	
	
}
}	

