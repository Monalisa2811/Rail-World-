package HashTable;

import java.util.Hashtable;

public class PutIfAbsent {

	public static void main(String[] args) {
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(1,"Apple");
		ht.put(2,"Banana");
		ht.put(3, "Orange");
		ht.put(4, "Pears");
		ht.put(5, "Guava");
		ht.put(5, "Unknown");
		
		System.out.println(ht);
		
		System.out.println(ht.putIfAbsent(5, "Grapes"));
		
		System.out.println(ht);
		System.out.println(ht.putIfAbsent(6, "Grapes"));
		
		System.out.println(ht);
	}

}
