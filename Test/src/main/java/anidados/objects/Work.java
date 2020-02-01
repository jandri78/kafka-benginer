package anidados.objects;

public class Work {

	
	public String testobject(Object a) {
		
		if (a instanceof ClassOne) {
			
			((ClassOne) a).setName("andres One");
			
			return ((ClassOne) a).getName();
		}else if (a instanceof ClassTwo) {
			
			((ClassTwo) a).setName("jorge Two");
			
			return ((ClassTwo) a).getName();
		}
		
		return null;
	}
}
