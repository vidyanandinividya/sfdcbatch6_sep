package session3.exception;

public class ThrowExample {

	public static void main(String[] args) {
		
		checkEligibility(15, 45);
		System.out.println("Have a nice day!");
	}
	static void checkEligibility(int age,int weight)
	{
		if(age<12 && weight<40)
		{
			throw new ArithmeticException("Student is not eligible for registration");
		}
		else
		{
			System.out.println("Student entry is valid!");
		}
		
	}

}
