package Com.IBM.Collections.Map;

import java.util.*;

public class SortedMapwithComparator {

	public static void main(String[] args) {
		TreeMap t=new TreeMap(new myComparator());
		t.put("xxx", 10);
		t.put("yyy", 20);
		t.put("aaa", 70);
		t.put("www", 10);
		t.put("zzz", 10);
	System.out.println(t);
	
	}

}
class myComparator implements Comparator{
	 public int compare(Object obj1,Object obj2){
		 String s1=(obj1).toString();
		 String s2=(obj2).toString();
		 return s2.compareTo(s1);
		 
	 }
	
	
}
