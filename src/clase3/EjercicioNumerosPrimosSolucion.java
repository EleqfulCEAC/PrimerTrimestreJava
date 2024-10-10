package clase3;

public class EjercicioNumerosPrimosSolucion {

	public static void main(String[] args) {
		// Crear un programa para saber si un numero es primo o no 
		
				//¿Que es un numero primo? 
					// Son todos aquellos numeros que solo tienen DOS DIVISORES (El numero 1 y su mismo numero) 
					// Dando el resultado de la division el numero 0 
				
				//Creamos la variable con el numero a comprobar 
				int NumeroPrimo = 9; 
				// Creamos el contador con el numero de divisores a acumular
				int ContadorDivisores = 0;
				// Creamos el indice a comparar la condicion
				int Index = 1; 
				
				
				
				while(Index <= NumeroPrimo) {
					
					if(NumeroPrimo % Index ==0 ) {
						ContadorDivisores ++;
					}
					
					Index++;
				}
				
				if(ContadorDivisores < 3) {
					System.out.println("El numero " + NumeroPrimo + " es primo " +  "y tiene:" + ContadorDivisores);
				} else {
					System.out.println("El numero " + NumeroPrimo +  " no es primo " +  "y tiene:" + ContadorDivisores);
				}
	}

}
