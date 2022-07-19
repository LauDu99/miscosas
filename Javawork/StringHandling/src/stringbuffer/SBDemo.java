package stringbuffer;

public class SBDemo {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();//Es una string que se puede crecer o escribir mas  
		
		System.out.println("Initial capacity: "+ sb.capacity());
		
		sb.append("All the power is with in you");//agregar
		sb.append("You can do everything and anything");
		
		System.out.println(sb);
		
		System.out.println("current capacity: "+sb.capacity());
		
		System.out.println("CharAt: "+sb.charAt(10));
		
		StringBuffer sb1 = new StringBuffer("abcde");
		System.out.println(sb1.reverse());
		
		System.out.println(sb1.insert(3, "xyz"));//insertar ciertas cosas en cierta parte de la cadena
		System.out.println(sb1.delete(3, 6));//Eliminar ciertos caracteres a partir del 3 al 6
	}

}

