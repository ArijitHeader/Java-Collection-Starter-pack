package Com.IBM.Collections.List;

import java.util.*;

public class ArrayListToArrayReverse {

	public static void main(String[] args) {
       List<String> l=new ArrayList<String>();
       Stack S=new Stack();
       Stack S1=new Stack();

       
        l.add("Banana");
        l.add("Mango");
        l.add("Cherry");
        l.add("Orange");
        l.add("Apple");
        System.out.println("List is ="+l);
        System.out.println("Converting arrayList To array=");
        String[] a=l.toArray(new String[l.size()]);
        for(String s:a){
        System.out.println(s);
        S.push(s);
        }
        System.out.println("Stack Array Is=");
        System.out.println(S);
        System.out.println("Converting Arrayto ArrayList=");
        List<String> l2=new ArrayList<String>();
        l2=Arrays.asList(a);
        System.out.println(l2);
        
        System.out.println("Stack List is=");
        S1.addAll(l2);
       System.out.println(S1);
	}

}
