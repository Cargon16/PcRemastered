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
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Integracion.Clientes.TCliente;
import Integracion.Personal.TPersonal;
import Presentacion.Ventana;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author nacho710
* @uml.annotations
*     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20dise√±o.emx#_3TPpgE8iEemfNOmfBQSQBw"
* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20dise√±o.emx#_3TPpgE8iEemfNOmfBQSQBw"
*/
public class PanelAddPersonal extends JPanel implements Ventana{
	private static final long serialVersionUID = 1L;

	private JTextField passText;
	private JTextField nombreText;
	private JTextField telefonoText;
	private JTextField salarioText;
	public PanelAddPersonal(){
		setLayout(null);
		setOpaque(false);

		nombreText = new JTextField();
		nombreText.setColumns(10);
		nombreText.setBounds(109, 58, 279, 57);
		add(nombreText);

		JLabel label_1 = new JLabel("Nombre");
		label_1.setBounds(37, 79, 75, 14);
		add(label_1);

		passText = new JTextField();
		passText.setColumns(10);
		passText.setBounds(109, 128, 279, 57);
		add(passText);

		JLabel label = new JLabel("ContraseÒa");
		label.setBounds(37, 149, 75, 14);
		add(label);
		
		telefonoText = new JTextField();
		telefonoText.setColumns(10);
		telefonoText.setBounds(109, 198, 279, 57);
		add(telefonoText);

		JLabel label_2 = new JLabel("Telefono");
		label_2.setBounds(37, 219, 75, 14);
		add(label_2);
		
		
		salarioText = new JTextField();
		salarioText.setColumns(10);
		salarioText.setBounds(109, 268, 279, 57);
		add(salarioText);
		
		JLabel labelDIreccion = new JLabel("Salario");
		labelDIreccion.setBounds(37, 289, 75, 14);
		add(labelDIreccion);

		JRadioButton activoRB = new JRadioButton("Activo");
		activoRB.setToolTipText("Activo");
		activoRB.setBounds(141, 350, 109, 23);
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

		inactivoRB.setBounds(241, 350, 109, 23);
		inactivoRB.setOpaque(false);
		add(inactivoRB);
		inactivoRB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inactivoRB.setSelected(true);
				activoRB.setSelected(false);
			}
		});
		JButton button = new JButton("AÒadir");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean ok = false ;
				if(activoRB.isSelected()) 
					ok = true;
				TPersonal personal = new TPersonal(passText.getText(), ok, Double.valueOf(salarioText.getText()), null, Integer.valueOf(telefonoText.getText()), nombreText.getText());
				Contexto contexto = new Contexto(Evento.createPersonalCommand, personal);
				Controller.getInstance().ejecutar(contexto);
				
			}
		});
		button.setBounds(151, 382, 132, 40);
		add(button);
		
		JLabel lblAadirCliente = new JLabel("A\u00D1ADIR PERSONAL");
		lblAadirCliente.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAadirCliente.setBounds(37, 13, 162, 32);
		add(lblAadirCliente);
		
		
	}
	@Override
	public void Actualizar(Contexto contexto) {
		// TODO Auto-generated method stub
		
	}
}