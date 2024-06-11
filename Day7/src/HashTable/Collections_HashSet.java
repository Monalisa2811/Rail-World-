package HashTable;

import java.util.*;

public class Collections_HashSet {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet();
		hs.add("one");
		hs.add("two");
		hs.add("three");
		
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
