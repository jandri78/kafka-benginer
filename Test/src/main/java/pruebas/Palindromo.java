package pruebas;

public class Palindromo {

	public static void main(String[] args) {
		
		String palabra = "laal";
		
		char[] arrpala = palabra.toCharArray();
		
		boolean ok = false;
		
		for (int i = 0; i < arrpala.length; i++) {
			int longitud=arrpala.length-1;
			System.out.println(longitud-i+"--"+i);

			if (arrpala[i] == arrpala[longitud-i]) {
				System.out.println("es un palindromo");
				ok = true;
			}else {
				System.out.println("no es un palindromo");
				ok = false;
			}
		}
		System.out.println("----------");
		if (ok) {
			System.out.println("la palabra "+palabra +" es palindroma");
		}else {
			System.out.println("la palabra "+palabra +" NO es palindroma");
		}
	}
	
}
