package primerEntrega.Empresa;

import java.util.List;

import primerEntrega.Empleado.Empleado;

import java.util.ArrayList;

public class Empresa {
	private int cuit;								// CUIT de la Empresa en INT
	private String nombre;							// Nombre de la Empresa en Char
	private List empleados = new ArrayList();		// Lista de Empleados

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
}
