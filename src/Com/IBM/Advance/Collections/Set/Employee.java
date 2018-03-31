package Com.IBM.Advance.Collections.Set;

import java.util.Comparator;

public class Employee implements Comparable {
   String name;
   int eid;
     
public Employee(String name, int eid) {
	super();
	this.name = name;
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", eid=" + eid + "]";
}
   public int compareTo(Object obj){
	   int eid1=this.eid;
	  Employee e=(Employee)obj;
	  int eid2=e.eid;
	  if(eid1<eid2)
		  return -1;
	  else if(eid1>eid2)
		  return 1;
	  else return 0;
          
   }
}
class myComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		Employee e1=(Employee)obj1;
		Employee e2=(Employee)obj2;
		String s1=e1.name;
		String s2=e2.name;
		 return s1.compareTo(s2);
	}
}
