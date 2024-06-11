package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Apple");
		al.add(12);
		al.add(true);
		al.add(3.5);
		al.add(4.9f);
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
