package LinkList;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList();
		ll.add("Simi");
		ll.add("Rimi");
		ll.add("Roni");
		
		Iterator itr=ll.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
