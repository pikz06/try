package pattern;

public class righttrianglewithsamenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a number in a row
		
		int i=7;
		for (int j=1;j<=i;j++) {
			for(int k=1;k<=j;k++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}

}
