package ejercicioClase3;

public class ejercicio2Clase3 {

	public static void main(String[] args) {
		// Comprobar si una cadena de texto es un palindromo (Se leee igual al reves que normal)
		
		String texto = "ana";  // Declaramos la variable a comparar 
		String textoAComparar = ""; // Contenedor donde vamos a guardar la variable a comparar
		
		int contador = texto.length()-1;  // el -1 es para empezar a iterar desde la ultima letra
		
		while(contador>=0) {
			textoAComparar += texto.charAt(contador); // Con el bucle comparamos
			contador--;
		}
		
		if(texto.equals(textoAComparar)) {
			System.out.println("Es palindromo");
		} else {
			System.out.println("No es palindromo");
		}
		
		

	}

}
