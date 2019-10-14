package com.zensar.java.start;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import com.zensar.java.finterface.Converter;

public class ConceptCheckClass {

	public void stringArraySortByFunctionalInterface() {
		List<String> names = Arrays.asList("rahul","nikhil","shubham","deeksha","ajay");
		
		Collections.sort(names, (a,b) -> a.compareTo(b));
		
		/*
		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String a, String b) {
				return a.compareTo(b);
			}
			
		});
		*/
		for(String a : names) {
			System.out.println(a);
		}
	}
	
	public void convertStringToNumberUsingFunctionalInterface() {
		Converter<Integer, String> converter = (from) -> Integer.parseInt(from);
		Integer output = converter.convert("123");
		System.out.println(output);
	}
	
	public void streamFilterCheck(List<String> strList ) {
		strList.stream().filter(s -> s.startsWith("a")).forEach(System.out :: println);
		
	}
	public void streamSortedCheck(List<String> strList ) {
		strList.stream().sorted().forEach(System.out :: println);
	}
	
	
	public void streamReverseSortedCheck(List<String> strList ) {
		strList.stream().sorted((a,b)-> b.compareTo(a)).forEach(System.out :: println);
	}
	
	public void streamMapCheck(List<String> strList ) {
		strList.stream().map(String :: toUpperCase).sorted().forEach(System.out :: println);
	}
	
	public void streamMapConvertIntegerCheck(List<String> strList) {
		strList.stream().map(Integer::parseInt).sorted().forEach(System.out::println);
	}
	
	public void streamMatch(List<String> strList) {
		boolean anyStartWithA = strList.stream().anyMatch((s) -> s.startsWith("a"));
		System.out.println("Any string Starts with A: "+anyStartWithA);
		
		boolean allStartWithA = strList.stream().allMatch((s) -> s.startsWith("a"));
		System.out.println("All string Starts with A: "+allStartWithA);
		
		boolean noneStartWithZ = strList.stream().noneMatch((s) -> s.startsWith("z"));
		System.out.println("No string Starts with Z: "+noneStartWithZ);
		
		boolean allStringSize = strList.stream().allMatch((s) -> (s.length() == 4));
		System.out.println("All string have size as 4 : "+allStringSize);
		
	}
	
	public void streamReduce(List<String> strList) {
		Optional<String> reducedString = strList.stream().reduce((s1,s2)->s1+"#"+s2);
		reducedString.ifPresent(System.out::println);
	}
	
	public void streamSortReduce(List<String> strList) {
		Optional<String> reducedString = strList.stream().sorted().reduce((s1,s2)->s1+"#"+s2);
		reducedString.ifPresent(System.out::println);
	}
	
	public void streamSortFilterReduce(List<String> strList) {
		Optional<String> reducedString = strList.stream().sorted().filter(s -> s.startsWith("a")).reduce((s1,s2)->s1+"#"+s2);
		reducedString.ifPresent(System.out::println);
	}
	
	public void streamSequentialSort(List<String> strUUIDList) {
		
		long t0 = System.nanoTime();
		long count = strUUIDList.stream().sorted().count();
//		System.out.println("Count after sort:"+count);
		long t1 = System.nanoTime();
		
		long millis = TimeUnit.MILLISECONDS.toMillis(t1-t0);
		System.out.println(String.format("Time required for Sequential sort : %d ms",millis));
	}
	
	public void streamParallelSort(List<String> strUUIDList) {

		long t0 = System.nanoTime();
		long count = strUUIDList.parallelStream().sorted().count();
//		System.out.println("Count after sort:"+count);
		long t1 = System.nanoTime();
		
		long millis = TimeUnit.MILLISECONDS.toMillis(t1-t0);
		System.out.println(String.format("Time required for Parallel sort : %d ms",millis));
	
	}
}
