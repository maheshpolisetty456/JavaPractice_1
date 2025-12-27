package Demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test9 {

	public static void main(String[] args) {
		//find the even number of the given list
		
//		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
//		
//		List<Integer> result = list.stream().filter(n->n%2==0).toList();
//		
//		
//		System.out.println(result);
		
		//Find the duplicate elements in the list
		
//		List<Integer> list = Arrays.asList(1,2,1,3,4,3,4,5,6,7,8,9);
//		
//		
//		Set<Integer> set =  list.stream().filter(i->Collections.frequency(list,i)>1).collect(Collectors.toSet());
//		System.out.println(set);
		
		//find the first non- repeated character in a string
		
//		String  str = "swiss";
//		
//		Character ch= str.chars()
//			.mapToObj(c->(char)c)
//			.collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
//			.entrySet()
//			.stream()
//			.filter(f->f.getValue()==1)
//			.map(Map.Entry::getKey)
//			.findFirst()
//			.get();
//		
//		System.out.println(ch);
		
		//count the frequency of the each elements
	
//		List<String> list = Arrays.asList("Mahesh","Mounika","Mahi","Mahesh","kamala","Jaffa");
//		
//		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(map);
		
		
		//sort a list of string by length
		
//		List<String> list = Arrays.asList("Mahesh","Mahi","Mounika","Mah");
//		
//		
//		List<String> result= list.stream().sorted(Comparator.comparing(String::length).reversed()).toList();
//		
//		System.out.println(result);
		//find the maximuam and minmum number of the list
		
//		List<Integer> list = Arrays.asList(1,2,1,3,4,3,4,5,6,7,8,9);
//		
//		int min=list.stream().min(Integer::compareTo).get();
//		int max =list.stream().max(Integer::compare).get();
//		
//		System.out.println("Max: "+max+" Min: "+min);
//		
		
		//find the second higest number list
		
//		List<Integer> list = Arrays.asList(1,2,3,4,6,7,5,8,9,1);
//		
//		Integer result = list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
//		
//		System.out.println(result);
		
//		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
//		List<Integer> list2 = Arrays.asList(5,6,7,8,9,10);
//		
//		List<Integer> result= Stream.concat(list1.stream(), list2.stream()).distinct().toList();
//		
//		System.out.println(result);
		
		//Create the Thread using the list
		
//		new Thread(()->System.out.print("Mahesh is running the thread....")).start();
		
		//filter and print the name start with M
		
//		List<String> list = Arrays.asList("Mahesh","Kamal","Ramu","Mouni");
//		
//		List<String> result= list.stream().filter(n->n.startsWith("M")).toList();
//		
//		System.out.println(result);
		
		//Reverse a each word in a sentence
		
//		String str = "java is a programing language and it is use full for application developement";
//		
//		String result =Arrays.stream(str.split(" ")).map(c->new StringBuilder(c).reverse().toString()).collect(Collectors.joining(" "));
//		
//		System.out.println(result);
		
//		List<String> list = Arrays.stream(str.split(" ")).map(String::toUpperCase).toList();
//		
//		System.out.println(list);
		
		//print the number of vowels, consonants, digits, special and spaces in the given string
		
		
//		String str = "java is a programing language 123456 #$%^&^%";
//		
//		int vowels=0;
//		int consonants=0;
//		int digits =0;
//		int special =0;
//		int spaces=0;
//		
//		for(Character c : str.toCharArray()) {
//			if(Character.isLetter(c)) {
//				if("AEIUOaeiou".indexOf(c)!=-1) {
//					vowels++;
//				}else {
//					consonants++;
//				}
//			}else if(Character.isDigit(c)) {
//				digits++;
//			}else if(c ==  ' ') {
//				spaces++;
//			}else {
//				special++;
//			}
//		}
//		System.out.println("vowels: "+vowels);
//		System.out.println("consonants: "+consonants);
//		System.out.println("digits: "+digits);
//		System.out.println("spaces: "+spaces);
//		System.out.println("special: "+special);
		
		
//		String str = "java is a programing java is a language 123456 #$%^&^%";
//		
//		String result=  Arrays.stream(str.split(" ")).distinct().collect(Collectors.joining(" "));
//		System.out.println(result);
		
		//Find Frequency of Each Character (Ignore Spaces)
		
//		String str = "java is a programing java is a language";
//		
//		Map<Character, Long> map = str.replace(" ", "").chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(map);
		
		//Find Longest Word in a Sentence
		
//		String str = "java is a programing java is a language";
//		
//		Arrays.stream(str.split(" "))
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		

	}

}
