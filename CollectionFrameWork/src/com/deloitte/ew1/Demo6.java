package com.deloitte.ew1;

import java.util.HashMap;
import java.util.Map;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Character, Integer> charOcc = new HashMap<>();
		
		String str = "Rahul Shetty";
		
		for(char c: str.toCharArray())
		{
			if (charOcc.containsKey(c))
			{
				int oc = charOcc.get(c) + 1;
				charOcc.put(c, oc);
			}
			else
			{
				charOcc.put(c, 1);
			}
		}
		
		charOcc.forEach((c, oc) -> System.out.println(c+" is present:"+oc+" times."));

	}

}
