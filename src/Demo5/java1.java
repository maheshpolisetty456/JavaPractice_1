package Demo5;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class java1 {

	public static void main(String[] args) {
		//count the frequency of each word in the sentence
		
//		String str = "java is a programing language and java is a powerfull";
//		
//		Map<String, Long> map = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(c->c,Collectors.counting()));
//		
//		System.out.println(map);
		
		//remove the duplicate values in presenting order
		
		int[] number = {1,2,3,4,5,2,3,6,7,8};
//		
//		List<Integer> list = Arrays.stream(number).boxed().distinct().toList();
//		System.out.println(list);
		
//		LinkedHashSet<Integer> lHas = new LinkedHashSet<Integer>();
//		
//		for(int i : number ) {
//			lHas.add(i);
//		}
//		System.out.println(lHas);
		
		//find the first not repeating character in the given string
		
//		String str = "stress";
//		
//		 Character ch= str.chars().mapToObj(c->(char)c)
//						.collect(Collectors.groupingBy(c->c,LinkedHashMap::new, Collectors.counting()))
//						.entrySet()
//						.stream()
//						.filter(f->f.getValue()==1)
//						.map(Map.Entry::getKey)
//						.findFirst()
//						.get();
//		 
//		 System.out.println(ch);
		
		//find the duplicate elements from the list
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,3,2,1,6,7,8,7,6);
		
		Set<Integer> ser = list.stream().filter(f->Collections.frequency(list, f)==1).collect(Collectors.toSet());
		
		System.out.println(ser);
		
		
		
		
	}
	

}
