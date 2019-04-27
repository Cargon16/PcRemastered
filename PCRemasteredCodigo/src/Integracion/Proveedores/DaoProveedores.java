
package Integracion.Proveedores;

import java.util.ArrayList;

public interface DaoProveedores {
	
	public Integer create(TProveedores tProveedor);
	
	public TProveedores readByID(int id);

	public ArrayList<TProveedores> readAll();

	public int update(TProveedores tProveedor);

	public int delete(int id);
	
}