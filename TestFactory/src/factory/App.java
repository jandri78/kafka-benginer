package factory;

public class App {

	public static void main(String[] args) {

		Transporte t1 = Fabrica.construir("Bicicleta");
		t1.arrancar();
		t1.detener();
		
		System.out.println(t1.tipo());
		
		
	}

}
