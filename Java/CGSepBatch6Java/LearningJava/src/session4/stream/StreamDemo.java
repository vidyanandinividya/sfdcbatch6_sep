package session4.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,20,15,25,20,40,35);
		list.forEach(System.out::print);
		System.out.println();
		//find out the sum of all integers grater than 10
		Iterator<Integer> it=list.iterator();
		int sum=0;
		while(it.hasNext())
		{
			int num=it.next();
			if(num>10)
			{
				sum+=num;
			}
		}
		System.out.println("The sum:"+sum);
		//Java 8
	
	int result=
			list.stream().filter(i -> i>10).mapToInt(i -> i).sum();
	System.out.println(result);
	//get the list of elements greater than 15 and less than 25
	Predicate<Integer> noGreaterThan15= x -> x>15;
	Predicate<Integer> noLessThan25= x -> x<25;
	List<Integer> newList=
			list.stream().filter(noGreaterThan15).collect(Collectors.toList());
	System.out.println(newList);
	list.stream().filter(x->x>15)
	.collect(Collectors.toList()).forEach(System.out::println);
	System.out.println();
	//multiple filter
	list.stream().filter(x->x>15 && x<25)
	.collect(Collectors.toList()).forEach(System.out::println);
	//multiple filter using predicate
	list.stream().filter(noGreaterThan15.and(noLessThan25))
	.collect(Collectors.toList()).forEach(System.out::println);
	
	List<String> names=Arrays.asList("John","Jack","Annie","Johans","Tom");
	//get those employee list whose name starts with J and length is 4
	Predicate<String> length4=x->x.length()==4;
	Predicate<String> startsWithJ=x->x.startsWith("J");
	names.stream().filter(length4.or(startsWithJ))
					.collect(Collectors.toList())
					.forEach(name->System.out.print(name+"\t"));
	
			
	}
	


}
