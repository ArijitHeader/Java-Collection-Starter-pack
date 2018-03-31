package Com.IBM.Collections.Queue;

import java.util.*;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue();
	         System.out.println(q.peek());
	         for(int i=0;i<=10;i++){
	        	 q.offer(i);
	         }
	         System.out.println(q);
	         System.out.println(q.poll());
	         System.out.println(q);
	}

}

//op will be: [1, 3, 2, 7, 4, 5, 6, 10, 8, 9] because some platform won't provide priority queues we have to get the patch.
 