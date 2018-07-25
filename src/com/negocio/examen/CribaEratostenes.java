package com.negocio.examen;

public class CribaEratostenes {

	public static int[] generaCriba(int tope){
		if (tope >= 2){
			
			int dimension = tope + 1;
			
			boolean[] primo = setMatris(dimension);
			
			primo[0] = primo[1] = false;
			
			primo = findPrimos(primo, dimension);
							
			return returnOnlyPrimos(dimension, primo);
		} else {
			return new int[0];
		}		
	}
	
	private static boolean[] setMatris(int dimension) {
		
		boolean[] primo = new boolean[dimension];
		
		int indice;
		
		for (indice = 0; indice < dimension; indice++){
			primo[indice] = true;
		}
		
		return primo;
	}
	
	private static boolean[] findPrimos(boolean[] primo, int dimension) {
		int indice, j;
		
		for (indice = 2; indice< Math.sqrt(dimension) + 1; indice++){
			if (primo[indice]){
				for (j = 2*indice; j < dimension; j+=indice){
					primo[j] = false;
				}
			}
		}
		
		return primo;
	}
	
	private static int[] returnOnlyPrimos(int dimension, boolean[] primo) {
		int indice,j;		
		
		int[] primos = new int[countPrimos(dimension, primo)];
		
		for (indice = 0,j=0; indice < dimension; indice++){
			if (primo[indice])
				primos[j++] = indice;
		}
		
		return primos;
	}
	
	private static int countPrimos(int dimension, boolean[] primo) {
		
		int indice, cuenta = 0;
		
		for (indice = 0; indice < dimension; indice++){
			if (primo[indice])
				cuenta++;
		}
		
		return cuenta;
	}
	
	
}
