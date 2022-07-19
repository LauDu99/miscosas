package generics;

public class MyGenericsClass <T>{
	
	T obj;
	
	 MyGenericsClass(T obj) {
		this.obj = obj;
	}
	
	public void displayObjectDetails() {
		//obtienes la clase y luego el nombre de :
		System.out.println("Type og object: "+obj.getClass().getName());
	}
	
	public T getObject() {
		return obj;
}
}