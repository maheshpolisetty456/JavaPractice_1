package Demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test4 {

	public static void main(String[] args) {

		//Find all even numbers from a list
		
//		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
//		
//		List<Integer> result=list.stream().filter(i->i%2==0).toList();
//		
//		System.out.print(result);
		
		//Find duplicate elements in a list
		
//		List<Integer> list = Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,7,8,9);
//		Set<Integer> set = list.stream().filter(n->Collections.frequency(list,n)==1).collect(Collectors.toSet());
//		
//		System.out.println(set);
		
		//find the non repeated character in a String
		
//		String str = "swiss";
//		
//		Character result = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
//		 				.entrySet().stream().filter(c->c.getValue()==1).map(Map.Entry::getKey).findFirst().orElseThrow(null);
//		
//		System.out.println(result);
		
		//count the frequency  of each  elements
		
		List<String> str = Arrays.asList("Mahesh","Mahi","Mounika","Mouni");
		
		
		
		
		
		
		
		
		


	}

}
