package Com.IBM.Collections.List;

import java.util.*;

public class vectorExample {

	public static void main(String[] args) {
          Vector v =new Vector( );
          System.out.println("Vector Created..Capacity="+v.capacity());
          for(int i=0; i<v.capacity();i++){
        	  v.addElement(i);
          }
          System.out.println(v);
        //  v.addElement("A");
        //  System.out.println(" New modified Vector="+v);
        //  System.out.println("new Capacity="+v.capacity());
          Enumeration e=v.elements();
          while(e.hasMoreElements()){
        	   Integer i=(Integer)e.nextElement();
        	   if(i%2==0)     	   
        	   
        	  System.out.println(i);
          }
		
	}

}
