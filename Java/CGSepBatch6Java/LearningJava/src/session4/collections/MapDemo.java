package session4.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		/*Map<String, Integer> map=new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		System.out.println(map);
		System.out.println(map.containsValue(3));
		System.out.println(map.containsKey("four"));
		if(map.containsKey("four"))
		{
			map.put("four", 4);
		}
		map.putIfAbsent("four", 4);
		System.out.println(map);
		for(Map.Entry<String, Integer> e:map.entrySet())
		{
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		for(String key:map.keySet())
		{
			System.out.println(key);
		}
		for(Integer value:map.values())
		{
			System.out.println(value);
		}*/
		HashMap<String, Integer> numbers=new HashMap<>();
		numbers.put("one",3);
		numbers.put("two", 1);
		numbers.put("three", 2);
		System.out.println(getValues(numbers));

	}
	//Excercise 1
	public static List<Integer> getValues(HashMap<String, Integer> map)
	{
		//3,1,2
		//create a list from elements of HashMap
		List<Map.Entry<String, Integer>> list
				=new LinkedList<>(map.entrySet());
		//sort the list using lambda expression
		Collections.sort(list,(i1,i2)->i1.getValue().compareTo(i2.getValue()));
		
		//1,2,3
		//put data from sorted list to HashMap
		List<Integer> temp=new ArrayList<>();
		for(Map.Entry<String, Integer> aa:list)
		{
			temp.add(aa.getValue());
		}
		return temp;
		
	}

}
