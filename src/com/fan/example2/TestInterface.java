package com.fan.example2;

import java.util.ArrayList;
import java.util.List;

public class TestInterface {
	
	public static void main(String[] args) {
		TestInterfaceImp t=new TestInterfaceImp();
		t.methodA();
		int methodB = t.methodB();
		
		
		ITestInterface it=new TestInterfaceImp();
		it.methodA();
		int methodB2 = it.methodB();
		
		ITestInterface itb=new TestInterfaceImpB();
		itb.methodA();
		int methodB3 = itb.methodB();
		
		List<ITestInterface> dataList=new ArrayList<>();
		dataList.add(it);
		dataList.add(itb);
		
		for (ITestInterface iTestInterface : dataList) {
			iTestInterface.methodA();
		}
		
		
	}
	
}


class TestInterfaceImp implements ITestInterface {
	@Override
	public void methodA() {
		System.out.println("this is methodA");
		
	}
	@Override
	public int methodB() {
		return 1+1;
	}
}



class TestInterfaceImpB implements ITestInterface {

	@Override
	public void methodA() {
		System.out.println("this is class TestInterfaceImpB");
		
	}

	@Override
	public int methodB() {
		return 2+2;
	}
	
}
