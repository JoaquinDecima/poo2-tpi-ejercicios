package terceraentrega.productos;

public class ProductoPrimeraNecesidad extends Producto {

	public ProductoPrimeraNecesidad(String sNombre, Double dAlgo) {
		super(sNombre, dAlgo);
	}
	
	public ProductoPrimeraNecesidad(String sNombre, Double dAlgo, boolean bol) {
		super(sNombre, dAlgo, bol);
		// TODO Auto-generated constructor stub
	}
	
	public Double getPrecio() {
		return (this.precio * 0.9);
	}
}
