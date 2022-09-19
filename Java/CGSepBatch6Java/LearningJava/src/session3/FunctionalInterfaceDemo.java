package session3;
@FunctionalInterface
interface functional_interface
{
	void calc(int num1,int num2);
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		functional_interface add=(a,b)->{
			System.out.println(a+b);
		};
		functional_interface mul=(a,b)->{
			System.out.println(a*b);
		};
	add.calc(10, 20);
	mul.calc(2, 3);
		

	}

}
