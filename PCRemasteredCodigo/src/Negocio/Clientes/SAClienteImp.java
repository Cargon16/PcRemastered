/**
 * 
 */
package Negocio.Clientes;

import java.util.ArrayList;
import java.util.Set;
import Integracion.Clientes.TCliente;
import Integracion.Factorias.FactoriaIntegracion;
import Negocio.ComprobadorSintactico.ComprobadorSintactico;


public class SAClienteImp implements SACliente {
	
	public int create(TCliente cliente) {
		
		return FactoriaIntegracion.getInstance().crearDaoCliente().create(cliente);
	
	}
	
	public TCliente read(int id) {
		return FactoriaIntegracion.getInstance().crearDaoCliente().readByID(id);
	}

	
	public ArrayList<TCliente> readAll() {
		return FactoriaIntegracion.getInstance().crearDaoCliente().readAll();
	}

	public int update(TCliente tCliente) {
		return FactoriaIntegracion.getInstance().crearDaoCliente().update(tCliente);
	}

	public int delete(int id) {
		return FactoriaIntegracion.getInstance().crearDaoCliente().delete(id);
	}

	public TCliente readByDNI(String DNI) {
		return FactoriaIntegracion.getInstance().crearDaoCliente().readByDNI(DNI);
	}


}