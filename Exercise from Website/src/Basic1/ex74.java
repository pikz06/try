package Basic1;

public class ex74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		. Write a Java program to test if 10 appears as either the 
//		first or last element of an array of integers. The length of 
//		the array must be greater than or equal to 2. 
		
Integer[] narray= {10,20,5,10,4,50};

if(narray[0]==10 || narray[narray.length-1]==10){
	System.out.println("First or Last 10");
}
if(narray[0]==narray[narray.length-1]) {
	System.out.println("First and Last same");
}else {
	System.out.println("First and last not same");
}

	}

}
