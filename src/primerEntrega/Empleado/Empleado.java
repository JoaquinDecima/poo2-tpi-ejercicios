package primerEntrega.Empleado;

import java.sql.Date;

public class Empleado {
	protected String nombre;
	protected String direccion;
	protected boolean estadoCivil = false;
	protected java.sql.Date fechaDeNacimiento;
	protected int sueldoBasico;
	
	// Retorna Nombre de Empleado
	private String getNombre() {
		return(nombre);
	}
	
	// Retorna la direccion del Empleado
	private String getDireccion() {
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
