package terceraentrega.productos;

public class Producto {
	String nombre;
	boolean esPrecioCuidado = false;
	Double precio;
	
	public Producto(String sNombre, Double dAlgo, boolean bEsPrecioCuidad) {
	nombre = sNombre;
	precio = dAlgo;
	esPrecioCuidado = bEsPrecioCuidad;
	}
	
	public Producto(String sNombre, Double dAlgo) {
		nombre = sNombre;
		precio = dAlgo;
		}

	public String getNombre() {
		return (this.nombre);
	}

	public Double getPrecio() {
		return (this.precio);
	}

	public boolean esPrecioCuidado() {
		return (this.esPrecioCuidado);
	}

	public void aumentarPrecio(Double d) {
		precio += d;
	}
	
	
}
