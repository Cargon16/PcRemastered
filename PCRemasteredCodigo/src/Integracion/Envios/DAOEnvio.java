
package Integracion.Envios;

import java.util.ArrayList;

public interface DAOEnvio {

	public Integer create(TEnvio envio);


	public TEnvio readByID(int id);


	public ArrayList<TEnvio> readAll();


	public int update(TEnvio envio);


	public int delete(int id);
}