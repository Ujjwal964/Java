package Revision_Practise;
import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args){
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,5,7,2,9));
        List<Integer> list2 = Arrays.asList(4,2,7,9,1);
        // List<Integer> list3 = new ArrayList<>(List.of(4,3,6,9));
        // List<Integer> list4 = List.of(1,5,3,8);
        // List<String> list5 = new ArrayList<>(Arrays.asList("a","bbb","ez","cc"));

        System.out.println("List before sorting : "+list1);
        Collections.sort(list2);
        System.out.println("Asc sort : "+list2);
        Collections.sort(list1 , Collections.reverseOrder());
        System.out.println("Desc sort : "+list1);
        Collections.sort(list1 , (a,b) -> b - a);
        System.out.println("Desc sort lambda : "+list1);
        Collections.sort(list2 , new Comparator<Integer>(){
            @Override
            public int compare(Integer a , Integer b){
                return a - b;
            }
        });
        System.out.println("Asc sort Comparator : "+list2);

    }
    
}
