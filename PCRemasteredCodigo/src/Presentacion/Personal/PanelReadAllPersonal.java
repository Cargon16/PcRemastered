/**
 * 
 */
package Presentacion.Personal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

import Integracion.Personal.TPersonal;
import Presentacion.Ventana;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;
import java.awt.SystemColor;


public class PanelReadAllPersonal extends JPanel implements Ventana {

	private static final long serialVersionUID = 1L;
	private JButton button;
	private JTextArea textArea;
	private JScrollPane scroll;


	public PanelReadAllPersonal(){

		initComponent();
	}


	public void initComponent() {
		setLayout(null);
		setOpaque(false);

		button = new JButton("Ver los empleados");
		button.setBackground(SystemColor.textHighlight);
		button.setBounds(208, 36, 262, 57);
		add(button);

		textArea = new JTextArea();

		scroll = new JScrollPane(textArea);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setVisible(true);
		scroll.setBounds(83, 136, 522, 281);

		add(scroll);
		textArea.setVisible(false);
		textArea.setEditable(false);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setVisible(true);
				try {
					Contexto contexto = new Contexto(Evento.readAllPersonalCommand, null);
					Controller.getInstance().ejecutar(contexto);
					
				} catch (Exception ex) {;}
			}

		});

	}


	@SuppressWarnings("unchecked")
	@Override
	public void Actualizar(Contexto contexto) {
		// TODO Auto-generated method stub
		ArrayList<TPersonal> array = new ArrayList<TPersonal>();
		array = (ArrayList<TPersonal>) contexto.getDatos();
		String texto = "";
		for (TPersonal c : array) {
			String s = null;
			if (c.isActivo())
				s = "En nomina";
			else
				s = "Despedido";
			texto = texto + "ID: " + c.getID() + "\n" + "Nombre: " + c.getNombre() + "\n"  + "Salario: " + c.getSalario() + " euros\n"  + "Telefono: " + c.getTelefono() + "\n"  + "Estado: " + s + "\n\n";

		}
		textArea.setText(texto);
		
	}
	
	public void resetCamps(){
		textArea.setText(null);
	}
}