package Com.IBM.Advance.Collections.List;
import Com.IBM.Advance.Collections.List.ArrayListdata;
import java.util.*;

public class ArrayListDecendingOrder {

	public static void main(String[] args) {
       List<ArrayListdata> l=new ArrayList<>();
       
       ArrayListdata d1=new ArrayListdata("Apple","iphone10S",70000,10);
       ArrayListdata d2=new ArrayListdata("Nokia","1110",2000,4);
       ArrayListdata d3=new ArrayListdata("Lenovo","VibeK5",10000,6);
       ArrayListdata d4=new ArrayListdata("BlackBerry","L5",30000,8);
       ArrayListdata d5=new ArrayListdata("MI","V5",15000,7);
       ArrayListdata d6=new ArrayListdata("Oppo","F5",20000,9);
        l.add(d1);
        l.add(d2);
        l.add(d3);
        l.add(d4);
        l.add(d5);
        l.add(d6);
        System.out.println("Actual List"+l);
          System.out.println("Sorting the List As a comparator::");
          Collections.sort(l, new RatingComparator());
          System.out.println(l);  
          System.out.println("Reversing the Comparator sorting");  
          Comparator<ArrayListdata> cmp = Collections.reverseOrder(new RatingComparator());  
    
          Collections.sort(l, cmp);  
          System.out.println("Printing the reverse list");  
          System.out.println(l);  
          
	}

}
