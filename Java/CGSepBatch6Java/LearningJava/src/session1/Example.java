package session1;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		//create a tool for reading user input and name it sc
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter the value of num1");
		num1=sc.nextInt();
		System.out.println("Enter the value of num2");
		num2=sc.nextInt();
		int result=num1+num2;
		System.out.println("The result is:" + result);
		String name;
		System.out.println("Enter your name");
		name=sc.next();
		System.out.println("Your name is:"+ name);
		
	}

}
