package inmutable;

public class StringPoolDemo {

	public static void main(String[] args) {
		User user = new User(1, "s");
		User user2 = new User(2, "s2");

		System.out.println(user);
		System.out.println(user2);

		String s1 = "abc";
		String s2 = "xyz";// aun que son diferentes variables se le asigna el mismo espacio de memoria
		//A esto se le llama pooling
		String s3 = "abc";
		String s4 = new String("abc");//asignandole otra locacion de memoria
		
		System.out.println(s1.hashCode());//Para mostrar su espacio en la memoria hasChode
		System.out.println(s2.hashCode());
		
		System.out.println(s1== s3);//Compara la locacion de la memoria
		System.out.println(s1.equals(s3));//compara el contenido de la variable
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));//equals es anulado por String
		
		System.out.println(user==user2);
		System.out.println(user.equals(user2));//no funciona con objetos solo con cadenas
		
	}
	

}
