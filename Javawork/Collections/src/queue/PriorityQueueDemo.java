package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>();
		
		System.out.println(q.peek());//regresa null si esta vacia la cola
		
		for(int i = 20; i<30;i++) {
			q.offer(i);//coloca los elementos en la cola
		}
		System.out.println(q);//muestra los elementos
		System.out.println(q.poll());//muestra los elementos y elimina el primero, si esta vacio regresa null
		System.out.println(q.remove());//elimina el inicio de la cola
		System.out.println(q);
	}

}
