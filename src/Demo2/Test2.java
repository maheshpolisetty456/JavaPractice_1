package Demo2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) {
		//find all even number from the list
		
//		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//		
//		List<Integer> result =list.stream().filter(t->t%2==0).toList();
//		
//		System.out.println(result);
		
		//find duplicate elements in list
		
//		List<Integer> list = Arrays.asList(1,2,3,4,4,3,5,6,7,8,8,9);
//		
//		Set<Integer> result =list.stream().filter(f->Collections.frequency(list,f)>1).collect(Collectors.toSet());
//		
//		System.out.println(result);
//		List<Integer> list = Arrays.asList(1,2,3,4,4,3,5,6,7,8,8,9);
//		
//		List<Integer> result = list.stream().filter(c->Collections.frequency(list,c)==1).toList();
//		
//		System.out.println(result);
		
		//Count the frequency of the elements
		
//		List<String> str = Arrays.asList("Apple","Mango","Kiwi","Apple","Potato","Love");
//		
//		Map<String,Long > result = str.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		
//		System.out.println(result);
		
		//sort a list of string by length
		
//		List<String> str = Arrays.asList("Appleee","Mango","Kiwi","Applee","Potato","Love");
//		
//		List<String> result =str.stream().sorted(Comparator.comparing(String::length)).toList();
//		
//		System.out.println(result);
		//find the maximum and minimum number from the list
		
//		List<Integer> list = Arrays.asList(1,2,5,8,9,3,4);
//		
//		Integer max =list.stream().max(Integer::compare).get();
//		Integer min = list.stream().min(Integer::compare).get();
//		
//		System.out.println("Max: "+max);
//		System.out.println("Min: "+min);
		
//		String str = "java is a prgraming111 language";
//		
//		String result =Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length)).get();
//		
//		System.out.println(result);
		
		//reverse the word from the string
		

		
		
//		String result =Arrays.stream(str.split(" ")).map(c-> new StringBuffer(c).reverse().toString()).collect(Collectors.joining(" "));
//		System.out.println(result);
		
		//revese a sentence from the list
		
//		String str = "java is a prgraming111 language";
//		String[] arr = str.split(" ");
//		String out = "";
//		
//		for(int i = arr.length-1;i>=0;i--) {
//			out = out+ arr[i]+" ";
//		}
//		
//		System.out.println(out.trim());
//		
//		
		//count the vowels, consonents, digits, spacial Characters, 
		
		String str = "Java is a programing language 1234 @#$%$%^ $%jmsfgd";
		
		int vowels=0;
		int consonents=0;
		int digits=0;
		int spacial=0;
		int spaces=0;
		
		for(char c : str.toCharArray()) {
			if(Character.isLetter(c)) {
				if("AEIOUaeiou".indexOf(c)!=-1) {
					vowels++;
				}else {
					consonents++;
				}
			}else if(Character.isDigit(c)) {
				digits++;
			}
			else if(c == ' ') {
				spaces ++;
			}else {
				spacial++;
			}
		}
		System.out.println("Vowels: "+vowels);
		System.out.println("Consonents: "+consonents);
		System.out.println("Digits: "+digits);
		System.out.println("Spacial: "+spacial);
		System.out.println("Spaces: "+spaces);
		
	}

}
