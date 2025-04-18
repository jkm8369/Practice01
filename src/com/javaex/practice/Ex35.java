package com.javaex.practice;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		
		long dis = 300000L * 365 * 60 * 60 *24;  // 계산 값이 int 값을 넘어서 앞에 L을 붙여줘야 값이 나온다.
												 // 뒤에 넣으면 계산 범위가 넘어버려서 값이 이상해짐
		
		
		/*
		long speedOfLight = 300000;
		long year = 365 * 60 * 60 * 24L;
		long dis = speedOfLight * year;
		*/ 
		
		
		System.out.println("빛이 1년 동안 가는 거리는 " + dis + " km 입니다.");
		
		
		
		
		
		
		
		
	}
}
