/**
 * 
 */
package Negocio.Envios;

import java.util.ArrayList;

import Integracion.Envios.TEnvio;
import Integracion.Factorias.FactoriaIntegracion;

public class SAEnvioImp implements SAEnvio {
	
	public int create(TEnvio tEnvio) {
		return FactoriaIntegracion.getInstance().crearDaoEnvios().create(tEnvio);
	
	}

	
	public TEnvio readByID(int id) {
		return FactoriaIntegracion.getInstance().crearDaoEnvios().readByID(id);
	}


	public ArrayList<TEnvio> readAll() {
		return FactoriaIntegracion.getInstance().crearDaoEnvios().readAll();
	}

	
	public int update(TEnvio tEnvio) {
		return FactoriaIntegracion.getInstance().crearDaoEnvios().update(tEnvio);
	}

	
	public int delete(int id) {
		return FactoriaIntegracion.getInstance().crearDaoEnvios().delete(id);
	}
}