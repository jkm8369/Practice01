package com.javaex.practice;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 개수: ");
		int w500 = sc.nextInt();
		
		System.out.print("100원 개수: ");
		int w100 = sc.nextInt();
		
		System.out.print("50원 개수: ");
		int w50 = sc.nextInt();
		
		System.out.print("10원 개수: ");
		int w10 = sc.nextInt();
		
		
		System.out.println("동전의 총합은 " + ((w500*500) + (w100*100) + (w50*50) + (w10*10) ) + "원 입니다." );
		
		sc.close();
	}
}
