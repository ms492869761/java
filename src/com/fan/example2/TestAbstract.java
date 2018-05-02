package com.fan.example2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestAbstract {
	
	public static void main(String[] args) {
		
		List<TestAbstractFather> dataList=new ArrayList<>();
		WZY wzy = new WZY();
		WZY wzy1=wzy;
		dataList.add(wzy);
		dataList.add(new WBY());
		
		Iterator<TestAbstractFather> iterator = dataList.iterator();
		while(iterator.hasNext()){
			
			TestAbstractFather next = iterator.next();
			next.methodA();
		}
		
		for(int i=0;i<dataList.size();i++){
			dataList.get(i).methodA();
		}
		
		
		for (TestAbstractFather testAbstractFather : dataList) {
			testAbstractFather.methodA();
		}
		
		dataList.stream().forEach(testAbstractFather-> {
			testAbstractFather.methodA();
		});
		
		
	}
	
}


class WZY extends TestAbstractFather{

	@Override
	protected String getName() {
		return "王志远";
	}
	
}


class WBY extends TestAbstractFather{

	@Override
	protected String getName() {
		return "毋铂懿";
	}
	
}

