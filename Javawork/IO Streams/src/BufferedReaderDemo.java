import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderDemo {

	public static void main(String[] args) {

		int count = 0;
		try (FileReader fr = new FileReader("C:/Users/106721781/Documents/MyFile.txt");
				BufferedReader br = new BufferedReader(fr);) {// analiza archivos mas a detalle;

			String line;

			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line);
				while (st.hasMoreTokens()) {
					System.out.println(st.nextToken());
					count++;
				}
			}
			System.out.println("Number of words: " + count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
