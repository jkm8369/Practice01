package com.javaex.practice;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("화씨:  ");
		double fTemp = sc.nextDouble();
		double cTemp = 5.0/9.0* (fTemp - 32);
		System.out.println("화씨 "+fTemp + " 의 섭씨온도는 " + cTemp + " 입니다.");
		
		
		
		sc.close();
	}
}
