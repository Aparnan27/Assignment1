package com.apex.assign1;

import java.util.Scanner;

public class WeightScale {

	public static void main(String[] args) {
		int left=0;
		int right =0;
		
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("Enter left side weight");
			left = left + input.nextInt();
			System.out.println("Enter right side weight");
			right = right + input.nextInt();
			
			if(left == right)
				break;
			else {
				System.out.println("both are not same weights");
				continue;
			}
			
		}
		System.out.println("both are same weights");
		input.close();
	}

}
