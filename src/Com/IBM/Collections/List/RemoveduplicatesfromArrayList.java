package Com.IBM.Collections.List;

import java.util.*;

public class RemoveduplicatesfromArrayList {

	public static void main(String[] args) {
       List <String> l=new ArrayList<String>();
         l.add("Banana");
         l.add("Mango");
         l.add("Apple");
         l.add("Banana");
         l.add("Apple");
         l.add("Orange");
         l.add("Watermelon");
         System.out.println(l);
         Set<String> s=new LinkedHashSet<String>(l);
         System.out.println(s);
	}

}
