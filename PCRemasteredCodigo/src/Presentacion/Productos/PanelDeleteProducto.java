/**
 * 
 */
package Presentacion.Productos;

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

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author nacho710
 * @uml.annotations
 *     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_P4ykIFMOEemdZLpuw9I4eQ"
 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_P4ykIFMOEemdZLpuw9I4eQ"
 */
public class PanelDeleteProducto extends JPanel implements Ventana {




	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField text;
	private JButton butonEliminar;

	public PanelDeleteProducto(){
		initComponent();
	}

	public void initComponent(){
		setLayout(null);
		setOpaque(false);
		text = new JTextField();
		text.setBounds(57, 95, 250, 35);
		add(text);

		butonEliminar = new JButton("Eliminar");
		butonEliminar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try{
					Contexto contexto = new Contexto(Evento.deleteProductoCommand, text.getText());
					Controller.getInstance().ejecutar(contexto);

				}catch(Exception ex){;}

			}
		});

		butonEliminar.setBounds(57, 143, 250, 42);
		add(butonEliminar);

		JLabel introduceID = new JLabel("Introduce el Id para eliminar el producto");
		introduceID.setBounds(57, 66, 250, 16);
		add(introduceID);

		JLabel eliminarProducto = new JLabel("ELIMINAR PRODUCTO");
		eliminarProducto.setBounds(92, 26, 167, 35);
		eliminarProducto.setFont(new Font("Tahoma", Font.BOLD, 16));
		add(eliminarProducto);


	}

	@Override
	public void Actualizar(Contexto contexto) {
		// TODO Auto-generated method stub
		this.revalidate();
		this.repaint();

	}

	public void resetCamps(){
		text.setText(null);

	}
}