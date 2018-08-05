package com.apex.assign1;

import java.util.Scanner;

public class FindRoots {
	
	public static void solveForRoots(int a,int b, int c)
	{
		//formula to solve quadratic  equation -b +/- sqrt(b*b-4*a*c)/2*a
		
		int temp=b*b-4*a*c;
		
		if(temp>0)
		{
			double x1=(-b + Math.sqrt(temp))/2*a;
			double x2=(-b - Math.sqrt(temp))/(2*a);
			System.out.println("roots are "+ x1 +" and "+ x2);
		}
		else if(temp==0) {
			double x1=(-b + Math.sqrt(temp))/(2*a);
			System.out.println("root is "+ x1);
		}
		else {
			System.out.println("Imaginary roots");
		}
		return;	
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Enter values of a, b,c to solve aX^2+b*X+c");
		Scanner input = new Scanner(System.in);
		System.out.print("a=");
		int a = input.nextInt();
		System.out.print("b=");
		int b = input.nextInt();
		System.out.print("c=");
		int c = input.nextInt();
		input.close();
		solveForRoots(a,b,c);
	}

}
