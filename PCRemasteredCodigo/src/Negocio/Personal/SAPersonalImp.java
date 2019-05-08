/**
 * 
 */
package Negocio.Personal;

import java.util.ArrayList;

import Integracion.Envios.TEnvio;
import Integracion.Factorias.FactoriaIntegracion;
import Integracion.Personal.TPersonal;


public class SAPersonalImp implements SAPersonal {
	
	public int create(TPersonal tPersonal) {
		int retorno= -1;
		TPersonal e = FactoriaIntegracion.getInstance().crearDaoPersonal().readByID(tPersonal.getID());
		if(e == null){
			retorno = FactoriaIntegracion.getInstance().crearDaoPersonal().create(tPersonal);
		}
		
		return retorno;
	}

	public TPersonal read(int id) {
		return FactoriaIntegracion.getInstance().crearDaoPersonal().readByID(id);
	}

	public ArrayList<TPersonal> readAll() {
		return FactoriaIntegracion.getInstance().crearDaoPersonal().readAll();
	}

	public int update(TPersonal tPersonal) {
		int retorno= -1;
		TPersonal e = FactoriaIntegracion.getInstance().crearDaoPersonal().readByID(tPersonal.getID());
		if(e == null){
			retorno = FactoriaIntegracion.getInstance().crearDaoPersonal().update(tPersonal);
		}
		
		return retorno;
	}

	public int delete(int id) {
		int retorno= -1;
		TPersonal e = FactoriaIntegracion.getInstance().crearDaoPersonal().readByID(id);
		if(e == null){
			retorno = FactoriaIntegracion.getInstance().crearDaoPersonal().delete(id);
		}
		
		return retorno;
	}
}