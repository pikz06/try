package Array;

public class avgofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Write a Java program to find the numbers greater than the average of the numbers of a given array. 
		
		Integer b[]= new Integer[] {10,20,30,40,50,5,4,3,2,1};
		int s=0;
		for(int i=0; i<b.length-1;i++) {
			s+=b[i];
		}
		System.out.println(s);
		int avg= s/b.length;
		System.out.println(avg);
		
		for (int j=0;j<b.length;j++) {
			if (b[j]>avg) {
				System.out.println(b[j]);
			}
		}
	}

}
