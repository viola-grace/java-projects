package nonstaticinner;

public class LocalInner {
	
	void f1() {
		System.out.println("Inside outer f1()");
		
		class LocalInnerClass{
			void f2() {
				System.out.println("Inside local inner f2()");
			}
		}
		LocalInnerClass inner = new LocalInnerClass();
		inner.f2();
	}
	
	public static void main(String[] args) {
		
		LocalInner inner = new LocalInner();
		inner.f1();
		

	}

}
