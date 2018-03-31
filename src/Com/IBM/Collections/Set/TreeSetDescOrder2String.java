package Com.IBM.Collections.Set;

import java.util.*;




public class TreeSetDescOrder2String {

	public static void main(String[] args) {
          
		TreeSet<String> t=new TreeSet<String>(new myStringComparator());
		t.add("Arijit");
		t.add("Bubu");
		t.add("arijit");
		t.add("bubu");
		t.add("chandu");
		t.add("CHANDU");

		System.out.println(t);
		
		
		
	}

}
 class myStringComparator implements Comparator<String>{  
    @Override  
    public int compare(String obj1, String obj2) {  
    	  return obj2.compareTo(obj1);
    }  
}