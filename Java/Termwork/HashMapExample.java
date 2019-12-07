import java.util.*;


class HashMapExample{
	public static void main(String[] args) {
		HashSet h=new HashSet();

		h.add("i");
		h.add("hello");
		Iterator ia=h.iterator();
		while(ia.hasNext()){
			System.out.println(ia.next());
		}
		// System.out.println(h.get(0));

		for (Object o : h) {
			System.out.println(o.getClass().getSimpleName());

			System.out.println(o instanceof String);
			if(o instanceof String){
			String string=(String)o;
			System.out.println(string.toUpperCase());
			}
		}
	}
}