package session3;

interface MyInterface
{
	/*
	 * Already existing public abstract method
	 * we must need to implement this method in implementation class
	 */
	void existingMethod(String str);
	/*
	 * This is a default method so we need not to implement this
	 * method in the implementation class
	 */
	default void newMethod()
	{
		System.out.println("Newly added default method");
	}
	/*
	 * This is a static method. it is similar to default method but
	 * we cannot override it in the implementation class
	 */
	static void anotherNewMethod()
	{
		System.out.println("Newly added static method");
	}
}
public class DefaultMethodInInterfaceDemo implements MyInterface
{

	public static void main(String[] args) {
		MyInterface mi=new DefaultMethodInInterfaceDemo();
		//calling the existing method of interface
		mi.existingMethod("Vidya");
		//calling the default method of interface
		mi.newMethod();
		MyInterface.anotherNewMethod();
		

	}
	
	@Override
	public void newMethod() {
		// TODO Auto-generated method stub
		MyInterface.super.newMethod();
		System.out.println("Overiden in implementor class");
	}

	@Override
	public void existingMethod(String str) {
		System.out.println("String is: "+str);
		
	}

}
