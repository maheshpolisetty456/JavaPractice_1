package Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test10 {

	public static void main(String[] args) {
//		
//	String str = "Mahesh";		
//	String output=	new StringBuilder(str).reverse().toString();
//	
//	System.out.println(output);
	
		//remove the duplicate characters
		
//		String str = "Mahesh";
//		 String result =str.chars().mapToObj(c->String.valueOf((char)c))//conver the char string
//		.distinct()
//		.collect(Collectors.joining(""));
//		 
//		 System.out.println(result);
		
		//revese each work in the string 
		
//		String str = "java is a power full programing language";
//		
//	String result =	Arrays.stream(str.split(" "))
//				.map(c->new StringBuilder(c).reverse().toString())
//				.collect(Collectors.joining(" "));
//		System.out.println(result);
		
		//find the character occurence
//		String str = "Mahesh";
//		
//		long count =str.chars()
//				.filter(c->c=='h').count();
//		System.out.println(count);
		
		//find the not repeated characters in given string
		
//		String str = "Mahesha";
//		List<Character> list = new ArrayList<Character>();
//		for(char i : str.toCharArray()) {
//			list.add(i);
//		}
		
		
//	String ch=	str.chars().mapToObj(c->String.valueOf((char)c))
//					.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
//					.entrySet()
//					.stream()
//					.filter(f->f.getValue()==1)
//					.map(Map.Entry::getKey)
//					.collect(Collectors.joining());
//	
//	System.out.println(ch);
		
		//Move negative number to front
		
//		List<Integer> list = Arrays.asList(1,2,3,-1,-3,7,-5);
//		 List <Integer> result =Stream.concat(list.stream().filter(f1 -> f1 < 0),
//					  list.stream().filter(f2 -> f2 > 0)).toList();
//		System.out.println(result);
//		
//		//Move the all zero to last in list
//		List<Integer> list1 = Arrays.asList(1,2,3,0,3,4,0,5,6,0,6,7);
//		List<Integer> result2=Stream.concat(list1.stream().filter(f -> f!=0),
//					  list1.stream().filter(f->f==0)).toList();
//		
//		System.out.println(result2);
		
		
		//find the character from the list of unique words in sentences  and sorted alphabetically 
		
//		String str  = "Java is a power full and Java is a Fun";
		
		
//		List<String> list =Arrays.stream(str.split(" ")).map(String::toLowerCase).distinct().sorted().toList();
//		
//		 String result =Arrays.stream(str.split(" ")).map(String::toLowerCase).distinct().sorted().collect(Collectors.joining(" "));
//		 
//		 System.out.println(result);
//		System.out.println(list);
		
		//find the unique word in the list and sorted by alphabets
		
//		List<String > list = Arrays.asList(null)
		
		
		
	}

}
