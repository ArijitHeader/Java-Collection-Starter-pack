package Com.IBM.Collections.Set;

import java.util.*;




public class TreeSetDescOrder3Heterogenous {

	public static void main(String[] args) {
          
		TreeSet t=new TreeSet(new myHeterogenousComparator());
		
		t.add(new StringBuffer("Arijit"));
		t.add(new StringBuffer("B"));
		t.add("AAA");
		t.add("CCCCCBB");
		t.add(new StringBuffer("Chan"));
		t.add("LOLA");
		System.out.println(t);
		
		
		
	}

}
 class myHeterogenousComparator implements Comparator<Object>{  
    @Override  
    public int compare(Object obj1, Object obj2) {  
    	String s1=obj1.toString();
    	String s2=obj2.toString();
    	int l1=s1.length();
    	int l2=s2.length();
    	  if(l1>l2)
    		  return -1;
    	  else if (l1<l2)
    		  return 1;
    	  else return -s1.compareTo(s2);
    }  
}