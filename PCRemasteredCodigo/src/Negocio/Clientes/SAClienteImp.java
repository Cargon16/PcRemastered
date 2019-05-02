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
		// comprobar que el DNI no existe es decir readBYDNI y que retorne null;
		// si no existe introduce el cliente.
		return FactoriaIntegracion.getInstance().crearDaoCliente().create(cliente);
	
	}
	
	public TCliente read(int id) {
		// no tiene negocio como tal.
		return FactoriaIntegracion.getInstance().crearDaoCliente().readByID(id);
	}

	
	public ArrayList<TCliente> readAll() {
		// no tiene ngocio como tal
		return FactoriaIntegracion.getInstance().crearDaoCliente().readAll();
	}

	public int update(TCliente tCliente) {
		// 
		return FactoriaIntegracion.getInstance().crearDaoCliente().update(tCliente);
	}

	public int delete(int id) {
		int retorno =-1;
		TCliente cliente = FactoriaIntegracion.getInstance().crearDaoCliente().readByID(id);
		// haces un read del id , y compruebas que tCliente esta activo 
		if (cliente != null ){
			if(cliente.isActivo()){ 
				retorno = FactoriaIntegracion.getInstance().crearDaoCliente().delete(id);
			}
			else retorno = -2;	// existe el cliente	
		}
		return retorno;
	}

	public TCliente readByDNI(String DNI) {
		// no tiene negocio
		return FactoriaIntegracion.getInstance().crearDaoCliente().readByDNI(DNI);
	}


}