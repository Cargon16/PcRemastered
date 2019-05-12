/**
 * 
 */
package Negocio.Envios;

import java.util.ArrayList;

import Integracion.Envios.TEnvio;
import Integracion.Factorias.FactoriaIntegracion;
import Integracion.Ventas.TVentas;

public class SAEnvioImp implements SAEnvio {
	
	public int create(TEnvio tEnvio) {
		int retorno= -1;
		TVentas v = FactoriaIntegracion.getInstance().crearDaoVenta().readbyID(tEnvio.getIdVenta());
		if(v != null){
			if(v.getPagado()){
				retorno = FactoriaIntegracion.getInstance().crearDaoEnvios().create(tEnvio);
			}
		}
		return retorno;
	
	}

	
	public TEnvio readByID(int id) {
		return FactoriaIntegracion.getInstance().crearDaoEnvios().readByID(id);
	}


	public ArrayList<TEnvio> readAll() {
		return FactoriaIntegracion.getInstance().crearDaoEnvios().readAll();
	}

	
	public int update(TEnvio tEnvio) {
		int retorno= -1;
		TEnvio e = FactoriaIntegracion.getInstance().crearDaoEnvios().readByID(tEnvio.getID());
		if(e != null){
			retorno = FactoriaIntegracion.getInstance().crearDaoEnvios().update(tEnvio);
		}
		
		return retorno;
	}

	
	public int delete(int id) {
		int retorno= -1;
		TEnvio e = FactoriaIntegracion.getInstance().crearDaoEnvios().readByID(id);
		if(e != null){
			if(e.isEstado())
			retorno = FactoriaIntegracion.getInstance().crearDaoEnvios().delete(id);
			else retorno = -2;
		}
		
		return retorno;
	}
}