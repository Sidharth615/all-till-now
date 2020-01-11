package com.deloitte.ew1;

import java.util.Arrays;
import java.util.List;


public class Demo4 {
	public static boolean isPrime(int x)
	{
		for(int i = 2; i < x; i++ )
		{
			if (x % i == 0)
				return false;
		}
		return true;
		
	}
	
	public static boolean isLeap(int x)
	{
//		if(x%100==0) {
//			return x%400==0;
//		}
//		else {
//			return x%4==0;
//		}
		
		
		 return ((x % 4 == 0 && x % 100 != 0) || x % 400 == 0);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> items = Arrays.asList("Abhi", "Payal", "Rahul", "Mohan");
		items.stream().filter(s -> s.contains("Ra")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
		System.out.println();
		System.out.print("");
		
		List<Integer> nums = Arrays.asList(2,34,35,21,6,64,123,53,213,121);
		nums.stream().filter((t)-> (t%2 == 0) && (t%3 == 0)).forEach(t -> System.out.println(t));
		System.out.println();
		System.out.print("");
	
		List<Integer> primeChecker = Arrays.asList(2,34,35,21,6,64,123,53,213,121);
		primeChecker.stream().filter(Demo4::isPrime).forEach(t -> System.out.println(t));
		System.out.println();
		System.out.print("");
		
		List<Integer> years = Arrays.asList(2000, 1996, 2019, 2012, 2015, 1986);
		years.stream().filter(Demo4::isLeap).forEach(t -> System.out.println(t));
	}

}
