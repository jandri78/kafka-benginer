package pilas;

import java.util.Stack;

public class pilasApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> s = new Stack<String>();
		s.push("pila");// añade elementos a la pila
		s.push("en");
		s.push("java");
		
		System.out.println(s);
		System.out.println(s.peek());
		s.push("support");
		System.out.println(s.pop());//elimina elemento de la pila
		
		System.out.println(s.size());
		

	}

}
