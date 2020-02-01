package pattern.factory.example1;

public class Automovil implements Transporte{

	@Override
	public void arrancar() {
		System.out.println("Arrancando el Automovil");		
	}

	@Override
	public void detener() {
		System.out.println("deteniendo el Automovil");
	}

	@Override
	public String tipo() {
		String a = "Automovil";
		return a;
	}

}
