
public class GCDemo {

	int objId;

	GCDemo(int objId) {
		this.objId = objId;
		System.out.println(this + "Created");
	}

	public static void main(String[] args) {
		new GCDemo(1);
		new GCDemo(2);
		for (int i = 0; i <= 100; i++) {
			System.gc();//solicita al sistema que inicie una recolección de basura de metodos no utilizados
			//new GCDemo(i);// mete la clase en un ciclo para que se repitan cierta cantidad de veces
		}

	}

	protected void finalize() {//se llama una vez que se recolecto basura
		System.out.println("Finalize" + objId);
	}

}
