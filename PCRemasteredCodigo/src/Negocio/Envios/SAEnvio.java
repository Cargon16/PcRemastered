/**
 * 
 */
package Negocio.Envios;

import Integracion.Envios.TEnvio;

import java.util.ArrayList;
import java.util.Set;


public interface SAEnvio {

	public int create(TEnvio TEnvio);

	public TEnvio readByID(int id);

	public ArrayList<TEnvio> readAll();

	public int update(TEnvio TEnvio);

	public int delete(int id);
}