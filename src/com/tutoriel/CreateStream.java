package com.tutoriel;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class CreateStream {
	public static void main(String[] args) {
		
		
		//create stream
		
			Stream<String> stream=Stream.of("a","b","c");
			stream.forEach(System.out::println);
			
		//create a stream from list
			List<String> list=Arrays.asList("JAVA","J2EE","SPRING");//my liste
			Stream<String> stream2=list.stream();//convert list(ordonnée) in stream
			stream2.forEach(System.out::println);//display my stream with forEach
		
	  //create a stream from set liste non ordonnée
			Set<String> set =new HashSet<>(list);
			Stream<String> stream3=set.stream();
			stream3.forEach(System.out::println);
			
			//create a stream from array
			String[] strArray= {"d","e","f"};
			Stream <String> stream4=Arrays.stream(strArray);
			stream4.forEach(System.out::println);
			
			
				
	}
}
