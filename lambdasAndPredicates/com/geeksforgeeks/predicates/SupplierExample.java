package com.geeksforgeeks.predicates;

import java.util.function.Supplier;

//no argument returns something
public class SupplierExample {

	public static void main(String[] args) {
		Supplier<Double> sup=()->Math.random();
		System.out.println(sup.get());

	}

}
