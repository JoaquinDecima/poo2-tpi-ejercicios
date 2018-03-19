package primerentrega.empleado;

public class EmpleadoDePlanta extends Empleado {
	private int cantDeHijos;
	private int antiguedad;
	
	// Retorna la Cantidad de Hijos
	private int getCantDeHijos() {
		return (cantDeHijos);
	}
	
	// Retorna Antiguedad
	private int getAntiguedad() {
		return(antiguedad);
	}
	
	// Retorna el Sueldo Bruto
	public int getSueldoBruto() {
		int bruto;
		bruto = this.getSueldoBasico() + 150 * this.getCantDeHijos() + 50 * this.getAntiguedad();
		if(this.estaCasado()) {
			bruto = bruto + 100;
		}
		return(bruto);
	}
	
	// Retorna retencion por Obra social
	private int getObraSocial() {
		return (this.getSueldoBruto() / 10 + 20 * this.cantDeHijos);
	}
	
	// Retorna retencion por Aportes
	private int getAportes() {
		return(this.getSueldoBruto() * 15 /100);
	}
	
	// Retorna las Retenciones
	private int getRetenciones() {
		return (this.getObraSocial() + this.getAportes());
	}
}
