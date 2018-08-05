package com.apex.assign1;

import java.util.Scanner;

public class StudentAverage {
	static void calculateAverage(int ph,int ch,int ma,int bi,int oper,int ele) {
		int sum = ph+ch+ma+bi+oper+ele;
		int avg = sum/6;
		System.out.println("Average is: "+avg);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		for (int i=1;i<=3;i++){
		System.out.println("Enter marks obtained in Physics");
		int phy = input.nextInt();
		System.out.println("Enter marks obtained in Chemistry");
		int chem = input.nextInt();
		System.out.println("Enter marks obtained in Math");
		int math = input.nextInt();
		System.out.println("Enter marks obtained in Biology");
		int bio = input.nextInt();
		System.out.println("Enter marks obtained in Operating Systems");
		int os = input.nextInt();
		System.out.println("Enter marks obtained in Electronics");
		int elec = input.nextInt();
		
		calculateAverage(phy,chem,math,bio,os,elec);
		}
		input.close();
		}
	
	
}
