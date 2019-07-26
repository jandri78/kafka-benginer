package pilas;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Cola {

	LinkedList<Integer> cola = new LinkedList<Integer>();

	public void encolar(int a) {
		cola.addFirst(a);
	}

	public void encolarLast(int a) {
		cola.addLast(a);
	}
	public int descencolar() {
		return (int)cola.removeLast();
	}
	
	public void mostrar() {
		System.out.println(cola);
	}
	
	public void ordenar() {
		Collections.sort(cola);
	}
	
	public void addlist( List<Integer> c) {
			cola.addAll(c);
	}
}
