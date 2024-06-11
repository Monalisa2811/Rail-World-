package HashTable;

import java.util.HashSet;
import java.util.Iterator;

public class IgnoreDuplicate_HashSet {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet();
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("two");
		
		Iterator itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
