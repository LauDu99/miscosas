import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {

		FileInputStream fis = null;//para leer el conenido y lo muestre en la consola

		try {//crea la instancia
			fis = new FileInputStream(new File("C:/Users/106721781/Documents/MyFile.txt"));
			System.out.println("File opened");

			int i;// asignamos el archivo a un entero

			while ((i = fis.read()) != -1) {//lee el contenido un byte a la vez, comprueba que llegue al final del archivo
				System.out.print((char)i);//lo muestra en caracteres no numeros

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}System.out.println("\nFile closed");
	}
}
