package Com.IBM.Collections.Set;

import java.util.*;




public class TreeSetDescOrder3StringBuffer {

	public static void main(String[] args) {
          
		TreeSet<StringBuffer> t=new TreeSet<StringBuffer>(new myStringBufferComparator());
		
		t.add(new StringBuffer("Arijit"));
		t.add(new StringBuffer("Bubu"));
		t.add(new StringBuffer("arijit"));
		t.add(new StringBuffer("bubu"));
		t.add(new StringBuffer("Chandu"));
		t.add(new StringBuffer("chandu"));
		System.out.println(t);
		
		
		
	}

}
 class myStringBufferComparator implements Comparator<StringBuffer>{  
    @Override  
    public int compare(StringBuffer obj1, StringBuffer obj2) {  
    	String s1=obj1.toString();
    	String s2=obj2.toString();
    	  return s2.compareTo(s1);
    }  
}