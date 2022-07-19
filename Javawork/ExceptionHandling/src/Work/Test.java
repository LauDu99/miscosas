package Work;

public class Test {
	public static void main(String[] args) throws MyThreadException{
		throw new MyThreadException("Personalizado");
	}
}
