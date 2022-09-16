package session1;

import java.util.Scanner;

//Find the largest and second largest number in an array
		// case 1 
		// 10 1 2 8 3 15 3
		// Largest : 15
		// Second Largest :10
		// 1 1 1
		// Largest: 1
		//Second Largest: not found
		// 1. Take 2 variable "max" and "secondmax" and initailize 
		//both to the first element of the array
		// int max= arr[0]
		// int secondmax=arr[0]
		// 2. Iterate through array and for each value of array,
		//check
		// if the current value in array > "max" then update "secondmax" with "max"
		// value and "max" with new maximum value found
		// if the current value in array is <"max" but then >"secondmax" then update
		// with new second largest element found
public class ArrayProb {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the array elements");
			arr[i]=sc.nextInt();
		}
		findLargestAndSecondLargestNumberArray(arr);
		

	}

	private static void findLargestAndSecondLargestNumberArray(int[] arr) {
		if(arr==null || arr.length<2)
		{
			System.out.println("Invalid Input");
			return;
		}
		int max=arr[0];
		int secondMax=arr[0];
		for(int val:arr)
		{
			if(val>max)
			{
				secondMax=max;
				max=val;
			}
			//10 15 2 8 3
			//1 9 9
			else if(max==secondMax || (val>secondMax && val!=max))
			{
				secondMax=val;
			}
		}
		if(secondMax==max)
		{
			System.out.println("Largest number: "+max);
			System.out.println("Second Largest number not found");
		}
		else
		{
			System.out.println("Largest number: "+max);
			System.out.println("Second Largest number: "+secondMax);
		}
		
	}

}
