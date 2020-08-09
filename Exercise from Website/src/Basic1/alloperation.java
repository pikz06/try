package Basic1;

import java.util.Scanner;

public class alloperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter First Number");
		int x= s.nextInt();
		System.out.println("Enter second Number");
		int y= s.nextInt();
		
		int a=x+y;
		int b=x-y;
		int c=x*y;
		int d=x/y;
		int e= x%y;
		
		System.out.println("Addition of "+x+" and "+y+" is "+a);
		System.out.println("Subtraction of "+x+" and "+y+" is "+b);
		System.out.println("Multiplication of "+x+" and "+y+" is "+c);
		System.out.println("Division of "+x+" and "+y+" is "+d);
		System.out.println("Reminder of "+x+" and "+y+" is 25"+e);
				
		
	}

}
