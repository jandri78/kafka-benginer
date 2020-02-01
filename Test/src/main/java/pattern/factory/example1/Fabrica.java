package pattern.factory.example1;

public class Fabrica {

	public static Transporte construir(String tipo) {

		switch (tipo) {
		case "Moto":

			return new Moto();
		case "Automovil":

			return new Automovil();
		case "Bicicleta":

			return new Bicicleta();

		default:
			return null;
		}

	}
}
