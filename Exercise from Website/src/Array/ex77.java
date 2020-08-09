package Array;

import java.util.Arrays;

public class ex77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to create a new array of length 2 from two arrays of integers
//		with three elements and the new array will contain the first and last elements 
//		from the two arrays.
		Integer[] a= {1,5,9};
		Integer[] b= {3,4,8};
		
		Integer[] c= {a[0],b[b.length-1]};
		
		
		System.out.println(Arrays.toString(c));
		
		
		
		
	}

}
