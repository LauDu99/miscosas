package threadgroups;

public class ThreadGroupDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		
		ThreadGroup parent = new ThreadGroup("Parent");//Creando un grupo de tipo padre
		System.out.println(parent.getName());
		ThreadGroup child = new ThreadGroup(parent, "Child");
		System.out.println(child.getName());
		System.out.println(child.getParent().getName());
		child.setMaxPriority(4);//Las prioridades siempre se crean antes que el hilo/thread
		Thread t1 = new Thread(child, "Thread 1");
		Thread t2 = new Thread(child, "Thread 2");
		System.out.println(t1.getThreadGroup().getName());//mostrara el nombre del grupo al que pertenece
		System.out.println(t1.getPriority());
		
	}

}
