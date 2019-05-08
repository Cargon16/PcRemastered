package Presentacion.Login;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.ListDataListener;

import Integracion.Personal.TPersonal;
import Presentacion.Ventana;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;


public class Login extends JFrame implements Ventana {
	
	
	private JButton ButtonExit;
	private JButton ButtonOK;
	private JPasswordField Password;
	private JTextField UserCamp;
	private JLabel Titulo;
	private JLabel User;
	private JLabel Pass;

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Login() {
		
		initComponents();
	}

	private void initComponents() {
		ButtonExit = new JButton();
		ButtonOK = new JButton();
		Password = new JPasswordField();
		UserCamp = new JTextField();
		Titulo = new JLabel();
		User = new JLabel();
		Pass = new JLabel();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setMinimumSize(new Dimension(700,400));
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.cyan);
		
		ButtonOK.setText("Aceptar");
		getContentPane().add(ButtonOK);
		ButtonOK.setBounds(510,250,140,90);
		
		ButtonExit.setText("Salir");
		getContentPane().add(ButtonExit);
		ButtonExit.setBounds(510, 250, 140, 90);
		
		Pass.setFont(new Font("Tahoma",1,18));
		Pass.setText("PASS");
		getContentPane().add(Pass);
		Pass.setBounds(330, 150, 150, 30);
		
		User.setFont(new Font("Tahoma",1,18));
		User.setText("USUARIO");
		getContentPane().add(User);
		User.setBounds(330, 110, 160, 30);
		
		Password.setFont(new Font("Tahoma",1,18));
		getContentPane().add(Password);
		Password.setBounds(490, 150, 160, 30);
		
		UserCamp.setFont(new Font("Tahoma",1,18));
		getContentPane().add(UserCamp);
		UserCamp.setBounds(490, 110, 160, 30);
		
		Titulo.setFont(new Font("Verdana",1,36));
		Titulo.setText("PCRemastered");
		getContentPane().add(Titulo);
		Titulo.setBounds(200, 10, 345, 80);
		
		pack();
		
		ButtonOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// TODO Auto-generated method stub
				TPersonal t= new TPersonal(String.valueOf(Password.getPassword()), false,  0.0, Integer.valueOf(UserCamp.getText()), 0, "");
				Contexto contexto = new Contexto(Evento.Login, t);
				Controller.getInstance().ejecutar(contexto);
			}
		});
		
		
		
		
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Actualizar(Contexto contexto) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
