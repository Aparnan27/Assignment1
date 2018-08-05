package com.apex.assign1;

import java.util.Scanner;
public class Factorial {
	
	static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return n* factorial(n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		input.close();
		int ans = factorial(num);
		System.out.println("Factorial of "+num+" is "+ans);
		
	}

}
