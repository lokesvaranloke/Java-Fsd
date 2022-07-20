package Collections;
import java.util.*;
public class testCollection {

	public static void main(String[] args) {
		
		System.out.println("ArrayList Implementation");
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=1;i<=5;i++) {
			al.add(i);
		}
		System.out.println(al);
		al.add(6);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		Iterator<Integer> i = al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println();
		System.out.println("LinkedList Implementation");
		LinkedList<String> l = new LinkedList<String>();
		l.add("Java");
		l.add("Python");
		l.add("Collections");
		l.add("LinkedList");
		l.add("Array");
		System.out.println(l);
		l.addLast("Strings");
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		Iterator<String> i1 = l.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		System.out.println();
		System.out.println("Vector Implementation");
		Vector<Integer> v = new Vector<Integer>();
		for(int j=10;j<=15;j++) {
			v.add(j);
		}
		System.out.println(v);
		v.add(2, 50);;
		System.out.println(v);
		v.remove(5);
		System.out.println(v);
		Iterator<Integer> i2 = v.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		
		System.out.println();
		System.out.println("Stack Implementation");
		Stack<String> s = new Stack<String>();
		s.push("Hello");
		s.push("World");
		s.push("My");
		s.push("Program");
		s.push("Language");
		System.out.println(s);
		s.pop();
		System.out.println(s);
		Iterator<String> i3 = s.iterator();
		while(i3.hasNext()) {
			System.out.println(i3.next());
		}
		
		System.out.println();
		System.out.println("HashSet Implementation");
		HashSet<Integer> h = new HashSet<Integer>();
		h.add(1);
		h.add(2);
		h.add(1);
		h.add(4);
		h.add(5);
		System.out.println(h);
		Iterator<Integer> i4 = h.iterator();
		while(i4.hasNext()) {
			System.out.println(i4.next());
		}
		
		System.out.println();
		System.out.println("TreeSet Implementation");
		TreeSet<String> t = new TreeSet<String>();
		t.add("File");
		t.add("Edit");
		t.add("Source");
		t.add("Refactor");
		System.out.println(t);
		Iterator<String> i5 = t.iterator();
		while(i5.hasNext()) {
			System.out.println(i5.next());
		}
		}
	
	}


