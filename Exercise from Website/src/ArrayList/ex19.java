package ArrayList;

import java.util.ArrayList;

public class ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to trim the capacity of an array list the current list size
		
		ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        
        System.out.println("Original array list: " + c1);
        System.out.println("Let trim to size the above array: ");
        c1.trimToSize();
        System.out.println(c1);
        
//        Write a Java program to increase the size of an array list.
        c1.ensureCapacity(10);
        c1.add("Orange");
        c1.add("Maroon");
        c1.add("Yellow");
        System.out.println("New array list: " + c1);
        
//        Write a Java program to replace the second element of a ArrayList with the specified element.
        
        c1.set(1, "element");
        System.out.println(c1);
        
//        Write a Java program to print all the elements of a ArrayList using the position of the elements.
        
        for(int i=0;i<c1.size();i++) {
        	System.out.println("Colout at position "+(i+1)+" and at index "+i+" is "+c1.get(i));
        }
        
 }
        
	}


