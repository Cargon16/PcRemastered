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
		button = new JButton("OK");
		button.setBounds(370, 36, 262, 57);
		add(button);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(72, 37, 276, 56);
		add(textField);
		textArea = new JTextArea();
		JScrollPane scroll = new JScrollPane(textArea);
	    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	    scroll.setVisible(true);
	    scroll.setBounds(83, 136, 522, 281);
	    add(scroll);
	    textArea.setVisible(false);
	    textArea.setEditable(false);
	
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
		if(c.isActivo().toString()== "true")
			s= "activo";
		else s= "no activo";
		textArea.setText("DNI:		"+ c.getDNI() + "\n" + "Nombre:		" +c.getNombre() +"\n" + "Nº de Telefono:		"+c.getTelefono() + "\n" + "Estado:		"+s+  "\n" );
		
		
	}
}