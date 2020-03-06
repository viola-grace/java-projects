package com.cts.thread;

public class RunnableInterface implements Runnable {

	public static void main(String[] args) {
		RunnableInterface rn=new RunnableInterface();
		Thread thread=new Thread(rn);
		thread.start();

	}

	@Override
	public void run() {
		System.out.println("Thread running");
		
	}

}
