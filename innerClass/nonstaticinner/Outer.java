package nonstaticinner;

public class Outer {

	private static int x=90;
	private int y;
	Outer(int y){
		this.y = y;
	}
	
	void f1() {
		System.out.println("outer class");
	}
	class Inner{
		private int y;
		
		Inner(int y){
			this.y = y;
		}
		
		private void f2() {
			System.out.println(Outer.x);
			System.out.println(Outer.this.y);
			System.out.println(this.y);	
			System.out.println("Inner classes");
		}
	}
	public static void main(String[] args) {
		Outer outer = new Outer(80);
		Outer.Inner in = outer.new Inner(30);
		in.f2();
	}

}
