package session1;

import java.util.Scanner;

public class conditional {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num; //variable declaration
		System.out.println("Enter the value of num");
		num=sc.nextInt();
		//to check the number is even or odd
		/* if(num%2==0)
		{
			System.out.println("The given number  " + num + "is even");
		}
		else
		{
			System.out.println("The given number  " + num + "is odd");
		}*/
		//to check the number is positive or negative or zero
		if(num>0 && num<=50)
		{
			System.out.println("The given number "+ num + "is a positive number");
		}
		else if(num<0)
		{
			System.out.println("The given number "+ num + "is a negative number");
		}
		else
		{
			System.out.println("The given number is zero ");
		}
	}
	

}
