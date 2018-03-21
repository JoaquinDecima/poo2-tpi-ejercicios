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
}
