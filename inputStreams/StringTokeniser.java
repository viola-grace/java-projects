import java.util.StringTokenizer;
public class StringTokeniser {

	public static void main(String[] args) {
		String s="You are the creator of your destiny";
		StringTokenizer st = new StringTokenizer(s);
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
