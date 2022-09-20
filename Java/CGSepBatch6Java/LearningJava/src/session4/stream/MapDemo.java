package session4.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(5,7,3,1,4,6,2,8,9,10);
		list.stream().map(n->n*n).forEach(System.out::println);
		List<Integer> newList=
				list.stream().map(n->n*n).collect(Collectors.toList());
		newList.stream().filter(x->x>25).sorted().forEach(System.out::println);

	}

}
