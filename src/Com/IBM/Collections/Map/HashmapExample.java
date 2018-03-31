package Com.IBM.Collections.Map;

import java.util.*;

public class HashmapExample {

	public static void main(String[] args) {
    HashMap m=new HashMap();
           m.put("Arijit", 100);
           m.put("Bubu", 101);
           m.put("Ravi", 102);
           m.put("Varun", 109);
           m.put("Lol", 99);

             System.out.println(m);
             System.out.println(m.put("Arijit", 1000));
             System.out.println(m);
             Set s1=m.entrySet();
             Collection c=m.values();
             System.out.println(s1);
             System.out.println(c);
             Iterator itr=s1.iterator();
             while(itr.hasNext()){
            	 Map.Entry m1=(Map.Entry)itr.next();
            	System.out.println(m1.getValue()+"...."+m1.getKey());
            	if(m1.getKey().equals("Arijit")){
            		{
            			m1.setValue(10);
            		}
            	}
             }
             System.out.println(m);
	}

}
