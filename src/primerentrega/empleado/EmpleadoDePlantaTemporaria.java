package primerentrega.empleado;

import java.util.Date;

public class EmpleadoDePlantaTemporaria extends Empleado {
	private java.util.Date fechaDeFin;
	private int cantHorasExtras;
	
	// Retorna la fecha de Fin de Actividad
	private java.util.Date getFechaFin(){
		return (fechaDeFin);
	}
	
	// Retorna las Horas Extras
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
	private boolean esMayorA50 () {
		java.util.Date hoy = new Date();
		return((hoy.getYear() - this.fechaDeNacimiento.getYear())> 50);
	}
}
