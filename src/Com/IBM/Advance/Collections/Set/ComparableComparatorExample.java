package Com.IBM.Advance.Collections.Set;

import java.util.*;

public class ComparableComparatorExample {

	public static void main(String[] args) {
		Employee e1=new Employee("Arun",100);
		Employee e2=new Employee("Varun",101);
		Employee e3=new Employee("Lala",102);
		Employee e4=new Employee("ArunLal",109);
		Employee e5=new Employee("Zoo",99);


       TreeSet t=new TreeSet();
       t.add(e1);
       t.add(e2);
       t.add(e3);
       t.add(e4);
       t.add(e5);
       System.out.println(t);
       
       TreeSet t1=new TreeSet(new myComparator());
       t1.add(e1);
       t1.add(e2);
       t1.add(e3);
       t1.add(e4);
       t1.add(e5);
       System.out.println(t1);
       
	}

}


