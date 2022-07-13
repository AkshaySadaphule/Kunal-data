package Collection1;

import java.util.Iterator;

public class LinkedHashSet {

	public static void main(String[] args) 
	{
		java.util.LinkedHashSet ll = new java.util.LinkedHashSet ();
		ll.add("pune");
		ll.add("pune");
		ll.add(null);	
		ll.add(null);
		ll.add(123);
		ll.add(12.12);
		ll.add('A');
		
		System.out.println(ll);
		
		System.out.println(ll.isEmpty());
		System.out.println(ll.clone());
		
		
		System.out.println("======for each==========");
		
		for(Object e:ll) 
		{
			System.out.println(e);
		}
		
		System.out.println("=====iterator==========");
		
		Iterator it = ll.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
		
	}

}
