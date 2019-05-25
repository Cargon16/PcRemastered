/**
 * 
 */
package Presentacion.Clientes;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Integracion.Clientes.TCliente;
import Presentacion.Ventana;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;
import java.awt.SystemColor;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author nacho710
 * @uml.annotations
 *     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_4CoucFOpEemH9v7SOzgnzQ"
 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_4CoucFOpEemH9v7SOzgnzQ"
 */
public class PanelDeleteClientes extends JPanel implements Ventana {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JButton btnNewButton;


	public PanelDeleteClientes(){
		initComponent();
	}

	public void initComponent(){
		setLayout(null);
		setOpaque(false);
		textField = new JTextField();
		textField.setBounds(57, 95, 250, 35);
		add(textField);
		textField.setColumns(10);

		btnNewButton = new JButton("Eliminar");
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Contexto contexto = new Contexto(Evento.deleteClienteCommand, textField.getText());
					Controller.getInstance().ejecutar(contexto);
				
				}
				catch(Exception ex){;}
			}	
		});
		btnNewButton.setBounds(57, 143, 250, 42);
		add(btnNewButton);

		JLabel lblIntroduceElId = new JLabel("Introduce el Id para eliminar ese usuario");
		lblIntroduceElId.setBounds(57, 66, 250, 16);
		add(lblIntroduceElId);

		JLabel lblEliminarCliente = new JLabel("ELIMINAR CLIENTE");
		lblEliminarCliente.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEliminarCliente.setBounds(92, 26, 167, 35);
		add(lblEliminarCliente);
	}
	@Override
	public void Actualizar(Contexto contexto) {
		this.revalidate();
		this.repaint();

	}
	
	public void resetCamps(){
		textField.setText(null);
		
	}
}