/**
 * 
 */
package Negocio.Personal;

import java.util.ArrayList;

import Integracion.Personal.TPersonal;


public interface SAPersonal {
	
	public int create(TPersonal TPersonal);

	public TPersonal read(int id);

	public ArrayList<TPersonal> readAll();

	public int update(TPersonal tPersonal);

	public int delete(int id);
}