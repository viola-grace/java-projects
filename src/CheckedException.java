
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class CheckedException {
	
	void readFile() throws FileNotFoundException{
		FileInputStream fs = new FileInputStream("");
	}
	public static void main(String[] args) {
		CheckedException ce = new CheckedException();
		try {
			ce.readFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
