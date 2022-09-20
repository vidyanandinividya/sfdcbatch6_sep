package session4.collections;

import java.util.Objects;

public class Employee {
	private int empId;
	private String empName;
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(empId);
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj) 
			return true;
		if(obj==null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		Employee emp=(Employee)obj;
		return empId==emp.empId;
	}

}
