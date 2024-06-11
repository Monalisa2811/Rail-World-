package HashTable;

import java.util.HashSet;

public class Methods_Set {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();  
        set.add("Ravi");  
        set.add("Vijay");  
        set.add("Arun");  
        set.add("Sumit");  
        
        System.out.println("set :"+set);
        
        HashSet<String> set1=new HashSet<String>();
        set1.add("Muna");
        set1.add("Kuna");
        System.out.println("set1 : "+set1);
        
        set.addAll(set1);
        System.out.println("After adding set1 in set "+set);
        
        set.removeIf(str->str.contains("Vijay"));
        System.out.println("After remove Vijaya : "+set);
        
        set.removeAll(set1);
        System.out.println("After removeing set1 from set : "+set);
        
        set.clear();
        System.out.println("After clear() : "+set);
        
	}

}
