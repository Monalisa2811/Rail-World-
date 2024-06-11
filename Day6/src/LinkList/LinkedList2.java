package LinkList;

import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList();
		System.out.println("Initially list of elements are :"+ll);
		ll.add("Mona");
		ll.add("Sona");
		ll.add("Rina");
		ll.add("China");
		ll.add("hina");
		System.out.println("After adding linkedlist elements are :"+ll);
		
		ll.add(1,"Gourav");
		System.out.println("After adding Gourav :"+ll);
		
		LinkedList<String> ll1=new LinkedList();
		ll1.add("Sidhi");
		ll1.add("Gugu");
		ll.addAll(ll1);
		System.out.println("After adding ll1 in ll :"+ll);
		
		LinkedList<String> ll2=new LinkedList();
		ll2.add("Riki");
		ll2.add("Siku");
		System.out.println("ll2 items :"+ll2);
		
		ll.addAll(1,ll2);
		System.out.println("After adding ll2 after index 1 of ll :"+ll);
		ll.addFirst("Minu");
		System.out.println("After adding Minu in first :"+ll);
		
		ll.addLast("Srinu");
		System.out.println("After adding Srinu at the end :"+ll);
	}

}
