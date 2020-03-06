package com.cts.thread;

public class ThreadClassDemo extends Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(2000);
				System.out.println("Thread running");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ThreadClassDemo dm=new ThreadClassDemo();
		ThreadClassDemo dm1=new ThreadClassDemo();
		dm.start();
		dm1.start();
	}

}
