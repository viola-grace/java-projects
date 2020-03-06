package List;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class DifferentSets {

	public static void main(String[] args) {
		Random obj = new Random();
		
		//HashSet<Integer> set= new HashSet<>();//does no maintain order
		
		//LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		
		Set<Integer> set = new TreeSet<>();
		
		for(int i=0; i < 5;i++) {
			int num = obj.nextInt(100);
			set.add(num);
		//	lhs.add(num);
			System.out.println(num);
		}
		
		System.out.println("Hashed ele are:"+set);
	//	System.out.println("Hashed ele are:"+lhs);

	}

}
