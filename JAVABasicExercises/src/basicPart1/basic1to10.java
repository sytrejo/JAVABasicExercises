package basicPart1;

import java.util.Scanner;

public class basic1to10 {
	
	public static void main(String[] args) {
		
		//print out "Hello"
		//\n let's the console know to print on a new line.
		System.out.println("Hello, \nSilvia Trejo!");
		
		//add 24 and 26
		System.out.println(24+26);
		
		//divide two numbers
		System.out.println(50/3);
		
		//print out multiple mathematical problems
		  System.out.println(-5 + 8 * 6);
		  System.out.println((55+9) % 9);
		  System.out.println(20 + -3*5 / 8);
		  System.out.println(5 + 15 / 3 * 2 - 8 % 3);
		  
		//Java program that takes two numbers as input and displays the product of the two numbers
		  Scanner in = new Scanner(System.in);
		   
		  System.out.print("Input first number: ");
		  int num1 = in.nextInt();
		   
		  System.out.print("Input second number: ");
		  int num2 = in.nextInt();
		   
		  System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
		  
		//Java program that takes two numbers and completes basic math with them
		  Scanner in2 = new Scanner(System.in);
		  
		  System.out.print("Input first number: ");
		  int num3 = in2.nextInt();
		  
		  System.out.print("Input second number:");
		  int num4 = in2.nextInt();
		  
		  System.out.println( num3 + " + " + num4 + " = " + (num3+num4) );
		  System.out.println( num3 + " - " + num4 + " = " + (num3-num4) );
		  System.out.println( num3 + " * " + num4 + " = " + (num3*num4) );
		  System.out.println( num3 + " / " + num4 + " = " + (num3/num4) );
		  
		 //A Java program that takes a number as input and prints its multiplication table upto 10
		  Scanner in3 = new Scanner(System.in);
		  
		  System.out.println("Input a number: ");
		  int numb1 = in3.nextInt();
		  
		  for(int i=0; i<10; i++) {
			  System.out.println(numb1 + " x " + (i+1) + " = " + (numb1 * (i+1)));
		  }
		  
		  
		  //A JAVA program that will print out JAVA on the console
	        System.out.println("   J    a   v     v  a ");
	        System.out.println("   J   a a   v   v  a a");
	        System.out.println("J  J  aaaaa   V V  aaaaa");
	        System.out.println(" JJ  a     a   V  a     a");
	        
	        
	     //JAVA program that evaluates an equation
	        System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
	        
	      //JAVA program to compute a specified formula
	        double result = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
	        System.out.println(result);
		  
		  
	}

}
