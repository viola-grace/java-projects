import java.util.ArrayList;

public class WildCardParams {
	public static void main(String[] args) {
		WildCardParams wp = new WildCardParams();
		wp.myMethod(new ArrayList<Thread>());
	}
	public void myMethod(ArrayList<? extends Thread> l) {
		l.add(null);
		
	}
}
