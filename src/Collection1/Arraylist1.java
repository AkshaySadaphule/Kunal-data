package Collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Velocity");
		al.add(90);
		al.add('A');
		al.add(99.9f);
		al.add("Velocity");
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.indexOf("Velocity"));
		System.out.println(al.lastIndexOf("Velocity"));
		System.out.println(al.set(3, 'B'));
		System.out.println("Updated value "+al);
		
		System.out.println(al.isEmpty());
		System.out.println(al.contains(90));
		
		System.out.println(al.get(4));
		
		al.add(1, "Morning batch");
		System.out.println(al);
		
		al.remove(1);
		System.out.println(al);
		
		System.out.println("**********By using for loop************");
		
		for(int i =0 ; i<al.size(); i++) 
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("*******By using for each loop***********");
		
		for(Object e:al) 
		{
			System.out.println(e);
		}
		
		System.out.println("*******By using iterator***********");
		
		Iterator it = al.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		
		ListIterator lit = al.listIterator();
		while(lit.hasNext()) 
		{
			System.out.println(lit.next());
		}
		
		

	}

}
