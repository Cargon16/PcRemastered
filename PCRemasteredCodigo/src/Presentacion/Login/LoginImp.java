package Presentacion.Login;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Integracion.Personal.TPersonal;
import Negocio.ComprobadorSintactico.ComprobadorSintactico;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;
import java.awt.SystemColor;

public class LoginImp extends Login{
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

	public LoginImp() {
		
		initComponents();
	}

	private void initComponents() {
		
		ImageIcon imageIcon = new ImageIcon("src/logoPc2.png"); 
		Image im = imageIcon.getImage();
		ImageIcon iconoEscalado = new ImageIcon(im.getScaledInstance(200,200,Image.SCALE_SMOOTH));
		JLabel imagen = new JLabel();
		imagen.setLocation(45, 105);
		imagen.setSize(238, 226);
		imagen.setIcon(iconoEscalado);
		getContentPane().add(imagen);
		ButtonOK = new JButton();
		ButtonOK.setBackground(SystemColor.textHighlight);
		Password = new JPasswordField();
		UserCamp = new JTextField();
		Titulo = new JLabel();
		Titulo.setBackground(SystemColor.textHighlight);
		User = new JLabel();
		Pass = new JLabel();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setMinimumSize(new Dimension(700,400));
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setBackground(SystemColor.textInactiveText);
		setVisible(true);
		ButtonOK.setText("Aceptar");
		getContentPane().add(ButtonOK);
		ButtonOK.setBounds(395,250,140,57);
		
		Pass.setFont(new Font("Tahoma",1,18));
		Pass.setText("Contrase\u00F1a");
		getContentPane().add(Pass);
		Pass.setBounds(330, 197, 150, 30);
		
		User.setFont(new Font("Tahoma",1,18));
		User.setText("Usuario");
		getContentPane().add(User);
		User.setBounds(330, 150, 160, 30);
		
		Password.setFont(new Font("Tahoma",1,18));
		getContentPane().add(Password);
		Password.setBounds(453, 197, 160, 30);
		
		UserCamp.setFont(new Font("Tahoma",1,18));
		getContentPane().add(UserCamp);
		UserCamp.setBounds(453, 150, 160, 30);
		
		Titulo.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 36));
		Titulo.setText("ACCESO A TIENDA");
		getContentPane().add(Titulo);
		Titulo.setBounds(168, 14, 540, 80);
		
		pack();
		
		ButtonOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// TODO Auto-generated method stub
				setVisible(false);
				
				
				if(ComprobadorSintactico.getInstance().idCorrect(UserCamp.getText()) ){
					TPersonal t= new TPersonal(String.valueOf(Password.getPassword()), false,  0.0, Integer.valueOf(UserCamp.getText()), 0, "");
					Contexto contexto = new Contexto(Evento.loginCommand, t);
					Controller.getInstance().ejecutar(contexto);
				}
				else Actualizar(null);
			}
		});
		
		
		
		
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Actualizar(Contexto contexto) {
		setVisible(true);
		JOptionPane.showMessageDialog(null, "Datos incorrectos");
		
	}

	@Override
	public void resetCamps() {
		// TODO Auto-generated method stub
		
	}
	
}
