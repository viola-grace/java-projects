package accessspecifiers;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

class CThread implements Runnable {
	
	int k;
	public void run() {
		k++;
	}
	public static void main(String[] args) {
		CThread a1=new CThread();
		a1.run();
		System.out.println("satred");
	}
	
		
	}
	

