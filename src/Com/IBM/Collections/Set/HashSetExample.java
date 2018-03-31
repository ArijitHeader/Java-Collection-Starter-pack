package Com.IBM.Collections.Set;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		LinkedHashSet h=new LinkedHashSet(); 
		Stack<String> s=new Stack<>();
		h.add("A");
		h.add("B");
		h.add("C");
		h.add(null);
		h.add(1);
		System.out.println(h);
		//System.out.println(h.add("A"));
		
		Iterator<String> itr=h.iterator();
		
		while(itr.hasNext()){
			Object data=itr.next();
			if(data!=null){
				//System.out.println(data.getClass().getSimpleName());
				String simpleName=data.getClass().getSimpleName();
				if(simpleName.equalsIgnoreCase("String"))
					s.push((String)data);
				
				
			}
		}
		/*for(int i=0;i<h.size();i++){
			if(h.equals("A")){
				
				
			}
			
		}*/
		System.out.println(s);
	}

}
