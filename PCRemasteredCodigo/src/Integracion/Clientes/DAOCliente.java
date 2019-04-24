/**
 * 
 */
package Integracion.Clientes;

import java.util.ArrayList;


public interface DAOCliente {

	public Integer create(TCliente tCliente);
	public TCliente readByID(int id);
	public ArrayList<TCliente> readAll();
	public int update(TCliente tCliente);
	public int delete(int id);
	public TCliente readByDNI(String DNI);
}