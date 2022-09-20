package session4.iooperation;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteToFile {

	public static void main(String[] args) {
		//File Writer
		/*FileWriter fw;
		try {
			fw=new FileWriter("src/resources/myFile1.txt");
			fw.write("Hello");
			fw.append("Hi");
			//fw.write(10);
			//fw.write(10.5);
			fw.close();
			System.out.println("Successfully wrote to the file");
		} catch (IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}*/
		//Print Writer
		/*PrintWriter pw;
		try {
			pw=new PrintWriter("src/resources/myFile1.txt");
			pw.println("Hello printwriter");
			pw.print("print");
			pw.print(10);
			pw.print(false);
			pw.close();
			System.out.println("Successfully Done");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//File Writer
		Path path=Paths.get("src/resources/myFile1.txt");
		String fruits="apple orange bananan mango";
		try {
			Files.write(path, fruits.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
