//QUES - Sorting using Collections BASIC

package Collections.basicsPractise;
import java.util.*;


public class CollectionsSortingBasic{
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(10,3,7,1,9));
        System.out.println("Before Sort : "+list);
        Collections.sort(list);
        System.out.println("Ascending : "+list);
        Collections.sort(list , Collections.reverseOrder());
        System.out.println("Descending : "+list);
    }
}