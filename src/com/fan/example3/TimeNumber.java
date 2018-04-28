package com.fan.example3;

public class TimeNumber {
	
	protected int value;
	
	protected int threshold;
	
	public TimeNumber(int threshold) {
		this.threshold=threshold;
	}
	
	public boolean tick(){
			value++;
			if(value==threshold){
				value=0;
				return true;
			}
			return false;
		}
	
	public int getValue() {
		return value;
	}
	
	
	
	
}
