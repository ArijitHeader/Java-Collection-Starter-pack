package Com.IBM.Collections.List;

import java.util.ArrayList;

public class CustomArrayList {
	
	int n=4;
	class Data{
		int roll;
		String Name;
		int marks;
		long phone;
		
		Data(int roll,String name, int marks,long phone){
			this.roll=roll;
			this.Name=name;
			this.marks=marks;
			this.phone=phone;
			
		}
		
	}

	public static void main(String[] args) {
		
		int roll []={1,2,3,4};
        String name[]={"Arijit","Sounak","Varun","Rakesh"};
        int marks[]={45,50,40,60};
        long phone[]={9800633939L,9732689804L,9933344619L,9709564771L};
        CustomArrayList ca= new CustomArrayList();
        ca.sendValues(roll,name,marks,phone);
        
	}

	public void sendValues(int roll[],String name[],int marks[],long phone[]) {
		
		ArrayList<Data> a=new ArrayList<Data>();
		for(int i=0;i<n;i++){
			a.add(new Data( roll[i],name[i],marks[i],phone[i]));
			
		}
		printValues(a);
	}
           public void printValues(ArrayList<Data> list){
        	   
        	   for(int i=0;i<n;i++)
        	   {
        		   Data d= list.get(i);
        		   System.out.println(d.roll+" "+d.Name+"   "+d.marks+" "+d.phone);
        	   }
           }
}
