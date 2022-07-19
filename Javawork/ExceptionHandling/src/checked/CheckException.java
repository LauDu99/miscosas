package checked;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckException {
	
	void readFile() throws FileNotFoundException{//trows se usa para declarar que un metodo no manejara la excepcion
		FileInputStream in = new FileInputStream("");
	}
	public static void main(String[] args) throws FileNotFoundException{//se activa el manejador de excepciones predeterminado pero es feo
		CheckException ce = new CheckException();
		ce.readFile();
		}
	}


