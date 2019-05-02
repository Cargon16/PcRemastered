/**
 * 
 */
package Presentacion.Envios;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Integracion.Clientes.TCliente;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;

public class PanelDeleteEnvio extends JPanel{
	private JTextField textField;
	private Controller ap;
	private TCliente c;
	/**
	 * Create the panel.
	 */
	public PanelDeleteEnvio() {
		setLayout(null);
		setOpaque(false);
		textField = new JTextField();
		textField.setBounds(57, 95, 250, 35);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Eliminar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try{
				Contexto contexto = new Contexto(Evento.deleteEnvioCommand, textField.getText());
				Controller.getInstance().ejecutar(contexto);
			}
			catch(Exception ex){;}
			}	
		});
		btnNewButton.setBounds(57, 143, 250, 42);
		add(btnNewButton);
		
		JLabel lblIntroduceElId = new JLabel("Introduce el Id para eliminar ese envío");
		lblIntroduceElId.setBounds(71, 61, 221, 16);
		add(lblIntroduceElId);
		
		JLabel lblEliminarEnvio = new JLabel("ELIMINAR ENVÍO");
		lblEliminarEnvio.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEliminarEnvio.setBounds(104, 26, 140, 35);
		add(lblEliminarEnvio);
	}
}