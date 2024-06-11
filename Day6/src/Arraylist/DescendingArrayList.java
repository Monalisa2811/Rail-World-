package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class DescendingArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> ali=new ArrayList();
		ali.add(12);
		ali.add(9);
		ali.add(7);
		ali.add(54);
		ali.add(65);
		ali.add(514);
		
		System.out.println("Befor sorting:"+ali);
		
		Collections.sort(ali);
		System.out.println("Ascending order:"+ali);
		
		Collections.reverse(ali);
		System.out.println("Descending order:"+ali);

	}

}
