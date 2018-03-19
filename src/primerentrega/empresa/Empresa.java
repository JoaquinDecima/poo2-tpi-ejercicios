package primerentrega.empresa;

import java.util.ArrayList;
import java.util.List;
import primerentrega.empleado.*;

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
	private void addEmpleado(Empleado emp) {
		empleados.add(emp);
	}
	
	// Retorna la cantidad de empleados de la empresa
	private int cantEmpleados() {
		return (empleados.size());
	}
	
	// Retorna el CUIT de la Empresa
	private int getCUIT() {
		return (cuit);
	}
	
	// Retorna el nombre de la Empresa
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
}
