//QUES - SORT ARRAY ELEMENTS BY FREQUENCY SORT
package Collections.basicsPractise;
import java.util.*;

public class SortArrayByFrequency{
    public static void main(String[] args){
        int[] arr = {1,1,2,2,2,3};
        
        // USING COMPARATOR + LAMBDA + LIST
        HashMap<Integer,Integer> map = new HashMap<>();
        
        // for(int i=0;i<arr.length;i++){
        //     map.put(arr[i] , map.getOrDefault(arr[i] , 0) + 1);
        // }
        
        //OR
        for(int i : arr){
            map.put(i , map.getOrDefault(i , 0) + 1);
        }
        System.out.println(map);
        
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        System.out.println(list);
        
        Collections.sort(list, (a,b)-> a.getValue() - b.getValue());
        System.out.println(list);
        
        Map<Integer,Integer> ans = new LinkedHashMap<>();
        for(Map.Entry<Integer,Integer> entry : list){
            ans.put(entry.getKey() , entry.getValue());
        }
        System.out.println(ans);
        
        int index = 0;
        for(Map.Entry<Integer,Integer> entry : ans.entrySet()){
            int value = entry.getValue(); 
            int key = entry.getKey();
            
            for(int i=0;i<value;i++){
                arr[index++] = key;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}