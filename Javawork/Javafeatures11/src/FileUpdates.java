import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUpdates {

	public static void main(String[] args) throws IOException {
//Creando un archivo txt
		Path path = Files.writeString(Files.createTempFile("test",".txt"), "Java is cool");
		System.out.println(path);
		
		//leyendo el archivo
		String str = Files.readString(path);
		System.out.println(str);
	}

}
