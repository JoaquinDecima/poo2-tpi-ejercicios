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
}
