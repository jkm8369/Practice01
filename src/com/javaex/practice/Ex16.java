package com.javaex.practice;

public class Ex16 {

	public static void main(String[] args) {
		
		
		
		
		
		int x = 1;
		int y = 1;
		
		
		int a = ++x *2;   // 4
		int b = y++ *2;   // 2   ==> 결과 먼저 나오고 y는 1 올라간다
		
		System.out.println( "a=" + a);  // a=4 
		System.out.println( "b=" + b);  // b=2
		System.out.println( "x=" + x);  // x=2
		System.out.println( "y=" + y);  // y=2
		
		
		
		
		
	}
}
