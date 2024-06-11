package HashTable;

import java.util.Hashtable;

public class GetOrDefault {

	public static void main(String[] args) {
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(1,"Apple");
		ht.put(2,"Banana");
		ht.put(3, "Orange");
		ht.put(4, "Pears");
		ht.put(5, "Guava");
		
		System.out.println(ht.getOrDefault(1,"Not found"));
		
		System.out.println(ht.getOrDefault(6,"Not found"));
	}

}
