package session3.exception;

public class MyResource2 implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Close My Resource2");
		
	}
	public void doSomething()
	{
		System.out.println("Something in My Resource 2");
	}

}
