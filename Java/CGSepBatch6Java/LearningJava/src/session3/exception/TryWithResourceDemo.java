package session3.exception;

public class TryWithResourceDemo {

	public static void main(String[] args) {
		try(MyResource1 first=new MyResource1();
				MyResource2 second=new MyResource2())
		{
			first.doSomething();
			second.doSomething();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
