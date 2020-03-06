package List;

import java.util.List;
import java.util.ArrayList;

public class ListMethods {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		for(int i=10; i<=100 ; i=i+10) {
			list.add(i);
		}
		System.out.println("list: "+list);
		
		list.add(2,100);//inserting at specific pos
		System.out.println("after insertion "+list);
		
		list.set(3, 200);//replacing at a certain index
		
		List<Integer> secList = new ArrayList<>();
		secList.add(111);
		secList.add(222);
		secList.add(333);
		System.out.println("Second list:"+secList);
		
		list.addAll(4, secList);
		
		System.out.println("FirstList "+list);
		
		
		if(list.contains(222)) {
			System.out.println("List has value");
		} else {
			System.out.println("not in list");
		}
		
		System.out.println("Elements in the list are: ");
		
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.remove(3);
		System.out.println("List after deletion "+list);
	}

}
