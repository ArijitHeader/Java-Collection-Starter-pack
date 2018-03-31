package Com.IBM.Advance.Collections.List;

import java.util.Comparator;

public class RatingComparator implements Comparator<ArrayListdata> {  
    @Override  
    public int compare(ArrayListdata obj1, ArrayListdata obj2) {  
        return (obj1.rating<obj2.rating) ? -1 : (obj1.rating>obj2.rating) ? 1 : 0;  
    }  
}