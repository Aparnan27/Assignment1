package com.apex.assign1;

import java.util.Scanner;

public class ReadAndSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter values for a and b");
		System.out.print("a= ");
		int a = input.nextInt();
		
		System.out.print("b= ");
		int b = input.nextInt();
		input.close();
		if(a > b) {
			System.out.println("a should be less than b");
			return;
		}
		for(int i=a;i<=b;i++)
		{
			int res= i*i;
			System.out.println(i+"  " +res);
		}
		
	}

}
