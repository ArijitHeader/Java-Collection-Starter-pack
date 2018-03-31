package Com.IBM.Collections.List;
import java.util.*;
public class LinkedListExample {

	public static void main(String[] args) {
		
	LinkedList <String> l= new LinkedList <String>();
	
	l.add("A");
	l.add("B");
	l.add("C");
	l.add(3,"D");
	l.addFirst("Hi");
     l.addLast("Bye");
     System.out.println("LinkList="+l);   
     System.out.println("Size1="+l.size());
     LinkedList<Integer> s=new LinkedList<Integer>(); 
     s.add(01);
     s.add(02);
     s.add(03);
     s.add(04);
     s.addFirst(00);
     s.addLast(10);
     System.out.println("LinkList="+s);
     System.out.println("Size2="+s.size());
     int n=l.size()+s.size();
 	LinkedList <Object> k= new LinkedList<Object>();
    for(int i=0;i<l.size();i++){
    	 k.add(l.get(i));
    }
     for(int i=0;i<s.size();i++){
    	 k.add(s.get(i));
    	 
     }
     System.out.println("Final List="+k);
     
     
	}

}
