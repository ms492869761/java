package com.fan.example3;

public class DayTimeNumber extends TimeNumber {

	public DayTimeNumber(int threshold) {
		super(threshold);
	}
	
	public DayTimeNumber() {
		super(0);
	}
	
	
	public boolean tick(int threshold){
		value++;
		if(value == threshold){
			value = 0;
					return true;
		}
		return false;
	}


	

}
