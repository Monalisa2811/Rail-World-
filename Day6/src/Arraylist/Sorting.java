package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList();
		al.add("Apple");
		al.add("Banana");
		al.add("Orange");
		al.add("Onion");
		al.add("Sugarcane");
		//al.add(12);
		al.add("Lichi");
		al.add("Mango");
		System.out.println("Before sorting :"+al);
		
		Collections.sort(al);
		
		System.out.println("After sorting : "+al);
		
		ArrayList<Integer> ali=new ArrayList();
		ali.add(12);
		ali.add(9);
		ali.add(7);
		ali.add(54);
		ali.add(65);
		ali.add(514);
		
		System.out.println("Befor sorting:"+ali);
		
		Collections.sort(ali);
		
		System.out.println("After sorting:"+ali);
	}

}
