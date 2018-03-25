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
	
	// Retorna Cantidad de Immpares
	public int getEvenOcurrences() {
		int count = 0;
		for(Integer num : this.numeros)
			if(this.esPar(num)) 
				count += 1;
		return(count);
	}
	
	// Retorna cantidad de Pares
	public int getOddOcurrences() {
		int count = 0;
		for(Integer num : this.numeros)
			if(! this.esPar(num)) 
				count += 1;
		return(count);
	}
	
	// Retorna True si es numero es multipo de Num
	private boolean numEsMultiploDe(Integer num, int divisor) {
		return (num%divisor==0);
	}
	
	// Rertorna la cantidad de numeros multiplos de X
	public int catDeMultiplosDe(int numero) {
		int cant = 0;
		for (Integer num : this.numeros)
			if (this.numEsMultiploDe(num, numero))
				cant += 1;
		return (cant);
	}
}
