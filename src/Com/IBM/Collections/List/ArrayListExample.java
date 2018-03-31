package Com.IBM.Collections.List;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
	    List <Integer> z=new ArrayList<Integer>();

		List<Integer> l =new ArrayList<Integer> ();
	    l.add(12);
	    l.add(8);
	    l.add(10);
	    List <Integer> s=new ArrayList<Integer>();
	    
	    s.add(6);
	    s.add(18);
	    s.add(70);
	    
	    for(int i=0;i<l.size();i++){
	    	if(l.get(i)<s.get(i)){
	    		z.add(s.get(i));
	    	}
	    	else{
	    		z.add(l.get(i));
	    	}
	    }
         System.out.println(z);
         System.out.println(z.get(0));
	}
	}
