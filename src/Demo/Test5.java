package Demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test5 {

	public static void main(String[] args) {
		// find all even number from the list
//		List<Integer> list = Arrays.asList(1,2,3,4,5,6,9);
//		
//		List<Integer> result = list.stream().filter(n->n%2==0).toList();
//		System.out.println(result);
		
		//Find the duplicate elements in the list
		
		
//		List<Integer> list = Arrays.asList(1,3,5,6,2,8,7,2,3,4,5,6,9);
//		
//		Set<Integer> set= list.stream().filter(n-> Collections.frequency(list, n)>1).collect(Collectors.toSet());
//		System.out.println(set);
		//find the first non replated character from the string
		
//		String str = "swiss";
//		
//		Character ch=str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
//												.entrySet().stream().filter(n->n.getValue()==1)
//												.map(Map.Entry::getKey)
//												.findFirst()
//												.get();
//		System.out.println(ch);
		
//		List<String > list = Arrays.asList("Mahesh","Mouni","Remash","kiran","Lakshmi");
//		
//		list.stream().sorted(Comparator.comparing(String::length))
//		.forEach(System.out::println);
		
		//Find the max and min number from the list
		
//		List<Integer> list = Arrays.asList(1,7,5,4,3,2);
//		
//		int max=list.stream().max(Integer::compare).get();
//		int min = list.stream().min(Integer::compare).get();
//		
//		System.out.println("Max: "+max);
//		System.out.println("Min: "+min);
		
		//find the Srcond highest number 
		
		
//		List<Integer> list = Arrays.asList(1,7,5,4,3,2);
//		
//		int i =list.stream().sorted(Comparator.reverseOrder())
//						.distinct()
//						.skip(1)
//						.findFirst()
//						.get();
//		System.out.println(i);
		
		//merge two list and remove the duplicate
		
//		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
//		List<Integer> list2 = Arrays.asList(4,5,6,7,8,8,9);
//		
//		List<Integer> result = Stream.concat(list1.stream(),list2.stream()).distinct().toList();
//		System.out.println(result);
		
		//Throw custome exception if valu is throw
		
//		Optional<String> op = Optional.ofNullable("String");
//		String str =op.orElseThrow(()->new RuntimeException("No value are present"));
//		
//		System.out.println(str);
//		
		
		//sort a list using lambda expression
//		List<String> list = Arrays.asList("Mahesh","Kiran","Akash","Ramesh");
//		
//		List<String>result = list.stream().sorted().toList();
//		System.out.println(result);
		
//		new Thread(()-> System.out.println("Thread is running")).start();
		
		//filter with name starting from M
		
		
//		List<String> list = Arrays.asList("Mahesh","Kiran","Akash","Ramesh");
//		
//		list.stream().filter(f->f.startsWith("M")).forEach(System.out::println);
		
		//print current date and time
		
//		LocalDateTime now = LocalDateTime.now();
//		System.out.println(now);
		
		//Find the difference two dates
		

//find the word with max length
		
//		List<String> list = Arrays.asList("Mahesh","Mouni","MaheshPolisetty");
//		
//	String str =list.stream().max(Comparator.comparing(String::length)).get();
//	System.out.println(str);
		
		//Revese a each work in a sentence
		
//		String str1 = "Java stream Api Practice";
//		
//		String str =Arrays.stream(str1.split(" ")).map(n-> new StringBuilder(n).reverse().toString()).collect(Collectors.joining(" "));
//		System.out.println(str);
		
		//find the sum and average using streams
		
//		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
//		
//		int sum = list.stream().mapToInt(Integer::intValue).sum();
//		double avg = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
//		System.out.println("Sum: "+sum+ " Average: "+avg)
		
//		List<String> str = Arrays.asList("mahesh","kriti","mayana","tokyo");
//		
//		List<String> list =str.stream().map(String::toUpperCase).toList();
//		
//		System.out.println(list);
		
		//partition number into even and odd
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		
		Map<Boolean, List<Integer>> mpa=   list.stream().collect(Collectors.partitioningBy(n->n%2==0));
		
		System.out.println(mpa);
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
