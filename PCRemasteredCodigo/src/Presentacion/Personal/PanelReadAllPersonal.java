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
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author nacho710
* @uml.annotations
*     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseÃ±o.emx#_4iMv8E8iEemfNOmfBQSQBw"
* @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseÃ±o.emx#_4iMv8E8iEemfNOmfBQSQBw"
*/
public class PanelReadAllPersonal extends JPanel {
	
	private static final long serialVersionUID = 1L;

	public PanelReadAllPersonal() {
		setLayout(null);
		setOpaque(false);

		JButton button = new JButton("Ver los empleados");
		button.setBounds(208, 36, 262, 57);
		add(button);

		JTextArea textArea = new JTextArea();

		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setVisible(true);
		scroll.setBounds(83, 136, 522, 281);

		add(scroll);
		textArea.setVisible(false);
		textArea.setEditable(false);
		button.addActionListener(new ActionListener() {
			@SuppressWarnings({ "unchecked"})
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setVisible(true);
				ArrayList<TPersonal> array = new ArrayList<TPersonal>();
				try {
					Contexto contexto = new Contexto(Evento.readAllPersonalCommand, null);
					Controller.getInstance().ejecutar(contexto);
					array = (ArrayList<TPersonal>) contexto.getDatos();
					String texto = "";
					for (TPersonal c : array) {
						String s = null;
						if (c.isActivo())
							s = "En nómina";
						else
							s = "Despedido";
						texto = texto + "ID: " + c.getID() + "\n" + "Nombre: " + c.getNombre() + "\n"  + "Salario: " + c.getSalario() + " euros\n"  + "Teléfono: " + c.getTelefono() + "\n"  + "Estado: " + s + "\n\n";

					}
					textArea.setText(texto);
				} catch (Exception ex) {;}
			}

		});

	}
}