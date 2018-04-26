package com.fan.example2;

public abstract class TestAbstractFather {
	
	private int a;
	
	public void methodA() {
		System.out.println("我的名字是"+getName());
		
	}
	
	protected abstract String getName();
	
	
	
}
