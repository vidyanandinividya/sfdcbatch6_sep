package session4.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		/*System.out.println(list);
		list.add(4); //This will add 4 at the end of the list
		System.out.println(list);
		list.add(0, 50);
		System.out.println(list); //This will add 50 at the beginning of the list
		List<Integer> newList=new ArrayList<>();
		newList.add(100);
		newList.add(150);
		list.addAll(newList); //This will add all the elements into the list
		System.out.println(list);
		System.out.println(list.get(0));
		list.remove(5); //This will remove the item present at the index place 5
		System.out.println(list);
		list.remove(Integer.valueOf(50)); //This will remove the value 50
		System.out.println(list);
		list.clear(); //This will remove all the elements of the list
		System.out.println(list);*/
		list.add(5);
		list.add(50);
		list.add(30);
		list.add(10);
		System.out.println(list);
		//for loop
		System.out.println("Print List Using For Loop");
		for(int i=0;i<list.size();i++)
		{
			System.out.println("The element is :"+list.get(i));
		}
		//for each loop
		System.out.println("Print List Using For Each Loop");
		for(Integer element:list)
		{
			System.out.println("The element is :"+element);
		}
		
		//Iterator interface
		System.out.println("Print List Using Iterator Interface");
		Iterator<Integer> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println("Iterator:"+it.next());
		}
		/*it.remove();
		System.out.println(list);*/
		//Java 8 (method reference)
		System.out.println("Print List Using Java 8 Method Reference");
		list.forEach(System.out::println);
		//Java 8 (Lambda Expression)
		System.out.println("Print List Using Java 8 Lambda Expression");
		list.forEach(listitem->System.out.println(listitem));
		List<String> names=Arrays.asList("John","Jack","Tom","Annie");
		names.forEach(name->System.out.println(name));
		

	}

}
