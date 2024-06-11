package LinkList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList1 {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList();
		ll.add("Mona");
		ll.add("Sona");
		ll.add("Rina");
		ll.add("China");
		ll.add("hina");
		
		Iterator<String> itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
