//QUES - ARRAY ELEMENTS FREQUENCY SORT WITH TIE-BREAKER
package Collections.basicsPractise;
import java.util.*;

public class SortArrayByFrequencyTieBreaker{
    public static void main(String[] args){
        int[] arr = {4,4,1,1,1,2,2,3};
        
        // USING COMPARATOR + LAMBDA + LIST
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i , map.getOrDefault(i , 0) + 1);
        }
        System.out.println("Map now : "+map);
        
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        System.out.println("Map -> List is : "+list);
        
        Collections.sort(list , new Comparator<Map.Entry<Integer,Integer>>(){
            
            @Override
            public int compare(Map.Entry<Integer,Integer>a , Map.Entry<Integer,Integer>b){
                int diff = a.getValue() - b.getValue();
                if(diff == 0)
                    return a.getKey() - b.getKey();
                else
                    return diff;
            }
        });
        
        //OR
        // Collections.sort(list, (a,b) -> a.getValue().equals(b.getValue()) ? a.getKey() - b.getKey() : a.getValue() - b.getValue());
        
        System.out.println("Sorted List is :"+list);
        
        int index = 0;
        for(Map.Entry<Integer,Integer> entry : list){
            for(int i=0;i<entry.getValue();i++){
                arr[index++] = entry.getKey();
            }
        }
        System.out.println("Final answer is : "+Arrays.toString(arr));
    }
}