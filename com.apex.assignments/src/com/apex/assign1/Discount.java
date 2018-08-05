package com.apex.assign1;

import java.util.ArrayList;
import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		ArrayList<Double> priceList = new ArrayList<Double>();
		double sum=0.0;
		double disPrice=0.0;
		Scanner input = new Scanner(System.in);
		
		/*START- Discount(5%) price for an Item.*/
		System.out.println("Enter the price of the item");
		double price = input.nextDouble();
		double totPrice = price - 0.05*price;
		System.out.println("Price after 5% discount is "+totPrice);
		/*END - Discount(5%) price for an Item.*/
		
		/*START - Discount(5%) price for an Item, where the discount applies to purchases over $10.00*/
		System.out.println("Enter the number of items");
		int items = input.nextInt();
		int i=1;
		while (items>0) {
			System.out.println("Enter the price of item "+i+":");
			double itemPrice=input.nextDouble();
			priceList.add(itemPrice);
			items--;
			i++;
		}
		for(int j=0;j<priceList.size();j++ ) {
			sum = sum+priceList.get(j);
		}
		if(sum > 10.00) {
			for(int k=0;k<priceList.size();k++) {
				disPrice = disPrice + (priceList.get(k)-(0.05*priceList.get(k)));
			}
			System.out.println("After discount of 5% on each item, the total is:"+disPrice);
			
		}
		else {
			System.out.println("The total is:"+sum);
			
		}
		/*END-Discount(5%) price for an Item, where the discount applies to purchases over $10.00*/
		
		/*START-Discount(5%) price for a collection of items, where the discount applies to purchases of total over $10.00.*/
		System.out.println("Price of 1 cookie - 5cents");
		System.out.println("Price of 1 cake - 3cents");
		System.out.println("Please enter number of cookies:");
		int cookie = input.nextInt();
		System.out.println("Please enter number of cakes");
		int cake = input.nextInt();
		
		double cookiePrice = 0.05*cookie;
		double cakePrice = 0.03*cake;
		
		double priceBeforeDis = cookiePrice+cakePrice;
		if(priceBeforeDis > 10.00) {
			double priceAfterDis =  priceBeforeDis-(0.05*priceBeforeDis);
			System.out.println("New total is(dicount applied):"+priceAfterDis);
		}
		else {
			System.out.println("Total is:"+priceBeforeDis);
		}
		
		
		/*END-Discount(5%) price for a collection of items, where the discount applies to purchases of total over $10.00. */
		
		
	}

}
