import java.util.*;


class HashMapExample{
	public static void main(String[] args) {
		HashSet h=new HashSet();

		h.add("i");
		h.add("hello");
		Iterator ia=iterator(h);
		while(ia.hasNext()){
			System.out.println(ia.next());
		}
		// System.out.println(h.get(0));
	}
}