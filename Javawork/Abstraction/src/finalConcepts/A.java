package finalConcepts;

public final class A {
	final float pi = 3.14f;//no se pueden cambiar
	
	public static void main(String[] args) {
		final A a = new A();//no se le puede asignar otro valor
		//a.pi = 3.25f;
	}
}
