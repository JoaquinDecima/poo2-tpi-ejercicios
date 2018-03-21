package primerentrega.empleado;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import primerentrega.recibodehaberes.ReciboDeHaberes;

public abstract class Empleado {
	protected String nombre;
	protected String direccion;
	protected boolean estadoCivil = false;
	protected java.util.Date fechaDeNacimiento;
	protected int sueldoBasico;
	protected List<ReciboDeHaberes> recibos = new ArrayList<ReciboDeHaberes>();
	
	// Retorna Nombre de Empleado
	public String getNombre() {
		return(nombre);
	}
	
	// Retorna la direccion del Empleado
	public String getDireccion() {
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
	
	public abstract void setDesglose(ReciboDeHaberes recibo);
	
	public void addRecibo(ReciboDeHaberes r) {
		recibos.add(r);
	}
	
	public int getSueldoNeto() {
		return (this.getSueldoBruto() - this.getRetenciones());
	}
}
