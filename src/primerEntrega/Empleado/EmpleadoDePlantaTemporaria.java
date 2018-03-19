package primerEntrega.Empleado;

import java.sql.Date;

public class EmpleadoDePlantaTemporaria extends Empleado {
	private java.sql.Date fechaDeFin;
	private int cantHorasExtras;
	
	// Retorna la fecha de Fin de Actividad
	private java.sql.Date getFechaFin(){
		return (fechaDeFin);
	}
	
	// Retorna las Horas Extras
	private int getCantHorasExtras() {
		return (cantHorasExtras);
	}
}
