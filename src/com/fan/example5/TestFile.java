package com.fan.example5;

import java.io.File;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

import sun.nio.ch.DirectBuffer;

public class TestFile {
	
	public static void main(String[] args) {
		String a="abc\"def";
		
		System.out.println(a);
		
		ByteBuffer allocate = ByteBuffer.allocate(1024);
		DirectBuffer allocateDirect = (DirectBuffer)ByteBuffer.allocateDirect(1024);
		allocateDirect.cleaner().clean();
	}
	
}
