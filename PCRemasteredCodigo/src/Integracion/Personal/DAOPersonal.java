/**
 * 
 */
package Integracion.Personal;

import java.util.ArrayList;

public interface DAOPersonal {

	public Integer create(TPersonal personal);
	public TPersonal readByID(int id);
	public ArrayList<TPersonal> readAll();
	public int update(TPersonal personal);
	public int delete(int id);
}