
public class Demo {
	
	//static Demo obj;
	static Demo obj = new Demo();
	
	static {
		System.out.println(Demo.obj);
		//Demo.obj = new Demo(); variable local, dentro de un bloque estatico->Creando objeto
		//Demo.init();
		Demo.obj = Demo.init();
	}
	
	public static void main(String[] args) {
		System.out.println(Demo.obj);
	}
	
	static Demo init() {
		return  new Demo();
	}
}
