/**
 * 
 */
package Negocio.Personal;

import java.util.ArrayList;

import Integracion.Factorias.FactoriaIntegracion;
import Integracion.Personal.TPersonal;


public class SAPersonalImp implements SAPersonal {
	
	public int create(TPersonal tPersonal) {
		return FactoriaIntegracion.getInstance().crearDaoPersonal().create(tPersonal);
	}

	public TPersonal read(int id) {
		return FactoriaIntegracion.getInstance().crearDaoPersonal().readByID(id);
	}

	public ArrayList<TPersonal> readAll() {
		return FactoriaIntegracion.getInstance().crearDaoPersonal().readAll();
	}

	public int update(TPersonal tPersonal) {
		return FactoriaIntegracion.getInstance().crearDaoPersonal().update(tPersonal);
	}

	public int delete(int id) {
		return FactoriaIntegracion.getInstance().crearDaoPersonal().delete(id);
	}
}