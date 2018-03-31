package Com.IBM.Collections.Set;

import java.util.*;




public class TreeSetDescOrderInteger {

	public static void main(String[] args) {
          
		TreeSet<Integer> t=new TreeSet<>(new myComparator());
		t.add(0);
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(4);
		t.add(5);

		System.out.println(t);
		
		
		
	}

}
 class myComparator implements Comparator<Integer>{  
    @Override  
    public int compare(Integer obj1, Integer obj2) {  
    	/*Integer i1=(Integer)obj1;  //Style 1
    	Integer i2=(Integer)obj2;
   	if(i1<i2)
    		return +1;
    	else if(i1>i2)
    	return -1;
    	else return 0; */
    	return -obj1.compareTo(obj2);  //style 2
    	//return -1;  //desc order
    	//return 1; //asec order
    	// return 0;  //first element will be inserted rest duplicates
        //return (obj1<obj2) ? 1 : (obj1>obj2) ? -1 : 0;  //style 3
    }  
}