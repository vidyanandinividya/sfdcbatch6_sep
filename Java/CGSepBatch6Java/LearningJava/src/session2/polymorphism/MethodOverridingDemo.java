package session2.polymorphism;

class Parent
{
	protected void doSomething()
	{
		System.out.println("Doing something in parent class");
		
	}
	public void fn1()
	{
		System.out.println("Parent Class Function");
	}
}
class Child extends Parent
{
	public void fn2()
	{
		System.out.println("Child class Function");
	}
	@Override
	public void doSomething() {
		System.out.println("Doing something in Child Class");
	}
}
public class MethodOverridingDemo {

	public static void main(String[] args) {
		Parent p=new Child(); //dynamic polymorphism
		// p is called polymorphic variable
		//this polymorphic variable can call all the methods of the parent
		// class except overriden method
		//it can only call the overriden method of the child class
		p.doSomething();
		p.fn1();
		
		

	}

}
