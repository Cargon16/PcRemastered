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

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author nacho710
* @uml.annotations
*     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_-Ep7QFOpEemH9v7SOzgnzQ"
* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_-Ep7QFOpEemH9v7SOzgnzQ"
*/
public class PanelReadByIdClientes extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JButton button;
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
		JTextArea textArea = new JTextArea();
		JScrollPane scroll = new JScrollPane(textArea);
	    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	    scroll.setVisible(true);
	    scroll.setBounds(83, 136, 522, 281);
	    add(scroll);
	    textArea.setVisible(false);
	    textArea.setEditable(false);
	
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 textArea.setVisible(true);
				TCliente c;
				try {
					c = (TCliente) ApplicationController.getInstance().ejecutar(Integer.valueOf(textField.getText()), Evento.MostrarClienteCommand.getValor());
					String s = null;
					if(c.getActivo().toString()== "true")
						s= "activo";
					else s= "no activo";
					textArea.setText("DNI:		"+ c.getDNI() + "\n" + "Nombre:		" +c.getNombre() +"\n" + "Nº de Telefono:		"+c.getTelefono() + "\n" + "Estado:		"+s+  "\n" );
					
				
				} catch ( Exception ex) {
					try {
						ApplicationController.getInstance().ejecutar("ID no encontrado", Evento.MostrarMensajeCommand.getValor());
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			}
		});

	}
}