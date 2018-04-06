package terceraentrega;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import terceraentrega.productos.ProductoPrimeraNecesidad;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad arroz;
	
	@Before
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, 10d, false);
		arroz = new ProductoPrimeraNecesidad("Arroz", 10d, 11d, false);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(new Double(7.2), leche.getPrecio());
		assertEquals(new Double(8.9), arroz.getPrecio());
	}
	
	
}
