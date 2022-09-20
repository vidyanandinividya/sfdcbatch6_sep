package session4.iooperation;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopyDemo {
	private static final String src_file="src/resources/employee.txt";
	private static final String dest_file="src/resources/emp.txt";
	public static void main(String[] args) {
		//File copy using NIO
		Path filetoCopy=Paths.get(src_file);
		Path newFile=Paths.get(dest_file);
		try {
			Files.copy(filetoCopy, newFile,StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
