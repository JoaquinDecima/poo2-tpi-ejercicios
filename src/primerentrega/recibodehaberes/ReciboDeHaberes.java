package primerentrega.recibodehaberes;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ReciboDeHaberes {
	private String nombreDelEmpleado;
	private String direccion;
	private Date fechaDeEmision = new Date();
	private int sueldoBruto;
	private int sueldoNeto;
	private Map<String, Integer> desglose = new HashMap<String, Integer>();
	
	public ReciboDeHaberes(String sNombreDelEmpleado, String sDireccion, int iSueldoBruto, int iSueldoNeto){
		this.nombreDelEmpleado = sNombreDelEmpleado;
		this.direccion = sDireccion;
		this.sueldoBruto = iSueldoBruto;
		this.sueldoNeto = iSueldoNeto;
	}
	
	// Agregar un nuevo Concepto al Desgloce
	public void addConcepto(String concepto, Integer valor) {
		desglose.put(concepto, valor);
	}
}
