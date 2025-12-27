package Demo;

import java.nio.file.DirectoryStream.Filter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//print the second highest salary of employee

/*class Employee {
	private int id;
	private String name;
	private long salary;

	Employee(int id, String name, long salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
}
*/
public class Test1 {

	public static void main(String[] args) {

		/*
		 * List<Employee> emp = Arrays.asList( new Employee(1, "Mahesh", 90000), new
		 * Employee(1, "Mounika", 100000), new Employee(1, "Ravi", 80000), new
		 * Employee(1, "Kumar", 70000), new Employee(1, "Ram", 60000) );
		 * 
		 * 
		 * 
		 * Long secondHighestSalary=emp.stream().map(Employee::getSalary) .distinct()
		 * .sorted(Comparator.reverseOrder()) .skip(1) .findFirst() .orElseThrow(()->new
		 * RuntimeException("Second highest salary not present: "));
		 * 
		 * System.out.println("Second Highest Salary: "+secondHighestSalary);
		 * 
		 * 
		 * //second highest salary with name and salary
		 * 
		 * 
		 * Employee second=
		 * emp.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed(
		 * )) .skip(1) .findFirst() .orElseThrow(()->new
		 * RuntimeException("Second higest salary of employee is not present"));
		 * 
		 * System.out.println(second.getName()+" : "+second.getSalary());
		 */
		
		//find all even number in the list
		
		/*
		 * List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		 * 
		 * List<Integer > result =list.stream().filter(n->n%2==0).toList(); List<Integer
		 * > result1=list.stream().filter(n->n%2==0).collect(Collectors.toList());
		 * 
		 * //result.add(11); result1.add(11); System.out.println(result);
		 * System.out.println(result1);
		 */
		
		//Find the Duplicate elements to the list

		
//		List<Integer> list = Arrays.asList(1,2,3,3,2,1,4,5,6,5,4,6,7,8,9);
//		
//		Set<Integer> set= list.stream().filter(i->Collections.frequency(list, i)>1)
//						.collect(Collectors.toSet());
//		
//		System.out.println(set);
		
		//print odd value 
		
//		List<Integer> list = Arrays.asList(1,2,3,4,6,7,8,9);
//		
//		List<Integer> result=list.stream().filter(n->n%2!=0).toList();
//		
//		System.out.println(result);
		
		//Find the duplicate elements in the list
		
//		List<Integer> list = Arrays.asList(1,2,32,4,4,3,2,5,6,7,6,5,7,8,9);
//		Set<Integer> result= list.stream().filter(n->Collections.frequency(list,n)>1).collect(Collectors.toSet());
//		
//		System.out.println(result);
//		
		
		//Find the first non-repeated character in a string
		
		
//		String str = "swiss";
//		
//	Character  charr=str.chars()
//		   .mapToObj(c->(char)c)
//		   .collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
//		   						.entrySet().stream()
//		   						.filter(e->e.getValue() == 1)
//		   						.map(Map.Entry::getKey)
//		   						.findFirst()
//		   						.orElseThrow(null);
//	
//	System.out.println(charr);
		   						
		
		//count the frequency of each element
		
//		List<String> list = Arrays.asList("Mahesh","Mounika","Mahi","Mouni","Mahesh","Mahi");
		/*
		 * Map<String, Long> result=
		 * list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.
		 * counting()));
		 * 
		 * System.out.println(result);
		 */
		 
		//sort a list of string by length
//		 list.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
		 
		// Find the maximum and minimum number in the list
		 
		List<Integer> list = Arrays.asList(9,2,3,4,5,6,7,8,1);
		
	int max=	list.stream().max(Integer::compare).get();
	int min =   list.stream().min(Integer::compare).get();
	
	System.out.println("Max: "+max+" Min: "+min);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
