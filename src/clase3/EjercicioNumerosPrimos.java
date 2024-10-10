package clase3;

public class EjercicioNumerosPrimos {

	public static void main(String[] args) {
		// Crear un programa para saber si un numero es primo o no 
		
		//¿Que es un numero primo? 
			// Son todos aquellos numeros que solo tienen DOS DIVISORES (El numero 1 y su mismo numero) 
			// Dando el resultado de la division el numero 0 
		
		//Creamos la variable con el numero a comprobar 
		int NumeroPrimo = 9; 
		// Creamos el contador con el numero de divisores a acumular
		int ContadorDivisores = 0;
		
		while(ContadorDivisores < 3) {
			
			if(NumeroPrimo % 1 ==0 ) {
				ContadorDivisores ++;
			}
			
			if(NumeroPrimo % NumeroPrimo == 0) {
				ContadorDivisores ++;
			}
			
			if(NumeroPrimo % 2 == 0) {
				ContadorDivisores ++;
			}
			
			break;
		}
		
		if(ContadorDivisores < 3) {
			System.out.println("El numero es primo");
		} else {
			System.out.println("El numero no es primo");
		}
		 	
		 }

	}


