package session4.iooperation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DeleteFileDemo {

	public static void main(String[] args) {
		Path path=Path.of("src/resources/myFile.txt");
		/*try {
			Files.delete(path);
			System.out.println("File Deleted");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		try {
			if(Files.deleteIfExists(path))
			{
				System.out.println("File dleted");
			}
			else
			{
				System.out.println("File not there");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
