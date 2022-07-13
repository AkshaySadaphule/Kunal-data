package Collection1;

import java.util.Iterator;

public class TreeSet {

	public static void main(String[] args) 
	{
		java.util.TreeSet ts = new java.util.TreeSet();
		
		ts.add(1);
		ts.add(2);
		ts.add(8);	
     	ts.add(10);
		ts.add(123);
		ts.add(12);
		ts.add(1290);

		System.out.println(ts);
		System.out.println(ts.isEmpty());
		System.out.println(ts.remove(1));
		System.out.println(ts);
		
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		
	    System.out.println("=======for each============");
	    
	    for(Object e:ts) 
	    {
	    	System.out.println(e);
	    }
	    
	    System.out.println("=======iteratot============");
	    
	    Iterator it = ts.iterator();
	    while (it.hasNext()) 
	    {
	    	System.out.println(it.next());
	    }
	    
	  

	}

}
