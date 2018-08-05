package com.apex.assign1;

import java.util.Scanner;

public class InverseTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int i=0;
		int j=0;
		System.out.println("Enter a number");
		int n = input.nextInt();
		
		for(i=n;i>0;i--)
		{
			for(j=i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
