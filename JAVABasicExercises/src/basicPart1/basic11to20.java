package basicPart1;

import java.util.Scanner;

public class basic11to20 {
	
	
	   	//declare the radius of the 
		private static final double radius = 7.5;

	    public static void main(String[] args) {

	        double circlePerimeter = 2 * Math.PI * radius;
	        double circleArea = Math.PI * radius * radius;

	        System.out.println("Perimeter is = " + circlePerimeter);
	        System.out.println("Area is = " + circleArea);
	        
	        //A Java program that takes 3 numbers as input to calculate and print the average of the numbers
	        Scanner in = new Scanner(System.in);
	        
	        System.out.print("Input first number: ");
	        int num1 = in.nextInt();
	         
	        System.out.print("Input second number: ");
	        int num2 = in.nextInt();
	         
	        System.out.print("Input third number: ");
	        int num3 = in.nextInt();
	         
	        System.out.print("Input fourth number: ");
	        int num4 = in.nextInt();
	        
	        System.out.print("Enter fifth number: ");
	        int num5 = in.nextInt();
	         
	         
	        System.out.println("Average of five numbers is: " + 
	         (num1 + num2 + num3 + num4 + num5) / 5);
	        
	        //JAVA program to print the area and perimeter of a rectangle
	        //declare the fixed width and height 
	        final double width = 5.6;
	        final double height = 8.5;
	        
	        
	        
	        //declare the equations to calculate the area and the perimeter
	        double rectanglePerimeter = 2*(height + width);
	        double rectangleArea = width * height;			
			
	        //print out the solution to the calculation
			System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, rectanglePerimeter);
	        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, rectangleArea);
	        
	        
	        //Swapping two variables with a temporary variable
	        int a, b, temp;
	        a = 15;
	        b = 27;
	        System.out.println("Before swapping : a, b = "+a+", "+ + b);
	        temp = a;
	        a = b;
	        b = temp;   
	       System.out.println("After swapping : a, b = "+a+", "+ + b);
	       
	       
	       //Swapping two variables mathematically
	       int c, d;
	       c = 20;
	       d = 35;
	       System.out.println("Before swapping : a, b = "+c+", "+ + d);
	       c = c + d;
	       d = c - d;
	       c = c - d;
	       System.out.println("After swapping : a, b = "+c+", "+ + d);
	       
	       
	       //Java program that checks whether JAVA is installed on your computer
	       System.out.println("\nJava Version: "+System.getProperty("java.version"));
	       System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
	       System.out.println("Java Home: "+System.getProperty("java.home"));
	       System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
	       System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
	       System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
	       
	        
	    }

}
