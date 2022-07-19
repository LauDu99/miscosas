
public class NonStaticMembersDemo {
//Los bloques no estaticos se ejecutan cada vez que se crea un objeto, 
	//Depende la cantidad de objetos que creemos es la cantidad de veces que se ejecuta el bloque
	int num;
	
	NonStaticMembersDemo(){
		System.out.println("Inside the constructor");//Contructor para declaración de variables
	}
	
	{
		System.out.println("Inside the non Static block");//Bloque no estatico
	}
	//Se necesita un main como instancia de la clase
	public static void main(String[] args) {
		System.out.println("Iside the main method");
		NonStaticMembersDemo obj = new NonStaticMembersDemo();
		
		obj.doSomething();
	}
		
	static {
		System.out.println("Inside the static block");
	}
	
	void doSomething() {
		System.out.println("Inside the method");
	}
}
