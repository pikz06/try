package Array;

import java.util.Arrays;

public class ex94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Write a Java program to rearrange all the elements of an given array of integers so 
//		 that all the odd numbers come before all the even numbers. 
		
		
		int[] a = {1, 7, 8, 5, 7, 13, 0, 2, 4, 9};
		  
		int i = 0;
	    System.out.println("Original Array: "+Arrays.toString(a)); 
	    while(i < a.length && a[i] % 2 == 0)
	        i++;
	              
	    for(int j = i + 1; j < a.length; j++) {
	        if(a[j] % 2 != 0) {
	            int temp = a[i];
	           a[i] = a[j];
	            a[j] = temp;
	            i++;
			
		}
			
		}
	    System.out.println("New Array: "+Arrays.toString(a)); 
	  }
	}


