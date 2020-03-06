package fileRead;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class read {

	public static void main(String[] args) throws IOException {
		FileReader freader = null;
		try {
		freader = new FileReader("C:\\internship handson\\mytext.txt");
		BufferedReader br = new BufferedReader(freader);
		String s;	
		
			while((s = br.readLine()) != null) {
			System.out.println(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			freader.close();	
		}
}
}
