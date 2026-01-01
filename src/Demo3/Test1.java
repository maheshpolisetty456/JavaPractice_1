package Demo3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		//Count the frequency of each word in a String
		
//		String  str = "java is a programing language and java is a powerfull language";
//		
//		Map<String, Long> map = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		
//		System.out.println(map);
		
//		Remove the Duplicate while presenving Order
		
//		int[] number = {1,2,3,4,2,1,5};
//		
//		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
//		
//		for(int n : number) {
//			set.add(n);
//		}
//		System.out.println(set);
		
		//Find the first not repeating character in the string
		
//		String str = "stress";
//		
//		Character ch = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c, LinkedHashMap::new,Collectors.counting()))
//										.entrySet().stream().filter(f->f.getValue()==1)
//										.map(Map.Entry::getKey)
//										.findFirst()
//										.get();
//		
//		System.out.println(ch);
		
		//Find the duplicate elements in the list
		
//		List<Integer> list = Arrays.asList(1,2,3,4,5,6,5,4,3,8);
//		
//		Set<Integer> set = list.stream().filter(f-> Collections.frequency(list, f)>1).collect(Collectors.toSet());
//		
//		System.out.println(set);
		
		//Find the duplicate elements in the arrays
//		int[] number = {1,2,2,3,5,5,6,7,4,1,3};
//		
//		for(int i =0 ;i< number.length;i++) {
//			for(int j=i+1; j<number.length;j++) {
//				if(number[i]==number[j]) {
//					System.out.println(number[i]);
//				}
//			}
//		}
		
		//sort Map by values 
		
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		
//		map.put("Apple", 30);
//		map.put("Banana", 40);
//		map.put("Kiwi",10);
//		map.put("Orange", 20);
//		
//		Map<String, Integer> result = map.entrySet().stream()
//					  .sorted(Map.Entry.comparingByValue())
//					  .collect(Collectors.toMap(
//							  Map.Entry::getKey,
//							  Map.Entry::getValue,
//							  (e1,e2)->e1,
//							  LinkedHashMap::new
//							  ));
//		System.out.println(r,esult);
		
		//Most frenquent element in list
//		List<Integer> list = Arrays.asList(1,2,3,2,4,5,2);
//		
//		Integer result =list.stream().collect(Collectors.groupingBy(c->c,Collectors.counting()))
//							.entrySet()
//							.stream()
//							.max(Map.Entry.comparingByValue())
//							.get()
//							.getKey();
//		System.out.println(result);
//		
//		int[] number = {1,2,3,2,4,5,2};
//		
//		Integer resul = Arrays.stream(number).boxed().collect(Collectors.groupingBy(c->c,Collectors.counting()))
//									.entrySet()
//									.stream()
//									.max(Map.Entry.comparingByValue())
//									.get()
//									.getKey();
//		
//		System.out.println(resul);
		
		//intersection of two lists
		
//		List<Integer> list1 = new ArrayList<Integer>( Arrays.asList(1,2,3,4));
//		List<Integer> list2 = Arrays.asList(3,4,5,6);
//		
//		List<Integer> result = list1.stream().filter(list2::contains)
//				.collect(Collectors.toList());
//		
//		System.out.println(result);
		
		//Compare two list (Missing, Extra, common)
		
//		List<String> list1 = Arrays.asList("apple","banana","mango");
//		List<String> list2 = Arrays.asList("banana","graps");
		
//		Set<String> set1 = new  HashSet<String>(list1);
//		Set<String> set2 = new  HashSet<String>(list2);
//		
//		//common
//		Set<String> common = new HashSet<String>(set1);
//		common.retainAll(set2);
//		System.out.println("Common: "+common);
//		
//		//Missing (present in list1 but not in list2)
//		
//		Set<String> mission = new HashSet<String>(set1);
//		mission.removeAll(set2);
//		System.out.println("Missing: "+mission);
//		
//		//Extra (present in list2 but not in list1)
//		
//		Set<String> extra = new HashSet<String>(set2);
//		extra.removeAll(set1);
//		System.out.println("Extra: "+extra);
		
//		List<String> common = list1.stream().filter(list2::contains).toList();
//		System.out.println("Common: "+common);
//		
//		List<String > missing= list1.stream().filter(c->!list2.contains(c)).toList();
//		System.out.println("Missing: "+missing);
//		
//		List<String> extra = list2.stream().filter(c->!list1.contains(c)).toList();
//		System.out.println("Extra: "+extra);
		
		//Convert List to Map
		
//		List<String> list = Arrays.asList("apple","banana","mango");
//		
//		Map<String , Integer> map = list.stream().collect(Collectors.toMap(c->c, String::length));
//		
//		System.out.println(map);
		
		// print the list of leap leap year
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year start: ");
		int start = sc.nextInt();
		
		System.out.println("Enter the Year end");
		
		int end  = sc.nextInt();
		for(int year = start; year<=end; year++) {
		
		if(year % 4 ==0 && year % 100 !=0 ||(year % 400 ==0)) {
			System.out.print(year+",");
		}
		}
				
		
		
	}

}
