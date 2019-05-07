/**
 * 
 */
package Negocio.Clientes;

import java.util.ArrayList;

import Integracion.Clientes.TCliente;
import Integracion.Factorias.FactoriaIntegracion;


public class SAClienteImp implements SACliente {
	
	public int create(TCliente cliente) {
		int retorno= -1; 
		TCliente c = FactoriaIntegracion.getInstance().crearDaoCliente().readByDNI(cliente.getDNI());
		if ( c == null){ //existe el DNI
			retorno = FactoriaIntegracion.getInstance().crearDaoCliente().create(cliente);
		}	
		return retorno;
		// -1 ya existe el DNI
	 	// other - id del cliente creado:
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
		// comprobar que el cliente existe -- ReaDByDNI
		 
		TCliente c = FactoriaIntegracion.getInstance().crearDaoCliente().readByDNI(tCliente.getDNI());
		if (c==null){
			return FactoriaIntegracion.getInstance().crearDaoCliente().update(tCliente);
		}
		return -1;
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