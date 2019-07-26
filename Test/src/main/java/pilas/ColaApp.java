package pilas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ColaApp {

	public static void main(String[] args) {
		// TODO FIFO
		//Encolar añadir , entrar , insertar
		//desEncolar sacar, salir, eliminar
		//Frente consultar , front(primer elemento que entro)
		
		Cola cola = new Cola();
		
		for (int i = 0; i < 11; i++) {
			cola.encolarLast(i);
		}
		
		
		List<Integer> c = new ArrayList<Integer>();
		c.add(22);
		c.add(33);
		
		cola.addlist(c);
		
		cola.mostrar();

	}

}
