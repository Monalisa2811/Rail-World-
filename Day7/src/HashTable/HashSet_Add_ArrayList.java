package HashTable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashSet_Add_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("1");
		al.add("2");
		al.add("#");
		
		HashSet<String> hs=new HashSet<String>(al);
		hs.add("7");
		hs.add("7%");
		
		Iterator<String> li=hs.iterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
	}

}
