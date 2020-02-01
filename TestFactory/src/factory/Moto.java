package factory;

public class Moto implements Transporte{
	
	@Override
	public void arrancar() {
		System.out.println("Arrancando el Moto");		
	}

	@Override
	public void detener() {
		System.out.println("deteniendo el Moto");
	}

	@Override
	public String tipo() {
		String a = "Moto";
		return a;
	}
}
