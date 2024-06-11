package HashTable;

import java.util.Hashtable;
import java.util.Map;

public class BookMAp {

	public static void main(String[] args) {
		Map<Integer,Book> m=new Hashtable<Integer,Book>();
		
		Book b1= new Book(111,"Let us C","Yashwant Kanetkar","BPB",8);
		Book b2= new Book(222,"C++","Saksi","CPB",4);
		Book b3=new Book(333,"Operating System","Galvin","Wiley",6);  
		
		m.put(1, b1);
		m.put(2, b2);
		m.put(3, b3);
		
		 for(Map.Entry<Integer, Book> entry:m.entrySet()){    
		        int key=entry.getKey();  
		        Book b=entry.getValue();  
		        System.out.println(key+" Details:");  
		        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
		    }    

	}

}
