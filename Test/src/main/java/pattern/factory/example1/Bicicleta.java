package pattern.factory.example1;

public class Bicicleta implements Transporte{

	@Override
	public void arrancar() {
		System.out.println("Pedalaso");
		
	}

	@Override
	public void detener() {
		System.out.println("Freno");
		
	}

	@Override
	public String tipo() {
		// TODO Auto-generated method stub
		return "Bicicleta";
	}

}
