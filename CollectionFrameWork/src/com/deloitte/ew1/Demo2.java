package com.deloitte.ew1;

//import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<StringBuffer> sbs = new ArrayList<>();
		sbs.add(new StringBuffer("1"));
		sbs.add(new StringBuffer("2"));
		sbs.add(new StringBuffer("3"));
		sbs.add(new StringBuffer("4"));
		
		//Iterator<StringBuffer> itr = sbs.iterator();
		
		/*while(itr.hasNext())
		{
			sbs.remove(itr.next());
		}*/
		
		int size = sbs.size();
		for (int i = 0; i < size; i++)
		{
			System.out.println(sbs.get(i));
			 
		}
		
		sbs.forEach(System.out::println);

	}

}
