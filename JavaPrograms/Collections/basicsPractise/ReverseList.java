//QUES - Reverse List

package Collections.basicsPractise;
import java.util.*;

public class ReverseList{
    public static void main(String[] args){
        // List<Integer> list = Arrays.asList(1,2,3,4,5);   //can't do add/remove(fixed size list)
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));  //can do everything (dynamic size list)
        System.out.println("Before Reverse : "+list);
        
        int i=0;
        int j=list.size()-1;
        
        while(j>i){
            int temp = list.get(i);
            list.set(i , list.get(j));
            list.set(j , temp);
            
            i++;
            j--;
        }
        System.out.println("After Reverse : "+list);
    }
}