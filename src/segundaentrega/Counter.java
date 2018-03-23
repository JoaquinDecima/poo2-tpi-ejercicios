package segundaentrega;

import java.util.ArrayList;
import java.util.List;

import primerentrega.empleado.Empleado;

public class Counter {
	private List<Integer> numeros = new ArrayList<Integer>();
	
	// Agrega el numero a la lista 
	public void addNumber(Integer i) {
		this.numeros.add(i);
	}
	
	// Retorna True si es Par
	private boolean esPar(Integer num) {
		return(num%2==0);
	}
	
	public int getEvenOcurrences() {
		int count = 0;
		for(Integer num : this.numeros)
			if(this.esPar(num)) 
				count += 1;
			
		
		return(count);
	}
	
	public int getOddOcurrences() {
		int count = 0;
		for(Integer num : this.numeros)
			if(! this.esPar(num)) 
				count += 1;
			
		
		return(count);
	}

}
