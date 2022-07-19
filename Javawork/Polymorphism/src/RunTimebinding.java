
public class RunTimebinding {
	public static void main(String[] args) {
		AppleLaptop m1 = new MACBookPro();
		AppleLaptop m2 = new MACBookAir();
		m1.shutdown();
		m1.start();
		
		MACBookPro m3 = (MACBookPro) m1;//Casting convertir de que quieres convertir a que
		m3.prosmethod();//Arriba no se puede porque este metodo esta solo en la clase MACBookpro y no en apple laptop
		
		m2.shutdown();
		m2.start();
		
	}
}
