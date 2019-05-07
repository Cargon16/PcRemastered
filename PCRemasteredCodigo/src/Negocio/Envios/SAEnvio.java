/**
 * 
 */
package Negocio.Envios;

import java.util.ArrayList;

import Integracion.Envios.TEnvio;


public interface SAEnvio {

	public int create(TEnvio TEnvio);

	public TEnvio readByID(int id);

	public ArrayList<TEnvio> readAll();

	public int update(TEnvio TEnvio);

	public int delete(int id);
}