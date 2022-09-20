package session4.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDetails {

	public static void main(String[] args) {
		List<Employee> list=Arrays.asList(
				new Employee(1, "John", 20000),
				new Employee(2, "Hary", 120000),
				new Employee(3, "Jack", 5000),
				new Employee(4, "Annie", 15000),
				new Employee(5, "Johans", 3000));
		System.out.println(list);
		Predicate<Employee> p1=e->e.getEmpName().startsWith("J");
		Predicate<Employee> p2=e->e.getEmpSal()<=15000;
		Predicate<Employee> p3=p1.and(p2);
		/*
		 * allMatch() method returns true if all the elements of stream satisfy
		 * the given predicate, else it returns false
		 */
		System.out.println(list.stream().allMatch(p1));
		/*
		 * anyMatch() method checks whether any stream element matches 
		 * the specified predicate
		 */
		System.out.println(list.stream().anyMatch(p1));	
		/*
		 * noneMatch() method returns true if none of the stream elements
		 * matches the given predicate
		 */
		System.out.println(list.stream().noneMatch(p1));	
		
		Stream<Employee> names=list.stream(); //converting the list to stream
		List<Employee> employeeNames=
				names.filter(p4->p4.getEmpName().length()>4) //filter the stream to create a new stream
				.collect(Collectors.toList()); //collect the final stream and convert it to a list
		employeeNames.forEach(str->System.out.print(str.getEmpName()+"\t"));
		System.out.println();
		long count=employeeNames.stream().count();
		System.out.println("Number :"+count);
		//convert the employee name into upper case whose name starts with J
		List<String> empUpper=list.stream().filter(e->e.getEmpName().startsWith("J"))
					 .map(e -> e.getEmpName().toUpperCase())
					 .collect(Collectors.toList());
		empUpper.stream().sorted().forEach(System.out::println);
		//Sort in natural order
		Collections.sort(list,new NameSorter());
		System.out.println(list);
		//Sort in reverse order
		Collections.sort(list,Comparator.comparing(Employee::getEmpName).reversed());
		System.out.println(list);
		
		Set<Employee> employees=list.stream().collect(Collectors.toSet());
		
		//Getting Average Salary
		Double avgSal=list.stream().collect(Collectors.averagingDouble(e->e.getEmpSal()));
		System.out.println(avgSal);
		
		
		

	}

}
