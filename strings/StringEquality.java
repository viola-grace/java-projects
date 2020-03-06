
public class StringEquality {
	
	public static void main(String[] args) {
		String s1="viola";
		String s2="viols";
		String s3="grace";
		
		if(s1==s2)//compares memory loc
		{
			System.out.println("true");
		}
		if(s1.equals(s2)) //compares value
		{
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}
