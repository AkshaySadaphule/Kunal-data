package Collection1;

import java.util.HashSet;
import java.util.Iterator;


public class Hashset {

	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();
		
		hs.add("pune");
		hs.add("pune");
		hs.add(null);	
		hs.add(null);
		hs.add(123);
		hs.add(12.12);
		hs.add('A');
		
		
		System.out.println(hs);
		
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		
		//System.out.println(hs.remove(0));
		//System.out.println(hs);
		
		System.out.println("=========for each==========");
		
		for(Object e:hs) 
		{
			System.out.println(e);
		}
		
		System.out.println("=========for each==========");
		
//		for(int i =0; i<=hs. ; i++) 
//		{
//			System.out.println();
//		}
		
		System.out.println("=========iterator==========");
		
		Iterator it = hs.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
		
		
	}

}
