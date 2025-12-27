package Demo;



class Employee1 {
	private int id;
	private String name;
	private long salary;
	private String dpt;

	Employee1(int id, String name, long salary, String dpt) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dpt = dpt;
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

	public String getDpt() {
		return dpt;
	}

	public void setDpt(String dpt) {
		this.dpt = dpt;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class Test3 {
	public static void main(String[] args) {
		// print the even number from list

		/*
		 * List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		 * 
		 * List<Integer> result=list.stream().filter(n->n%2==0).toList();
		 * 
		 * System.out.println(result);
		 */

		// Find the duplicate elements in the list

		/*
		 * List<Integer> list = Arrays.asList(1,2,3,3,4,5,6,6,7,8,9,9); Set<Integer>
		 * set= list.stream().filter(i->Collections.frequency(list,
		 * i)>1).collect(Collectors.toSet());
		 * 
		 * System.out.println(set);
		 */

		// remove the duplicate values

		/*
		 * List<Integer> list = Arrays.asList(1,2,3,3,4,5,6,6,7,8,9,9);
		 * 
		 * List<Integer> result=list.stream().distinct().toList();
		 * 
		 * System.out.println(result);
		 */

		// find the first non repeating character from the String

		/*
		 * String name = "swiss";
		 * 
		 * Character cha= name.chars() .mapToObj(c->(char)c)
		 * .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,
		 * Collectors.counting())) .entrySet().stream() .filter(i->i.getValue()==1)
		 * .map(Map.Entry::getKey) .findFirst().get();
		 * 
		 * System.out.println(cha);
		 */

		// Count the frequency of each element

		/*
		 * List<String > list =
		 * Arrays.asList("Mahesh","Mahi","Mouni","Mahi","Mouni","Mounika");
		 * 
		 * Map<String, Long> map =
		 * list.stream().collect(Collectors.groupingBy(Function.identity(),
		 * Collectors.counting())); System.out.println(map);
		 */

		// sort the list of string by length

		/*
		 * List<String > list =
		 * Arrays.asList("Mahesh","Mahi","Mouni","Mahi","Mouni","Mounika");
		 * 
		 * List<String> list1 =
		 * list.stream().sorted(Comparator.comparing(String::length)).toList();
		 * 
		 * System.out.println(list1);
		 */

		// find the max and min number from the list

		/*
		 * List<Integer> list = Arrays.asList(2,3,4,5,6,1,8,9); int
		 * max=list.stream().max(Integer::compare).get(); int min =
		 * list.stream().min(Integer::compare).get();
		 * 
		 * System.out.println("Max: "+max +" : "+"Min: "+min);
		 */

		/*
		 * List<Employee1> emp = Arrays.asList( new Employee1(1,"Mahesh", 90000), new
		 * Employee1(2,"Mahesh1", 80000), new Employee1(3,"Mahesh2", 40000), new
		 * Employee1(4,"Mahesh3", 30000), new Employee1(5,"Mahesh5", 20000) );
		 * 
		 * List<Employee1> emp2=emp.stream().filter(i->i.getSalary()>50000) .toList();
		 * 
		 * System.out.println(emp2);
		 */
		
		/*
		 * List<Employee1> emp = Arrays.asList( new Employee1(1,"Mahesh", 90000,"SSE"),
		 * new Employee1(2,"Mahesh1", 80000,"SE"), new Employee1(3,"Mahesh2",
		 * 40000,"TA"), new Employee1(4,"Mahesh3", 30000,"SSE"), new
		 * Employee1(5,"Mahesh5", 20000,"TA") );
		 * 
		 * Map<String, List<Employee1>> map =
		 * emp.stream().collect(Collectors.groupingBy(Employee1::getDpt));
		 * 
		 * System.out.println(map);
		 */
		
		//find the second highest number in the list
		
//		List<Integer> list = Arrays.asList(1,9,2,8,3,7,4,6,5);
//		
//		Integer l =list.stream().distinct().sorted(Comparator.reverseOrder())
//						.skip(1)
//						.findFirst()
//						.get();
//		System.out.println(l);
		
		//merger to list and remove duplciate elements
		
		/*
		 * List<Integer> list1 = Arrays.asList(1,2,3,4,5,6); List<Integer> list2 =
		 * Arrays.asList(5,6,7,8,9);
		 * 
		 * List<Integer> resu=Stream.concat(list1.stream(),
		 * list2.stream()).distinct().toList(); System.out.println(resu);
		 */
		
		//create a thread using lambda expression
		
//		new Thread(()->System.out.print("Thread is starting")).start();
		
		//find the print names start with M
		
		/*
		 * List<String > list = Arrays.asList("Mahesh","Kamal","Mahi","Ramu");
		 * 
		 * List<String>result=list.stream().filter(s->s.startsWith("M")).toList();
		 * 
		 * System.out.println(result);
		 */
		
		/*
		 * String name ="mahesh12345mahesh3456mahesh&"; String result =
		 * name.replaceAll("\\d", ""); String revomechar= name.replaceAll("[^A-Za-z]",
		 * "");
		 * 
		 * 
		 * System.out.println(result); System.out.println(revomechar);
		 */
		
		String str = "// Use this editor to write, compile and run your Java code online 23456";
		
		int vowels = 0;
		int consonents = 0;
		int digits = 0;
		int special = 0;
		int space = 0;
		
		for(char c : str.toCharArray()) {
			if(Character.isLetter(c)) {
				if("AEIOUaeiou".indexOf(c)!=-1) {
					vowels++;
				}
				else {
					consonents++;
				}
			}else if(Character.isDigit(c)) {
				digits++;
			}else if(c==' '){
				space++;
			}else {
				special++;
			}
		}
		System.out.println("Vowels: "+vowels);
		System.out.println("Consonents: "+consonents);
		System.out.println("Digits : "+digits);
		System.out.println("Special characters : "+special);
		System.out.println("spaces : "+space);
		
		
	}		

}
