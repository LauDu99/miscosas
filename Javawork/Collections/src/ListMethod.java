import java.util.ArrayList;
import java.util.List;

public class ListMethod {

	public static void main(String[] args) {
		List <Integer> list = new ArrayList<>();
		
		for(int i=10;i<=100;i++) {
			list.add(i);
		}
		System.out.println("List: "+list);
		
		list.add(2,100);//agregar 100 en el campo 2
		list.set(3,200); //remplazar la posicion 3 con 200
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(222);
		list2.add(333);
		list.addAll(4,list2);//agregar de una lista a otra
		
		if(list.contains(222)) {//para comprobar si existe un valor 
			System.out.println("Existe");
		}else {
			System.out.println("No existe");
		}
		//enlistar los elementos
		for(int i=0;i<list.size();i++) {
			System.out.println("List of elements: "+list.get(i));
		}
		list.remove(222);//sirve para eliminar un elemento de la lista
	}

}
