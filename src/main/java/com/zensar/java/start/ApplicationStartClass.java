package com.zensar.java.start;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class ApplicationStartClass {

	public static void main(String[] args) {
		
		ConceptCheckClass ccc = new ConceptCheckClass();
		
//		ccc.stringArraySortByFunctionalInterface();
		
//		ccc.convertStringToNumberUsingFunctionalInterface();
		
		List<String> strList = Arrays.asList("ddd2","aaa1","bbb1","ccc0","aaa2","ddd1","bbb2");
		/*
		System.out.println("****** Sort ******");
		ccc.streamSortedCheck(strList);
		
		System.out.println("****Reverse Sort****");
		ccc.streamReverseSortedCheck(strList);
		*/

//		ccc.streamMapCheck(strList);
		
//		List<String> strNumList = Arrays.asList("34","12","31","1","65","11");
		
//		ccc.streamMapConvertIntegerCheck(strNumList);
		
//		ccc.streamMatch(strList);
		
		/*
		 * ccc.streamReduce(strList);
		 * 
		 * ccc.streamSortReduce(strList);
		 * 
		 * ccc.streamSortFilterReduce(strList);
		 */
		int max = 1000000;
		List<String> strUUIDList = new ArrayList<String>();
		for(int i=0;i<max;i++) {
			UUID uuid = UUID.randomUUID();
			strUUIDList .add(uuid.toString());
		}
		
		ccc.streamSequentialSort(strUUIDList);
		
		ccc.streamParallelSort(strUUIDList);
		
	}
	
	

}
