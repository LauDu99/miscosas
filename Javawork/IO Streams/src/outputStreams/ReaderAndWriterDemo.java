package outputStreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderAndWriterDemo {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		fr = new FileReader("C:/Users/106721781/Documents/MyFile.txt");
		fw = new FileWriter("C:/Users/106721781/Documents/NewFile.txt");
		
		int ch;
		while((ch = fr.read())!=-1);{//ch va a leer todo el archivo hasta que termine o sea -1
			fw.write(ch);//para copiar los datos a ch
		}
		fw.close();
		fr.close();
	}

}
