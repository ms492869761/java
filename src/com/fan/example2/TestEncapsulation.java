package com.fan.example2;

/**
 * 封装
 * @author playcrab
 *
 */
public class TestEncapsulation {
	
	
	public static void main(String[] args) {
		
		A aClass=new A();
		aClass.a=100;
		
		System.out.println(aClass.a);
		
		
	}
	
	
	
	
	
	
}



class A{
	
	public int a;
	
	
}
