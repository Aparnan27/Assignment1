package com.apex.assign1;
import java.util.Scanner;

public class Payroll {
	
	static void calculatePayPerMon(double hours, double pay) {
		double payPerMon = hours * pay;
		System.out.println("Salary is: "+payPerMon);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no. of hours worked");
		double hrs = input.nextDouble();
		System.out.println("Enter pay per hour");
		double payPerHr = input.nextDouble();
		input.close();
		calculatePayPerMon(hrs,payPerHr);
		
	}

}
