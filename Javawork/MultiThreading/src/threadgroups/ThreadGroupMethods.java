package threadgroups;

public class ThreadGroupMethods {

	public static void main(String[] args) throws InterruptedException {
		ThreadGroup tg = new ThreadGroup("MyThreadGroup");//Para probar creas la instancia con el nombre el grupo, luego creas los objetos de cada grupo(nombre de donde esta run) y por ultimo lo llamas
		
		CustomThread t1 = new CustomThread(tg, "Thread1");
		CustomThread t2 = new CustomThread(tg, "Thread2");
		
		t1.start();
		t2.start();
		
		System.out.println(tg.activeCount());//muestra cuantos grupos hay activos
		//tg.list();//muestra lista de datos de los grupos 
		Thread.sleep(5000);
		
		
	}

}
