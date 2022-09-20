package session4.iooperation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class ReadFromFile {

	public static void main(String[] args) {
		String fileName="src/resources/employee.txt";
		try {
			Stream<String> fileStream=Files.lines(Paths.get(fileName));
			List<String> employeeList=Files.readAllLines(Paths.get(fileName));
			fileStream.forEach(str->System.out.println(str));
			employeeList.forEach(str->System.out.println(str));
			fileStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
