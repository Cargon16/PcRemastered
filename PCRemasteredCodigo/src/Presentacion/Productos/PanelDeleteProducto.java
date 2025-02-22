/**
 * 
 */
package Presentacion.Productos;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Negocio.ComprobadorSintactico.ComprobadorSintactico;
import Presentacion.Ventana;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;
import java.awt.SystemColor;


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
		butonEliminar.setBackground(SystemColor.textHighlight);
		butonEliminar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try{
					if(ComprobadorSintactico.getInstance().isNumeric(text.getText())){
						Contexto contexto = new Contexto(Evento.deleteProductoCommand, text.getText());
						Controller.getInstance().ejecutar(contexto);
					}else{
						JOptionPane.showMessageDialog(null, "Datos incorrectos, el ID a eliminar debe ser un numero");
					}
					
				

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