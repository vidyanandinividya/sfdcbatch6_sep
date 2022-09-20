package session4.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		//Set<Integer> set=new HashSet<>();
		/*Set<Integer> set=new TreeSet<>();
		set.add(32);
		set.add(2);
		set.add(54);
		set.add(21);
		set.add(32);
		System.out.println(set);
		set.remove(54);
		System.out.println(set);
		System.out.println(set.contains(21));
		System.out.println(set.size());
		System.out.println(set.isEmpty());*/
		Set<Employee> empSet=new HashSet<>();
		empSet.add(new Employee(1,"john"));
		empSet.add(new Employee(2,"jack"));
		empSet.add(new Employee(3,"tom"));
		empSet.add(new Employee(2,"annie"));
		System.out.println(empSet);
		Employee e1=new Employee(5, "james");
		Employee e2=new Employee(6, "lily");
		System.out.println(e1.equals(e2));
		

	}

}
