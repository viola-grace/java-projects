
public class Immutability {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="World";
		String s3;
		
		s3=s1.concat(s2);//if u dont store it in a ref then concat will not be reflected
		
		System.out.println(s3);
	}

}
