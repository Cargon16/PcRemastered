package Presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream.GetField;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;

public abstract class  VentanaPrincipal implements Ventana {
	public static VentanaPrincipal instance = null;
	public static VentanaPrincipal getInstance() {
		if(instance==null)
			instance = new VentanaPrincipalImp();
		return instance;
	}
	 
	@Override
	public abstract void Actualizar() ;
}
