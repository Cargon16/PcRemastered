/**
 * 
 */
package Presentacion.Clientes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import Integracion.Clientes.TCliente;
import Presentacion.Ventana;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;
import javax.swing.JLabel;
import java.awt.Font;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author nacho710
* @uml.annotations
*     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_-Ep7QFOpEemH9v7SOzgnzQ"
* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_-Ep7QFOpEemH9v7SOzgnzQ"
*/
public class PanelReadByIdClientes extends JPanel implements Ventana{
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JButton button;
	private JTextArea textArea ;
	/**
	 * Create the panel.
	 */
	public PanelReadByIdClientes() {
		setLayout(null);
		setOpaque(false);
		button = new JButton("Buscar Cliente");
		button.setBounds(434, 68, 171, 42);
		add(button);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(83, 68, 339, 42);
		add(textField);
		textArea = new JTextArea();
		JScrollPane scroll = new JScrollPane(textArea);
	    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	    scroll.setVisible(true);
	    scroll.setBounds(83, 136, 522, 281);
	    add(scroll);
	    textArea.setVisible(false);
	    textArea.setEditable(false);
	    
	    JLabel lblIntroduceElId = new JLabel("Introduce el ID");
	    lblIntroduceElId.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblIntroduceElId.setBounds(83, 45, 110, 16);
	    add(lblIntroduceElId);
	
	    button.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	//	textArea.setVisible(true);
	    		TCliente c;
	    		Contexto contexto = new Contexto (Evento.readClienteCommand,Integer.valueOf(textField.getText()));
	    		Controller.getInstance().ejecutar(contexto);

	    	}
	    });

	}
	@Override
	public void Actualizar(Contexto contexto) {
		textArea.setVisible(true);
		String s = null;
		TCliente c = (TCliente) contexto.getDatos();
		if(c.isActivo())
			s= "Activo";
		else s= "No activo";
		textArea.setText("DNI: "+ c.getDNI() + "\n" + "Nombre: " +c.getNombre() +"\n" + "Numero de telefono: "+c.getTelefono() + "\n" + "Direccion: " + c.getDireccion()+ "\n" +"Estado: "+s+  "\n" );
		
		
	}
}