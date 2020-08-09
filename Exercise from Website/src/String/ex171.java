package String;

public class ex171 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a Java program to accept two string and test if the second string contains the first one.
		
//		My sol.
		String a="Palak is a good girl";
		String b= "Palak";
		
		if(a.contains(b)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
//		Suggested method 
		boolean ans = false;
	     for (int i = 0; i < a.length() - 1; i++) {
	       if (a.charAt(i) == b.charAt(0)) {
	         for (int j = 0; j < b.length(); j++) {
	           if ((i + j) < a.length() && b.charAt(j) == a.charAt(i + j) && j == b.length() - 1) {
	             ans = true;
	             break;
	           }
	        }
	      }
	    }
	    System.out.println(ans);;
	  }
	}


