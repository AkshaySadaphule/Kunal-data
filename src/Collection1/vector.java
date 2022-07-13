package Collection1;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class vector {

	public static void main(String[] args) 
	{
		Vector  v = new Vector();
		
		v.add("pune");
		v.add('A');
		v.add(null);
		v.add(null);
		v.add(123);
		v.add(12.23);
		v.add(true);
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.remove(0));
		System.out.println(v);
		System.out.println(v.get(3));
		
		System.out.println("=======listiterator==========");
		
		ListIterator lit = v.listIterator();
		while(lit.hasNext()) 
		{
			System.out.println(lit.next());
		}
		
		System.out.println("=======Enumerator==========");
		
		Enumeration el = v.elements();
		while(el.hasMoreElements()) 
		{
			System.out.println(el.nextElement());
		}
		
		System.out.println("=======For loop==========");
		
		for(int i =0 ; i<=v.size()-1; i++) 
		{
			System.out.println(v.get(i));
		}
		
		System.out.println("=======For each loop==========");
		for(Object e:v) 
		{
			System.out.println(e);
		}
		
	}

}
