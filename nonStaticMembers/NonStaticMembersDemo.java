
public class NonStaticMembersDemo {
	int num;
	
	NonStaticMembersDemo(){
		System.out.println("Inside constructor");
	}
	{
		System.out.println("inside non static block");
	}
	public static void main(String[] args) {
		System.out.println("inside main");
		new NonStaticMembersDemo();
	}
}
