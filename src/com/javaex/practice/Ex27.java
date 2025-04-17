package com.javaex.practice;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름을 입력하세요: ");
		
		final float PI = 3.14F;
		
		float radius = sc.nextFloat();
		float area = PI * radius * radius;
		System.out.println("원의 넓이는 " + area);
		
		
		
		
		
		
		sc.close();
		
	}
}
