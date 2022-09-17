package session2.polymorphism;

public class ArithmeticOperation {
	public void add(int num1,int num2)
	{
		System.out.println(num1+num2);
	}
	public void add(int num1,int num2,int num3)
	{
		System.out.println(num1+num2+num3);
	}
	public void add(double num1,int num2)
	{
		System.out.println(num1+num2);
	}
	public void add(int num1,double num2)
	{
		System.out.println(num1+num2);
	}

	public static void main(String[] args) {
		ArithmeticOperation obj=new ArithmeticOperation();
		obj.add(10, 20);
		obj.add(23,45, 5);
		obj.add(23.56, 10);
		obj.add(10, 3.56);

	}

}
