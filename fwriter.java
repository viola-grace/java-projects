import java.io.*;

public class fwriter {
   public static void main(String[] args) {
      try {
         BufferedWriter out = new BufferedWriter(new FileWriter("C:\\internship handson\\visitors.txt"));
         out.write("aString");
         out.close();
         System.out.println("File created successfully");
      }
      catch (IOException e) {
      }
   }
}