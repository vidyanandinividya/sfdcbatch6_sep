package session1;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		/*int numbers[]=new int[5];
		numbers[0]=2;
		numbers[1]=7;
		numbers[2]=6;
		System.out.println(numbers[0]);*/
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter the size of the array");
		size=sc.nextInt();
		int[] arr=new int[size];
		String[] names=new String[size];
		//System.out.println(arr.length);
		//Integer array
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the:"+ (i+1)+ "number");
			arr[i]=sc.nextInt();
		}
		//display the array elements
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		//String array
		for(int i=0;i<names.length;i++)
		{
			System.out.println("Enter the:"+ (i+1)+ "string");
			names[i]=sc.next();
		}
		//display the array elements
		for(int i=0;i<names.length;i++)
		{
			System.out.print(names[i]+"\t");
		}
		
				

	}

}
