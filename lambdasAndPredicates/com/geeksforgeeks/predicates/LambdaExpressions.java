package com.geeksforgeeks.predicates;

public class LambdaExpressions {
	public static void main(String[] args) {
		LambdaExpressions lm=new LambdaExpressions();
		
		MathOperation add=(int a,int b)->a+b;
		MathOperation sub=(int a,int b)->a-b;
		MathOperation mul=(int a,int b)->a*b;
		MathOperation div=(int a,int b)->a/b;
		
		GreetingService ser=message->
		System.out.println("hello " +message);
		
		GreetingService s=(message)->
		System.out.println("hi " +message);
		
		System.out.println(lm.operate(10,5,add));
		ser.greet("Mahesh");
	    ser.greet("Suresh");
		
	}
	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
	interface MathOperation{
		int operation(int a,int b);
	}
	interface GreetingService {
		void greet(String str);
	}	
}