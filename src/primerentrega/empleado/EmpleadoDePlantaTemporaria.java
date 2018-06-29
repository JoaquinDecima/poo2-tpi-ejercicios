package primerentrega.empleado;

import java.util.Date;

import primerentrega.recibodehaberes.ReciboDeHaberes;

public class EmpleadoDePlantaTemporaria extends Empleado {
	private java.util.Date fechaDeFin;
	private int cantHorasExtras;
	
	// Retorna la fecha de Fin de Actividad
	@SuppressWarnings("unused")
	private java.util.Date getFechaFin(){
		return (fechaDeFin);
	}
	
	// Retorna las Horas Extras
	@SuppressWarnings("unused")
	private int getCantHorasExtras() {
		return (cantHorasExtras);
	}
	
	// Retorna el Sueldo Bruto
	public int getSueldoBruto() {
		return(this.sueldoBasico + 40 * this.cantHorasExtras);
	}
	
	// Retorna los Aportes
	private int getAportes() {
		return(this.getSueldoBruto() / 10 + 5 * this.cantHorasExtras);
	}
	
	// Retorna las Retenciones
	public int getRetenciones() {
		return (this.getObraSocial() + this.getAportes());
	}
	
	//Retorna Obra Social
	private int getObraSocial() {
		int obraRet;
		obraRet = this.getSueldoBruto() / 10;
		if (this.esMayorA50()) {
			obraRet = obraRet + 25;
		}
		return(obraRet);
	}
	
	// Retorna True si es myor a 50
	@SuppressWarnings("deprecation")
	private boolean esMayorA50 () {
		java.util.Date hoy = new Date();
		return((hoy.getYear() - this.fechaDeNacimiento.getYear())> 50);
	}

	// Setea el Desglose
	public void setDesglose(ReciboDeHaberes recibo) {
		recibo.addConcepto("Sueldo Basico", this.getSueldoBasico());
		recibo.addConcepto("Horas Extras", (40 * this.cantHorasExtras));
		recibo.addConcepto("Aportes", (0 - this.getAportes()));
		recibo.addConcepto("Obra Social", (0 - this.getObraSocial()));
	}
}
