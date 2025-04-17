package com.javaex.practice;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로를 입력하세요: ");
		double width = sc.nextDouble();
		
		System.out.print("세로를 입력하세요: ");
		double height = sc.nextDouble();
		
		System.out.println("사각형의 넓이는 " + width*height);
		System.out.println("사각형의 둘레는 " + 2*(width + height) );
		
		//문자열이랑 숫자열이랑 + 하면 문자열이 되어버려서 붙어 버린다
		// "사각형의 둘레는" + 2*width + 2*height 하면 안됨
		
		
		
		
		
		
		
		
		sc.close();
		
		
	}
}
