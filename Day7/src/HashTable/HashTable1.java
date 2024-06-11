package HashTable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class HashTable1 {

	public static void main(String[] args) {
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(1,"Apple");
		ht.put(2,"Banana");
		ht.put(3, "Orange");
		ht.put(4, "Pears");
		ht.put(5, "Guava");
		
		for(Entry m:ht.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue()); 
		}
	}

}
