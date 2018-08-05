package com.apex.assign1;

import java.util.Scanner;

public class SumInLoopDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num=0;
		double sum=0;
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("Enter a number");
			num = input.nextDouble();
			sum = sum + num;
			System.out.println("Sum= "+sum);
		}
	}

}
