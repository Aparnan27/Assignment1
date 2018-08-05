
package com.apex.assign1;

import java.util.Scanner;

public class DrawTree {
	
	static void printTree(int n) {
		int k = 2 * n - 2;

		for (int i = 0; i < n; i++) {
			for (int j=0; j<k; j++){
				System.out.print(" ");
			}

			k = k - 1;

			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		printTree(num);
	}

}
