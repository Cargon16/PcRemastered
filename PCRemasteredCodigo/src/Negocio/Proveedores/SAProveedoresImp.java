/**
 * 
 */
package Negocio.Proveedores;

import java.util.ArrayList;

import Integracion.Factorias.FactoriaIntegracion;
import Integracion.Proveedores.TProveedores;

public class SAProveedoresImp implements SAProveedores {
	
	public int create(TProveedores tproveedor) {
		return FactoriaIntegracion.getInstance().crearDaoProveedroes().create(tproveedor);
	}

	public TProveedores read(int id) {
		return FactoriaIntegracion.getInstance().crearDaoProveedroes().readByID(id);
	}

	
	public ArrayList<TProveedores> readAll() {
		return FactoriaIntegracion.getInstance().crearDaoProveedroes().readAll();
	}

	public int update(TProveedores tproveedor) {
		return FactoriaIntegracion.getInstance().crearDaoProveedroes().update(tproveedor);
	}

	public int delete(int id) {
		return FactoriaIntegracion.getInstance().crearDaoProveedroes().delete(id);
	}
}