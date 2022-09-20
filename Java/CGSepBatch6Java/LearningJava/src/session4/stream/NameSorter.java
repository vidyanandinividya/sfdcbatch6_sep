package session4.stream;

import java.util.Comparator;

public class NameSorter implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getEmpName().compareToIgnoreCase(e2.getEmpName());
	}

}
