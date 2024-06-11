package Arraylist;

import java.util.ArrayList;

public class For_Each_Loop {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList();
		al.add("Apple");
		al.add("Banana");
		al.add("Orange");
		al.add("Sugarcane");
		//al.add(12);
		al.add("Lichi");
		al.add("Mango");

		for(String s:al)
			System.out.println(s);
		

	}

}
