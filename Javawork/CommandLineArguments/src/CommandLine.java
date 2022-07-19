
public class CommandLine {

	public static void main(String[] args) {
		int length = args.length;
		if(length == 0) {
			System.out.println("Sin entradas");
		}else {
			System.out.println("argumentos:");
			for(int i=0; i<=length; i++) {
				System.out.println(args[i]);
			}
		}
	}

}
