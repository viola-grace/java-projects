package com.geeksforgeeks.predicates;

import java.util.function.Predicate;


//one argument boolean return 
public class PredicateInterface {
	public static void main(String[] args) {
	 Predicate<Integer> pre = i->(i<8);
	 System.out.println(pre.test(10));
	 System.out.println(pre.test(1));
	 func(10,i->(i<2));
	}
	static void func(int n,Predicate<Integer> pre) {
		System.out.println("Number "+pre.test(n));
	}
}
