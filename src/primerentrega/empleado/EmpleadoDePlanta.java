package primerentrega.empleado;

import primerentrega.recibodehaberes.ReciboDeHaberes;

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
		return(this.getSueldoBasico() + 150 * this.getCantDeHijos() + 50 * this.getAntiguedad() + this.getAdicionalPorMatrimonio());
	}
	
	// Retorna retencion por Obra social
	private int getObraSocial() {
		return (this.getSueldoBruto() / 10 + 20 * this.cantDeHijos);
	}
	
	private int getAdicionalPorMatrimonio() {
		int bruto = 0;
		if(this.estaCasado()) {
			bruto = 100;
		}
		return(bruto);
	}
	
	// Retorna retencion por Aportes
	private int getAportes() {
		return(this.getSueldoBruto() * 15 /100);
	}
	
	// Retorna las Retenciones
	public int getRetenciones() {
		return (this.getObraSocial() + this.getAportes());
	}
	
	// Setea el Desglose
		public void setDesglose(ReciboDeHaberes recibo) {
			recibo.addConcepto("Sueldo Basico", this.getSueldoBasico());
			recibo.addConcepto("Asignacion Por Hijo", (150 * this.cantDeHijos));
			recibo.addConcepto("Antiguedad", (50 * this.getAntiguedad()));
			recibo.addConcepto("Adicional por Matrimoño", (this.getAdicionalPorMatrimonio()));
			recibo.addConcepto("Aportes", (0 - this.getAportes()));
			recibo.addConcepto("Obra Social", (0 - this.getObraSocial()));
		}
}
