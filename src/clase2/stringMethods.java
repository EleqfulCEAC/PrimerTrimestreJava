package clase2;

public class stringMethods {

	public static void main(String[] args) {
		String texto1 = "ohayo jose y mas";
		//System.out.println(texto1.length());
		//System.out.println(texto1.charAt(3));
		
	 int i = 0; 
	 
	 while (i < texto1.length()) {
		 if (i%2 == 0) {
			 System.out.println(texto1.charAt(i));			 
		 }
		 i++;
	 }

	}

}
