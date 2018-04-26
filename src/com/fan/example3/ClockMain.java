package com.fan.example3;

public class ClockMain {
	
	public static void main(String[] args) {
		Clock clock=new Clock();
		Thread thread=new Thread(new Runnable() {
			@Override
			public void run() {
				while(true){
					clock.run();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		thread.start();
	}
	
	
}
