package com.ivy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> numbers = new ArrayList<Integer>();
//		numbers.add(35);
//		numbers.add(351);
//		numbers.add(25);
//		numbers.add(15);
//		numbers.add(55);
//		Collections.sort(numbers);
//		System.out.println(numbers);
		
		List<Integer> numbers = Arrays.asList(60,30,35,12,94,54);
//		Collections.sort(numbers);
//		Collections.sort(numbers,(i1,i2)->i1.compareTo(i2));
		Collections.sort(numbers,Integer::compareTo);
		System.out.println(numbers);
		
	}

}
