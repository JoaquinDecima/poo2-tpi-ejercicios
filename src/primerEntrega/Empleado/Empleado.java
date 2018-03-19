package primerEntrega.Empleado;

import java.sql.Date;

public class Empleado {
	char nombre;
	char direccion;
	boolean estadoCivil = false;
	java.sql.Date fechaDeNacimiento;
	int sueldoBasico;
	
	// Retorna Nombre de Empleado
	private char getNombre() {
		return(nombre);
	}
	
	// Retorna la direccion del Empleado
	private char getDireccion() {
		return(direccion);
	}
	
	// Retorna True si el Empleado esta Casado
	protected boolean estaCasado() {
		return(estadoCivil);
	}
	
	// El estado civil cambia a True
	private void seCaso() {
		estadoCivil = true;
	}
	
	// El estado Civil cambia a False
	private void seDivercio() {
		estadoCivil = false;
	}
	
	// Retorna la Fecha de Nacimiento
	private java.sql.Date getFechaDeNacimiento(){
		return (fechaDeNacimiento);
	}
	
	// Retorna el sueldo basico de un Empleado
	protected int getSueldoBasico() {
		return (sueldoBasico);
	}
}
