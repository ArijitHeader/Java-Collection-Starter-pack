package Com.IBM.Collections.List;

public class ArrayExample {

	public static void main(String[] args) {
   String s="Bangalore";
   int  beg=0;
   int end=s.length()-1;
     for(int i =1;i<s.length()-1;i++){
    	  beg++;
    	  end--;
    	  
    	  System.out.println(s.charAt(beg)+""+s.charAt(end));
    	
    	  
    	}
     }
        /* while(end!=1){
        	 beg++;
        	 end--;
        	 System.out.println(s.charAt(beg)+""+s.charAt(end));
        	 
         }*/
         
	}


