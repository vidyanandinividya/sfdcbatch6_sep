package session4.iooperation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		Path path=Paths.get("src/resources/employee.txt");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of records you want to save");
		Employee[] emp=new Employee[sc.nextInt()];
		try {
			Files.write(path,"Employee Deatils:\n".getBytes(), StandardOpenOption.APPEND);
			for(int i=0;i<emp.length;i++)
			{
				emp[i]=new Employee();
				System.out.println("Enter the Employee id");
				emp[i].setEmpId(sc.nextInt());
				System.out.println("Enter the Employee name");
				emp[i].setEmpName(sc.next());
				Files.write(path, emp[i].toString().getBytes(), StandardOpenOption.APPEND);
				Files.write(path, "\n".getBytes(), StandardOpenOption.APPEND);
				System.out.println("Employee record saved successfully");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
