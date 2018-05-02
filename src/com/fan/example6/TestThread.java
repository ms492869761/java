package com.fan.example6;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class TestThread {
	
	
	public static void main(String[] args) {
		
		TestRunnbale testRunnbale = new TestRunnbale();
		Thread thread = new Thread(testRunnbale);
		thread.start();
		Object aObject=new Object();
		synchronized (aObject) {
			
			
			
			
			
			
		}
		
		
		ReentrantLock lock=new ReentrantLock();
		
		lock.lock();
		lock.tryLock();
		lock.unlock();
		
		
	
		
	}
	
	
}
