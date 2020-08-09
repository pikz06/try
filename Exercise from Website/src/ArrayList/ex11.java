package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a= new ArrayList<>();
		a.add("Pal");
		a.add("Nik");
		a.add("Koko");
		a.add("DSP");
		a.add("Kishan");
		
		System.out.println(a);
		
//		 Write a Java program to reverse elements in a array list.
		
		Collections.reverse(a);
		System.out.println(a);
		
//		 Write a Java program to extract a portion of a array list.
		
		List<String> sub= a.subList(0, 3);
		System.out.println(sub);
		
//		Write a Java program to compare two array lists.
		
		 ArrayList<String> c3 = new ArrayList<String>();
         for (String e : a)
            c3.add(sub.contains(e) ? "Yes" : "No");
         System.out.println(c3);
           
//         Write a Java program of swap two elements in an array list.
         
         Collections.swap(a,3,2) ;
         System.out.println(a);
         
//         Write a Java program to join two array lists
         
         ArrayList<String> x= new ArrayList<>();
         x.addAll(a);
         x.addAll(c3);
         System.out.println(x);
         
//         Write a Java program to clone an array list to another array list
         
         ArrayList<String> y= (ArrayList<String>)a.clone();
         System.out.println(y);
         
//         Write a Java program to empty an array list.
         
        y.removeAll(y);
        System.out.println(y);
        
//        Write a Java program to test an array list is empty or not.
        
      System.out.println( (y.isEmpty() ? "Yes it is empty!!":"Not Empty"))  ;
        	
	
	}

}
