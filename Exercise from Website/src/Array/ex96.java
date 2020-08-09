package Array;

public class ex96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to check if there is a 10 in a given array 
//		of integers with a 20 somewhere later in the array.
		
		int[] a= {10,5,6,4,2,2,1};
		boolean b=false,c=false;
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==10) {
				b=true;
			}if(a[i]==20) {
				c=true;
			}
		}if(b && c) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
