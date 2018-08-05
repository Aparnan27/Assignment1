package com.apex.assign1;

import java.util.Scanner;

public class SumInLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int sum=0;
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("Enter an integer");
			num = input.nextInt();
			sum = sum + num;
			System.out.println("Sum= "+sum);
		}
	}
}
