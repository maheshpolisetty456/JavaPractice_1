package Demo4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		//find the all even number from the list
//		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
//		
//		List<Integer> result =list.stream().filter(f->f%2==0).toList();
//		
//		System.out.println(result);
		
		//check the leap year
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the year");
//		int year = sc.nextInt();
//		
//		if(year%4 ==0 && year % 100!=0 || year %400 ==0) {
//			System.out.println(year+" is the leap year");
//		}else {
//			System.out.println("not leap year");
//		}
		
		//check the duplicate elements in the list and print
		
//		List<Integer> list = Arrays.asList(1,2,3,4,5,5,2,2,1,6,7);
//		Set<Integer>set = list.stream().filter(i->Collections.frequency(list, i)>1).collect(Collectors.toSet());
//		System.out.println(set);
		
		//find the non repleating elements
		
//		List<Integer> list = Arrays.asList(1,2,3,4,5,5,2,2,1,6,7);
//		
//		List<Integer> result =list.stream().filter(i->Collections.frequency(list, i)==1).toList();
//		
//		System.out.println(result);
		
		//find the first non repeating character in the string
		
//		String str ="swiss";
//		
//		Character character=  str.chars().mapToObj(c->(char)c)
//		 			.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
//		 			.entrySet()
//		 			.stream()
//		 			.filter(f->f.getValue()==1)
//		 			.map(Map.Entry::getKey)
//		 			.skip(1)
//		 			.findFirst()
//		 			.get();
//		System.out.println(character);
		
		//count the frequency of the each elements
		
//		List<String> list = Arrays.asList("Apple","Banana","Kiwi","Apple","Kiwi");
//		
//		Map<String, Long> result = list.stream().collect(Collectors.groupingBy(c->c,Collectors.counting()));
//		System.out.println(result);
		
//		String str = "Java is a good programing language!@#$%^&*12345678";
		
//	Map<Character, Long> map =	str.replace(" ", "").chars().mapToObj(c->(char)c)
//							.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(map);
		
		//find the vowels, consonents, digits and spacial characters
		
//		String str2 =str.replace(" ", "");
//		System.out.println(str2);
//		
//		int vowels=0;
//		int consonents=0;
//		int digits=0;
//		int spacial=0;
//		
//		for(char c : str2.toCharArray()) {
//			if(Character.isLetter(c)) {
//				if("AEIOUaeiou".indexOf(c)!=-1) {
//					vowels++;
//				}else {
//					consonents++;
//				}
//			}else if(Character.isDigit(c)){
//				digits++;
//			}else {
//				spacial++;
//			}
//		}
//		System.out.println("Vowels: "+vowels);
//		System.out.println("Consonets: "+consonents);
//		System.out.println("Digits: "+digits);
//		System.out.println("Spacial: "+spacial);
		
		//sort the list string by length
		
//		List<String> list = Arrays.asList("Apple1","Banana1","Apple22","Kiwi1");
//		
//		List<String> result =list.stream().sorted(Comparator.comparing(String::length)).toList();
//		System.out.println(result);
		
		//find the common elements from the two List
//		
//		List<Integer> list1 =  new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));// Arrays.asList();
//		List<Integer> list2 = Arrays.asList(4,5,6,7,8);
//		
//		 list1.retainAll(list2);
//		 
//		 System.out.println(list1);
		
		//find the word with maximum number of the length
		
//		List<String> list = Arrays.asList("java","programing","is");
//		
//		String word =list.stream().max(Comparator.comparing(String::length)).get();
//		
//		System.out.println(word);
		
		//reverse the words in a sentence
		
//		String str = "Java is a good programing language !@#$%^&* 12345678";
//		s
//		String[] arrStr= str.split(" ");
//		
//		String out ="";
//		
//		for(int i = arrStr.length-1;i>=0;i--) {
//			out = out + arrStr[i]+" ";
//		}
//		System.out.println(out.trim());
		
		//revere  the each word in a sentence
		
		String str = "Java is a good programing language !@#$%^&* 12345678";
		
		String result =Arrays.stream(str.split(" ")).map(f->new StringBuffer(f).reverse().toString()).collect(Collectors.joining(" "));
		System.out.println(result);
		
		
		
		/.args..........args......
	}

}
