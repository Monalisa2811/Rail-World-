package LinkList;

import java.util.LinkedList;

public class RemoveElement {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList();
		ll.add("Mona");
		ll.add("Sona");
		ll.add("Rina");
		ll.add("China");
		ll.add("hina");
		System.out.println("After adding linkedlist elements are :"+ll);
		
		ll.remove(1);
		System.out.println("after removing list"+ll);
		ll.remove("Rina");
		System.out.println("After removing Rina :"+ll);
		ll.removeFirst();
		System.out.println("After removing 1st element :"+ll);
		
		ll.add("Sri");
		ll.add("Pihu");
		ll.add("Chinu");
		System.out.println(ll);
		ll.removeFirstOccurrence("Chinu");
		System.out.println("After removeFirstOccurrence(ll) :"+ll);
		
		ll.clear();
		System.out.println("After clear :"+ll);
	}

}
