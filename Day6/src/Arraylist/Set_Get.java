package Arraylist;

import java.util.ArrayList;

public class Set_Get {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList();
		al.add("Apple");
		al.add("Banana");
		al.add("Orange");
		al.add("Sugarcane");
		al.add("Lichi");
		al.add("Mango");
		
		System.out.println(al.get(1)); //it will print 1 index element
		
		al.set(1, "Pears");//it will replace 1 index value with the newly assign value
		
		System.out.println(al);
	}

}
