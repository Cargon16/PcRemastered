/**
 * 
 */
package Presentacion.Personal;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Integracion.Personal.TPersonal;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author nacho710
* @uml.annotations
*     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_3tNosE8iEemfNOmfBQSQBw"
* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_3tNosE8iEemfNOmfBQSQBw"
*/
public class PanelDeletePersonal extends JPanel {
	private JTextField textField;
	private Controller ap;
	private TPersonal c;
	/**
	 * Create the panel.
	 */
	public PanelDeletePersonal() {
		setLayout(null);
		setOpaque(false);
		textField = new JTextField();
		textField.setBounds(46, 95, 250, 35);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Eliminar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try{
				Contexto contexto = new Contexto(Evento.deletePersonalCommand, textField.getText());
				Controller.getInstance().ejecutar(contexto);
			}
			catch(Exception ex){;}
			}	
		});
		btnNewButton.setBounds(46, 144, 250, 42);
		add(btnNewButton);
		
		JLabel lblIntroduceElId = new JLabel("Introduce el Id para eliminar el empleado");
		lblIntroduceElId.setBounds(46, 66, 237, 16);
		add(lblIntroduceElId);
		
		JLabel lblEliminarEnvio = new JLabel("ELIMINAR EMPLEADO");
		lblEliminarEnvio.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEliminarEnvio.setBounds(78, 26, 178, 35);
		add(lblEliminarEnvio);
	}
}