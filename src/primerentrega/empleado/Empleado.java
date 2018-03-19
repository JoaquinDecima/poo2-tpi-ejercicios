package primerentrega.empleado;

import java.util.Date;

public abstract class Empleado {
	protected String nombre;
	protected String direccion;
	protected boolean estadoCivil = false;
	protected java.util.Date fechaDeNacimiento;
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
	private java.util.Date getFechaDeNacimiento(){
		return (fechaDeNacimiento);
	}
	
	// Retorna el sueldo basico de un Empleado
	protected int getSueldoBasico() {
		return (sueldoBasico);
	}
	
	// Retorna el Suedlo Bruto
	public abstract int getSueldoBruto();
	
	// Retorna Las Retenciones
	public abstract int getRetenciones();
	
	public int getSueldoNeto() {
		return (this.getSueldoBruto() - this.getRetenciones());
	}
}
