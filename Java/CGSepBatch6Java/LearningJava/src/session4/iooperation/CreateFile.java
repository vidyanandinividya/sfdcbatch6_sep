package session4.iooperation;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		File file=new File("src/resources/myFile.txt");
		try {
			if(file.createNewFile())
			{
				System.out.println("File created:"+file.getName());
			}
			else
			{
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
