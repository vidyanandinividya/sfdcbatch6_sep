package session3.exception;

class InvalidProductException extends Exception
{

	public InvalidProductException(String message) {
		super(message);
		
	}
	
}
public class CustomExceptionDemo {

	public static void main(String[] args)  {
		CustomExceptionDemo ce=new CustomExceptionDemo();
		try {
			ce.productCheck(145);
		} catch (InvalidProductException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}
	void productCheck(int weight) throws InvalidProductException
	{
		if(weight<100)
		{
			throw new InvalidProductException("Product Invalid");
		}
		else if(weight<200 && weight >=100)
		{
			throw new InvalidProductException("Product Invalid weight is more");
		}
		else
		{
			System.out.println("Product is Valid");
		}
	}

}
