package session4.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapCollection {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		map.put(10, "BMW");
		map.put(12, "Safari");
		map.put(15, "swift");
		map.put(20, "nexon");
		Map<Integer,String> result=map.entrySet().stream()
		.filter(m->m.getKey().intValue()>12)
		.collect(Collectors.toMap(m->m.getKey(), m->m.getValue()));
		
	}

}
