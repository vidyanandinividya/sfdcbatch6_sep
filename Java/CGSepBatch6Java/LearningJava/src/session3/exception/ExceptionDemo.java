package session3.exception;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number (dividend)");
		num1=sc.nextInt();
		System.out.println("Enter second number(divisor)");
		num2=sc.nextInt();
		try
		{
		int div=num1/num2;
		System.out.println("Quotient:"+div);
		int arr[]=new int[3];
		System.out.println(arr[4]);
		String str="capgemini";
		int num=Integer.parseInt(str);
		System.out.println(num);
		String name=null;
		System.out.println(name.length());
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Do not enter divisor as zero");
			System.out.println("Error Message:"+ae);
		}

	}

}