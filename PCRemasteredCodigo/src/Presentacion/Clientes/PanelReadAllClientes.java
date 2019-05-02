/**
 * 
 */
package Presentacion.Clientes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

import Integracion.Clientes.TCliente;
import Presentacion.Ventana;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author nacho710
* @uml.annotations
*     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_B39NwFOqEemH9v7SOzgnzQ"
* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_B39NwFOqEemH9v7SOzgnzQ"
*/
public class PanelReadAllClientes extends JPanel implements Ventana {
	JButton button;
	JTextArea textArea;
	public PanelReadAllClientes() {
		setLayout(null);
		setOpaque(false);
		button = new JButton("Ver los Clientes");
		button.setBounds(208, 36, 262, 57);
		add(button);

		textArea = new JTextArea();

		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setVisible(true);
		scroll.setBounds(83, 136, 522, 281);

		add(scroll);
		textArea.setVisible(false);
		textArea.setEditable(false);
		button.addActionListener(new ActionListener() {
			
			@SuppressWarnings("unchecked")
			@Override
			public void actionPerformed(ActionEvent e) {
				Contexto contexto = new Contexto(Evento.readAllClienteCommand, 1);
				Controller.getInstance().ejecutar(contexto);
			}

		});

	}

	@Override
	public void Actualizar(Contexto contexto) {
		textArea.setVisible(true);
		ArrayList<TCliente> array = (ArrayList<TCliente>) contexto.getDatos();
		String texto = "";
		for (TCliente c : array) {
			String s = null;
			if (c.isActivo())
				s = "Activo";
			else
				s = "No activo";
			texto = texto + "ID: " + c.getID() + "\n" + "DNI: " + c.getDNI() + "\n"
					+ "Nombre: " + c.getNombre() + "\n" + "N� de Telefono: " + c.getTelefono() + "\n" +
					"Direcci�n: " + c.getDireccion() + "\n" + "Estado: " + s + "\n\n";

		}
		textArea.setText(texto);
		
	}
}