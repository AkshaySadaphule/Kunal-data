package Collection1;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {

	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();
		
		ll.add("pune");
		ll.add("pune");
		ll.add(null);
		ll.add(null);
		ll.add(123);
		ll.add(12.12);
		ll.add('A');
		ll.add(true);
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.peek());
		System.out.println(ll);
		System.out.println(ll.poll());
		System.out.println(ll);
		System.out.println(ll.pop());
		System.out.println(ll);
		System.out.println(ll.get(3));
		System.out.println(ll.remove());
		System.out.println(ll);
		
		System.out.println("======For loop=============");
		
		for(int i =0 ; i<=ll.size()-1; i++) 
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("======Iterator=============");
		
		Iterator it = ll.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		System.out.println("====== List Iterator=============");
		
		ListIterator lit = ll.listIterator();
		while(lit.hasNext()) 
		{
			System.out.println(lit.next());
		}
		System.out.println("======For each=============");
		
		for(Object e:ll) 
		{
			System.out.println(e);
		}
		
		ArrayList<Integer> mn = new ArrayList();
		
		mn.add(1);
		mn.add(null);
		mn.add(123);
		mn.add(12);
		
		System.out.println("======Foreach specific function=============");
		for(Integer j:mn)
		{
			System.out.println(j);
		}
		
		System.out.println("========iterator==========");
		
		ArrayList<Character> ac = new ArrayList();
		
		ac.add('a');
		ac.add('b');
		ac.add('c');
		ac.add('d');
		ac.add(null);
		
		Iterator<Character> bc = ac.iterator();
		while(bc.hasNext()) 
		{
			System.out.println(bc.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
