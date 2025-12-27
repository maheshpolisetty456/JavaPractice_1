package Demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
	private int id;
	private String name;
	private long salary;
	private String department;

	Employee(int id, String name, long salary, String department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}

}

public class Test2 {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub
		 * 
		 * List<Employee> emp = Arrays.asList( new Employee(1,"Mahesh1",90000,"SSE"),
		 * new Employee(2,"Mahesh2",40000,"SE"), new Employee(3,"Mahesh3",50000,"TA"),
		 * new Employee(4,"Mahesh4",30000,"SSE"), new Employee(5,"Mahesh5",60000,"TA")
		 * );
		 * 
		 * 
		 * List<String> names = emp.stream().filter(f->f.getSalary()>=50000)
		 * .map(Employee::getName) .toList();
		 * 
		 * System.out.println(names);
		 * 
		 * Map<String,List<Employee>>dep =
		 * emp.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		 * 
		 * System.out.println(dep);
		 */
		
		//find out the second highest number in the list
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
		List<Integer> list2 = Arrays.asList(4,5,6,7,8,9);
		//merge  to list and remove the duplicate
		List<Integer> result =Stream.concat(list1.stream(), list2.stream()).distinct().toList();
		
		System.out.println(result);
		
		/*
		 * long i=list.stream().sorted(Comparator.reverseOrder()) .distinct() .skip(1)
		 * .findFirst() .get(); System.out.println(i);
		 */
		
		
		
	}

}
