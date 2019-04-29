/**
 * 
 */
package Negocio.Personal;

import Integracion.Personal.TPersonal;

import java.util.ArrayList;


public interface SAPersonal {
	
	public int create(TPersonal TPersonal);

	public TPersonal read(int id);

	public ArrayList<TPersonal> readAll();

	public int update(TPersonal tPersonal);

	public int delete(int id);
}