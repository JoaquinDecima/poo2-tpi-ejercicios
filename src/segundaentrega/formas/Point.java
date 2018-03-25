package segundaentrega.formas;

public class Point {
	private int ejeY;
	private int ejeX;

	public Point () {
		this.ejeY = 0;
		this.ejeX = 0;
	}
	
	public Point (int y, int x) {
		this.ejeY = y;
		this.ejeX = x;
	}
	
	// Retorna el Eje Y
	public int getY() {
		return(this.ejeY);
	}
	
	// Retorna el Eje X
	public int getX() {
		return(this.ejeX);
	}
	
	// Suma un punto
	public void sumarPunto(Point punto) {
		ejeY += punto.ejeY;
		ejeX += punto.ejeX;
	}
	
	// Mueve el Punto
	public void moverPunto(int y, int x) {
		this.ejeY = y;
		this.ejeX = x;
	}
}
