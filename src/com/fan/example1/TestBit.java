package com.fan.example1;

public class TestBit {
	
	
	public static void main(String[] as){
		// 0000 0000 0000 0000 0000 0000 0000 0000
		int a=0;
		// 0000 0000 0000 0000 0000 0000 0000 0001
		int b=1;
		// 0000 0000 0000 0000 0000 0010 0000 0000
		b=b<<(10-1);
		
		a=a|b;
		
		a=openBit(a, 10);
		System.out.println("a="+a);
		
		//0000 0000 0000 0001 0000 0100 0110 1010
		int m  =  6666;
		m=closeBit(m, 10);
		System.out.println("m="+m);
		
	}
	
	
	
	/**
	 * bit开关开启
	 * @param a 开关保存值
	 * @param position   开关位置
	 * @return
	 */
	public static int openBit(int a,int position){
		int b=1;
		b=b<<(position-1);
		return a|b;
	}
	
	
	/**
	 * bit开关关闭
	 * @param a
	 * @param position
	 * @return
	 */
	public static int closeBit(int m,int position){
		// TODO 将a的指定位数变成0    | 或运算符   &  与运算符   ~ 非运算符
		
		//0000 0000 0000 0001 0000 0100 0110 1010
		//int m  =  6666;  使得 第2位 1 变成0  其余不改变。
		
		
		// 0000 0000 0000 0000 0000 0000 0000 0001
		int n = 1 ;
		// 0000 0000 0000 0000 0000 0000 0000 0010
		n = n<<(position-1);
		// 1111 1111 1111 1111 1111 1111 1111 1101
		n = ~n;
		return m&n;
	}
	
}
