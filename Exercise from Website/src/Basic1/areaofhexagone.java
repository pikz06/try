package Basic1;

import java.util.Scanner;

public class areaofhexagone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
System.out.println("Enter the length of a side of hexagone: ");
double a=s.nextDouble();

double area= (6*a*a)/(4*Math.tan((Math.PI/6)));

System.out.println("Area is:"+area);
	}

}
