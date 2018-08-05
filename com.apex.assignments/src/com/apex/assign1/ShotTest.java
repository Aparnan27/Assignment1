package com.apex.assign1;

public class ShotTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short s1 = 32;
		//short s1 = 365;
	//	short s1 = 35000; // compilation err cannot convert from int to short
		//short s1 = 65398; // compilation err cannot convert from int to short
	    System.out.println("A short: " +  s1);
	    
	   // int i1 =365;
	  //  int i1=35000;
	  //  int i1 = 65398;
	   // int i1 = 1212673984;
	     int i1=1212673984;
	  // int i1 = 12345678901234567890123; // compilation err. out of range
	    System.out.println("A int: " +  i1);
	    
	 //   long l1 = 12345678901234567890123;//compilatio err out of range
	   // float f1=12345678901234567890123; // compilation err out of range
	   // double d1=12345678901234567890123; // compilation err out of range
	    
	   // char ch='A';
	    char ch='Z';
	    //char ch=' ';
	    //char ch = '  ';//invalid character constant
	    //char ch = '.';
	   // char ch= "A"; // cannot convert from string to char
	    System.out.println("A char: " +  ch);
	    
	}

}
