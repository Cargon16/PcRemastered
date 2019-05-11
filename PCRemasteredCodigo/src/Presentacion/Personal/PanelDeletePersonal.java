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
import Presentacion.Ventana;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;


public class PanelDeletePersonal extends JPanel implements Ventana {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JButton btnNewButton;


	public PanelDeletePersonal(){

		initComponent();
	}
	
	public void initComponent() {
		setLayout(null);
		setOpaque(false);
		textField = new JTextField();
		textField.setBounds(46, 95, 250, 35);
		add(textField);
		textField.setColumns(10);

		btnNewButton = new JButton("Eliminar");
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

	@Override
	public void Actualizar(Contexto contexto) {
		// TODO Auto-generated method stub
		this.revalidate();
		this.repaint();
		
	}
	
	public void resetCamps(){
		
		textField.setText(null);
		
	}
}