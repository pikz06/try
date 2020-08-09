package Basic1;

import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program that takes three numbers as input to calculate and print the average of the numbers
	Scanner s= new Scanner (System.in);
	System.out.println("Enter three number:");
	int x=s.nextInt();
	int y=s.nextInt();
	int z=s.nextInt();
	
	double a= (x+y+z)/3;
	
	System.out.println("Average of "+x+" "+y+" "+z+ " is "+a);
	}

}
