package com.apex.assign1;

import java.util.Scanner;

public class QuadraticEquation {
	
	static int solveEquationForNum(int x)
	{
		int res = 3*(x*x) - 8*x +4;
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		int result = solveEquationForNum(num);
		System.out.println(result);
		
	}
}
