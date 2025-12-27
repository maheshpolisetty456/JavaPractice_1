package Demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//			List<String> list = Arrays.asList("apple","mango","kiwi","banana","banana");
		
//		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(map);
//		
//		List<String> result =list.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
//		
//		System.out.println(result);

		//find the maximum and minim number in the list
//			List<Integer> list = Arrays.asList(3,2,1,5,4,6,7);
//			
//			int max=list.stream().max(Integer::compare).get();
//			int min =list.stream().min(Integer::compare).get();
//			
//			System.out.println("Max: "+max);
//			System.out.print("Min: "+min);
		
		//find the socond highest number in the list
//		List<Integer> list = Arrays.asList(3,2,1,5,4,6,7);
//		int result = list.stream().sorted(Comparator.reverseOrder())
//						.distinct()
//						.skip(1)
//						.findFirst()
//						.get();
//		System.out.println(result);
		
		//merge two list removeing the duplciate
		
//		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
//		List<Integer> list2 = Arrays.asList(4,5,6,7,8,8);
//		
//		List<Integer> list =Stream.concat(list1.stream(), list2.stream()).distinct().toList();
//		
//		System.out.println(list);
		
		
//		new Thread(()->System.out.println("Thread is running")).start();
		
		//revers each word in the sentence
		
//		String str = "java is a powefull programing language";
//		String result=Arrays.stream(str.split(" ")).map(n->new StringBuilder(n).reverse().toString()).collect(Collectors.joining(" "));
//		System.out.println(result);
//		
//		String str = "java is a powefull programing language and java is also use full";
//		
//		String result =Arrays.stream(str.split(" "))
//				.distinct()
//				.collect(Collectors.joining( " "));
//		System.out.println(result);
		
		//fint the frequency of the each characte and ignore the spaces
		
//		String str = "java is a powefull programing language";
//		
//		Map<Character,Long> map = str.replace(" ", "").chars().mapToObj(c-> (char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(map);
		
		//find the largest word in the sentence
		
//		String str = "java is a prgraming languagedc";
//		
//		String word =Arrays.stream(str.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
//		
//		System.out.println(word);
		
		//convert the list of integer to , seperate String
		
//		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
//		
//		String str =list.stream().map(String::valueOf).collect(Collectors.joining(","));
//		System.out.println(str);
		//count vowels and consonents and digits and special character
		
//		String str = "java is a progrming language @ 123456 @#$%^";
//		
//		int vowels =0;
//		int consonents =0;
//		int digits =0;
//		int special =0;
//		int spaces =0;
//		
//		for(char c : str.toCharArray()) {
//			if(Character.isLetter(c)) {
//				if("AEIOUaeiou".indexOf(c)!= -1) {
//					vowels++;
//				}else {
//					consonents++;
//				}
//			}else if(Character.isDigit(c)) {
//				digits++;
//			}else if(c == ' '){
//				spaces++;
//			}else {
//				special++;
//			}
//		}
//		System.out.println("Vowels: "+vowels);
//		System.out.println("Consonents: "+consonents);
//		System.out.println("Digits: "+digits);
//		System.out.println("Speical Characters: "+special);
//		System.out.println("Spaces: "+spaces);
		
		
		
		//find the duplicate elents from the Arrays
		
//		int[] arr =  {1,2,3,4,5,6,7,8,9,2,3,4,5};
//		
//		for(int i= 0; i< arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i] == arr[j]) {
//					System.out.print(arr[i]);
//				}
//			}
//		}
//		
		
		
		//remove the duplicate from the string
		
//		String str = "mahesh";
//		String removed = Arrays.stream(str.split("")).distinct().collect(Collectors.joining());
//		
//		System.out.println(removed);
		
		//reverse the word in the seesntencne
		
		String str = "java is a programing language";
		
		String[]  words = str.split(" ");
		String output ="";
		
		for(int i=words.length-1; i>=0;i--) {
			output=output+words[i]+" ";
		}
		System.out.println(output.trim());
		
				
				
		
		
		
		
		
		
		

	}

}
