package terceraentrega.supermercado;

import java.util.ArrayList;
import java.util.List;
import terceraentrega.productos.*;

public class Supermercado {
	String nombre;
	String direccion;
	private List<Producto> productos = new ArrayList<Producto>();
	

	public Supermercado(String sNombre, String sDireccion) {
		nombre = sNombre;
		direccion = sDireccion;
	}


	public int getCantidadDeProductos() {
		// TODO Auto-generated method stub
		return (this.productos.size());
	}


	public void agregarProducto(Producto pProducto) {
		productos.add(pProducto);
	}


	public Double getPrecioTotal() {
		Double precioTotal = 0d;
		for (Producto p : this.productos)
			precioTotal+= p.getPrecio();
		return (precioTotal);
	}
	
	

}
