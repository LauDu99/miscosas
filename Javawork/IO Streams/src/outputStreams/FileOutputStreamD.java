package outputStreams;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamD {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		FileInputStream fis = null;

		try {// abriendo el archivo
			fis = new FileInputStream("C:/Users/106721781/Documents/o3.jpg");

			fos = new FileOutputStream("C:/Users/106721781/Documents/o2.jpg");
			int data;
			while ((data = fis.read()) != -1) {//recorriendo el archivo
				fos.write(data);//escribiendo el archivo
			}
			System.out.println("File cpied");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
