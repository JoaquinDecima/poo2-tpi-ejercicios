package primerentrega.empresa;

import java.util.ArrayList;
import java.util.List;
import primerentrega.empleado.*;
import primerentrega.recibodehaberes.ReciboDeHaberes;

public class Empresa {
	private int cuit;											// CUIT de la Empresa en INT
	private String nombre;										// Nombre de la Empresa en Char
	private List<Empleado> empleados = new ArrayList<Empleado>();		// Lista de Empleados

	// Constructor del Objeto
	public Empresa(int iCuit, String sNombre) {
		this.cuit = iCuit;
		this.nombre = sNombre;		
	}
	
	// Agrega un empleado a la Empresa
	@SuppressWarnings("unused")
	private void addEmpleado(Empleado emp) {
		empleados.add(emp);
	}
	
	// Retorna la cantidad de empleados de la empresa
	@SuppressWarnings("unused")
	private int cantEmpleados() {
		return (empleados.size());
	}
	
	// Retorna el CUIT de la Empresa
	@SuppressWarnings("unused")
	private int getCUIT() {
		return (cuit);
	}
	
	// Retorna el nombre de la Empresa
	@SuppressWarnings("unused")
	private String getNombre() {
		return(nombre);
	}
	
	// Retorna el Total de Los sueldos Netos de Sus empleados
	public int getTotalSueldosNetos() {
		int netos = 0;
		for (Empleado e : this.empleados)
			netos += e.getSueldoNeto();
		return(netos);
	}
	
	// Retorna el Total de Los sueldos Brutos de Sus empleados
	public int getTotalSueldosBrutos() {
		int brutos = 0;
		for (Empleado e : this.empleados)
			brutos += e.getSueldoBruto();
		return(brutos);
	}
	
	// Retorna el Total de Las Retenciones de Sus empleados
	public int getTotalRetenciones() {
		int ret = 0;
		for (Empleado e : this.empleados)
			ret += e.getRetenciones();
		return(ret);
	}
	
	//Crea el recibo
	private ReciboDeHaberes createRecibo(Empleado e) {
		ReciboDeHaberes recibo = new ReciboDeHaberes(e.getNombre(), e.getDireccion(), e.getSueldoBruto(), e.getSueldoNeto());
		e.setDesglose(recibo);
		return(recibo);
	}
	
	//Genera los recibos de sueldo
	public void generarRecibos() {
		for (Empleado e : this.empleados)
			e.addRecibo(this.createRecibo(e));
	}
}
