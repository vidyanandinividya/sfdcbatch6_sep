package session1.oops;

public class PersonList {

	public static void main(String[] args) {
		Person p=new Person();
		p.setAge(23);
		p.setName("john");
		p.setHeight(162);
		p.setWeight(60);
		System.out.println(p);
		Person p1=new Person();
		p1.setAge(33);
		p1.setName("j1ck");
		p1.setHeight(165);
		p1.setWeight(62);
		System.out.println(p1);	
		Person p2=new Person("Annie",24,167,55);
		System.out.println(p2);
		

	}

}
