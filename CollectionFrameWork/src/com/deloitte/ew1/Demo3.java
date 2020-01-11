package com.deloitte.ew1;


import java.util.Arrays;
import java.util.List;

public class Demo3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		List<Integer> nums = Arrays.asList(5, 2, 1, 3, 9);
		
		int sum = 0;
		
		for (int num: nums)
		{
			if(num%2 != 0)
			{
				sum = sum + (num*num);
			}
		}
		System.out.println("Sum: "+sum);

		
		//Using stream and map
	}

}
