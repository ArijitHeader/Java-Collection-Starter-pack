package Com.IBM.Collections.Queue;
import java.util.*;
public class PriorityQueueCustomizedSorting {

	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue(15,new MyComparator());
		
		q.offer("A");
		q.offer("E");
		q.offer("I");
		q.offer("O");
		q.offer("U");
		System.out.println(q);
	}

}

class MyComparator implements Comparator{
	 public int compare(Object obj1,Object obj2){
		 String S1=(String)obj1;
		 String S2=obj2.toString();
		 return S2.compareTo(S1);
	 }
}