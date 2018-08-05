package com.apex.assign1;

import java.util.Scanner;

public class Square1stNumber {
	
	static void sumOfSquares(int num) {
		int sum=(num*(num+1)*(2*num+1))/6;
		System.out.println("Sum= "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=input.nextInt();
		input.close();
		System.out.println("Method 1:Sum using loops:");
		for(int i=1;i<=n;i++) {
			sum = sum+(i*i);
		}
		System.out.println("Sum: "+sum);
		
		System.out.println("Method 2: using formula");
		sumOfSquares(n);
	}

}
