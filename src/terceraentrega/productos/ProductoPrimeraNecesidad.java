package terceraentrega.productos;

public class ProductoPrimeraNecesidad extends Producto {
	Double descuento = 0.9d;

	public ProductoPrimeraNecesidad(String sNombre, Double dAlgo, Double dDescuento) {
		super(sNombre, dAlgo);
		descuento = (100 - dDescuento) / 100;
	}
	
	public ProductoPrimeraNecesidad(String sNombre, Double dAlgo, Double dDescuento, boolean bol) {
		super(sNombre, dAlgo, bol);
		descuento = (100 - dDescuento) / 100;
	}
	
	public Double getPrecio() {
		return (this.precio * this.descuento);
	}
}
