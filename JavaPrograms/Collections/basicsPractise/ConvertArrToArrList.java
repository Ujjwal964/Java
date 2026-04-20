//QUES - Convert Array to ArrayList

package Collections.basicsPractise;
import java.util.*;

public class ConvertArrToArrList{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        
        System.out.println(list);
    }
}