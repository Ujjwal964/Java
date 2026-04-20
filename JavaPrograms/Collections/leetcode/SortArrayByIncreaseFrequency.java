//QUES- https://leetcode.com/problems/sort-array-by-increasing-frequency/description/
//COLLECTIONS + MAP + LIST + LAMBDA

package Collections.leetcode;
import java.util.*;

public class SortArrayByIncreaseFrequency{
    public static void main(String[] args){
        int[] arr = {2,3,1,3,2};
        
        System.out.println("Final Array is : "+Arrays.toString(sortArrayByFrequency(arr)));
    }
    
    static int[] sortArrayByFrequency(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i , map.getOrDefault(i , 0) + 1);
        }
        System.out.println("Map is : "+map);
        
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        System.out.println("Converted map -> list : "+list);
        
        // Collections.sort(list , (a,b) -> a.getValue().equals(b.getValue()) ? b.getKey() - a.getKey() : a.getValue() - b.getValue());
        
        //OR
        list.sort((a,b) -> a.getValue().equals(b.getValue()) ? b.getKey() - a.getKey() : a.getValue() - b.getValue());
        
        System.out.println("Sorted list as per values is : "+list);
        
        int index = 0;
        for(Map.Entry<Integer,Integer> entry : list){
            for(int i=0;i<entry.getValue();i++){
                arr[index++] = entry.getKey();
            }
        }
        return arr;
    }
}


// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int[] frequencySort(int[] arr) {
//         Map<Integer,Integer> map = new HashMap<>();
//         for(int i : arr){
//             map.put(i , map.getOrDefault(i , 0) + 1);
//         }
        
//         List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
//         list.sort((a,b) -> a.getValue().equals(b.getValue()) ? b.getKey() - a.getKey() : a.getValue() - b.getValue());
        
//         int index = 0;
//         for(Map.Entry<Integer,Integer> entry : list){
//             for(int i=0;i<entry.getValue();i++){
//                 arr[index++] = entry.getKey();
//             }
//         }
//         return arr;
//     }
// }