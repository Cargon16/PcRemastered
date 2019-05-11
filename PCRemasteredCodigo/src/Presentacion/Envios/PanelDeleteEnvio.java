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

import Presentacion.Ventana;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;

public class PanelDeleteEnvio extends JPanel implements Ventana{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JButton btnNewButton;
	/**
	 * Create the panel.
	 */
	
	public PanelDeleteEnvio(){
		initComponent();
	}
	
	public void initComponent() {
		setLayout(null);
		setOpaque(false);
		textField = new JTextField();
		textField.setBounds(57, 95, 250, 35);
		add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("Eliminar");
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
		
		JLabel lblIntroduceElId = new JLabel("Introduce el Id para eliminar ese env�o");
		lblIntroduceElId.setBounds(71, 61, 221, 16);
		add(lblIntroduceElId);
		
		JLabel lblEliminarEnvio = new JLabel("ELIMINAR ENV�O");
		lblEliminarEnvio.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEliminarEnvio.setBounds(104, 26, 140, 35);
		add(lblEliminarEnvio);
	}
	@Override
	public void Actualizar(Contexto contexto) {
		// TODO Auto-generated method stub
		
	}
	
	public void resetCamps(){
		textField.setText(null);
		
		
	}
}