package primerEntrega;

import java.sql.Date;

public class EmpleadoDePlantaTemporaria extends Empleado {
	java.sql.Date fechaDeFin;
	int cantHorasExtras;
	
	// Retorna la fecha de Fin de Actividad
	private java.sql.Date getFechaFin(){
		return (fechaDeFin);
	}
	
	// Retorna las Horas Extras
	private int getCantHorasExtras() {
		return (cantHorasExtras);
	}
}
