package Com.IBM.Collections.List;

import java.util.*;

public class StackExample {

	public static void main(String[] args) {
      Stack s=new Stack();
      s.push("A");
      s.push(1);
      s.push(8);
      s.push("B");
      s.push(19);
      s.push("Arijit");
      s.push("LOL");

      System.out.println(s);
      s.pop();
      System.out.println(s);
      System.out.println(s.size());

       s.peek();
       System.out.println(s.size());
       System.out.println(s);
       System.out.println(s.get(3));

       
	}

}
