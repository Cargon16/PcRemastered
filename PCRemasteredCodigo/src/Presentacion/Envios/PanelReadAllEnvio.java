/**
 * 
 */
package Presentacion.Envios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

import Integracion.Envios.TEnvio;
import Presentacion.Ventana;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author nacho710
 * @uml.annotations
 *     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_wfNxoFLrEemG-P2dJpE1PA"
 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_wfNxoFLrEemG-P2dJpE1PA"
 */
public class PanelReadAllEnvio extends JPanel implements Ventana{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton button;
	private JTextArea textArea;
	private JScrollPane scroll;
	
	public PanelReadAllEnvio(){
		initComponent();
	}
	
	public void initComponent() {
		setLayout(null);
		setOpaque(false);

		button = new JButton("Ver los env�os");
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
			@SuppressWarnings({ "unchecked"})
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setVisible(true);
				ArrayList<TEnvio> array = new ArrayList<TEnvio>();
				try {
					Contexto contexto = new Contexto(Evento.readAllEnvioCommand, null);
					Controller.getInstance().ejecutar(contexto);
					array = (ArrayList<TEnvio>) contexto.getDatos();
					String texto = "";
					for (TEnvio c : array) {
						String s = null;
						if (c.isEstado())
							s = "En curso";
						else
							s = "Entregado";
						texto = texto + "ID: " + c.getID() + "\n" + "Direcci�n: " + c.getDireccion() + "\n"  + "Estado: " + s + "\n\n";

					}
					textArea.setText(texto);
				} catch (Exception ex) {;}
			}

		});

	}

	@Override
	public void Actualizar(Contexto contexto) {
		// TODO Auto-generated method stub
		
	}
	
	public void resetCamps(){
		textArea.setText(null);
		
	}
}