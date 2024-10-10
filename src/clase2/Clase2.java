package clase2;

public class Clase2 {
	
	public static void main(String[] args) {
		 int numero = 25; 
		
		if (numero >= 0 && numero <= 10) {
			System.out.println("El numero es mayor que 0 pero menor que 10");
		} else if (numero >= 10 && numero <= 20) {
			System.out.println("El numero es mayor que 10 pero menor que 20");
		} else if (numero >= 20 && numero <= 30) {
			System.out.println("El numero es mayor que 20 pero menor que 30");	
		} else if (numero >= 30 && numero <= 40) {
			System.out.println("El numero es mayor que 30 pero menor que 40");
		} else {
			System.out.println("El numero es mayor que 50");
		}
	}
}
