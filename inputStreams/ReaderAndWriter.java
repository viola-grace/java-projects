import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderAndWriter {

	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		FileWriter fw = null;
		
		fr = new FileReader("C:/internship handson/mytext.txt");
		fw = new FileWriter("C:/internship handson/new.txt");
		int ch;
		
		while((ch = fr.read())!= -1) {
			fw.write(ch);
		}
		
		fr.close();
		fw.close();
	}

}
