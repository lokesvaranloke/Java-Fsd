package Maps;
import java.util.*;
public class testMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		System.out.println("HashMap");
		hm.put(1, "Naveen");
		hm.put(2, "Rahul");
		hm.put(3, "Sam");
		hm.put(4, "Ravi");
		System.out.println(hm);
		hm.putIfAbsent(5, "Sri");
		System.out.println(hm);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(6, "Kumar");
		map.putAll(hm);
		System.out.println(map);
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+"="+m.getValue());
		}
		
		System.out.println();
		System.out.println("LinkedHashMap");
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(10, "Java");
		lhm.put(20, "Python");
		lhm.put(30, "Shift");
		lhm.put(40, "Oops");
		lhm.put(50, "Database");
		System.out.println(lhm);
		System.out.println(lhm.keySet());
		System.out.println(lhm.values());
		lhm.remove(30);
		System.out.println(lhm);
		
		System.out.println();
		System.out.println("TreeMap");
		TreeMap<Integer, String> t = new TreeMap<Integer, String>();
		t.put(100, "Map1");
		t.put(101, "Map2");
		t.put(102, "Map3");
		t.put(103, "Map4");
		t.put(104, "Map4");
		System.out.println(t);
		System.out.println(t.descendingMap());
		System.out.println(t.headMap(103, true));
		System.out.println(t.tailMap(101, true));
		System.out.println(t.subMap(100, false, 102, true));
	}

}
