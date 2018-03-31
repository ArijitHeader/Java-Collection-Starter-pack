package Com.IBM.Collections.Map;

import java.util.*;

public class WeakHashMapExample {

	public static void main(String[] args) throws InterruptedException {
		WeakHashMap m=new WeakHashMap();
		Temp1 t= new Temp1();
		m.put(t, "A");
		System.out.println(m);
		t=null;
		System.gc();
		Thread.sleep(3000);
		System.out.println(m);
	}

}
class Temp1{
	public String toString()
	{
		return "temp";
	}
	public void finalize(){
		System.out.println("Finalize called");
		
	}
	
}