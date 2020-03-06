import java.util.*;
public class StringParser {

	public static void main(String[] args) {
		try {
		String s="abcd";
		int i= Integer.parseInt(s);
		}
		catch(Exception e) {
			System.out.println("error caught");
		}
		finally {
			System.out.println("finallly");
		}
		System.out.println("hrlo");
	}

}
