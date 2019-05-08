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
import sun.security.jca.GetInstance.Instance;


public abstract class Login extends JFrame implements Ventana {

	public static Login Instance = null;
	public static Login getInstance(){
		if( Instance== null)
			Instance= new LoginImp();
		return Instance;
	}
	
	
	@Override
	public void Actualizar(Contexto contexto) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	

}
