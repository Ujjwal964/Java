//QUES - https://leetcode.com/problems/top-k-frequent-elements/description/
//QUES - TOP-K FREQUENT ELEMENTS (COLLECTIONS + COMPARATOR + LAMBDA + LIST)

package Collections.leetcode;
import java.util.*;


public class TopKFrequentElements{
    public static void main(String[] args){
        int[] arr = {1,2,1,2,1,2,3,1,3,2};
        int k = 2;
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i , map.getOrDefault(i , 0) + 1);
        }
        System.out.println("Map is : "+map);
        
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());
        System.out.println("Sorted list desc is : "+list);
        
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = list.get(i).getKey();
        }
        System.out.println("Final answer K Frequent Elements : "+Arrays.toString(ans));
    }
}

// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int[] topKFrequent(int[] arr, int k) {
//         Map<Integer,Integer> map = new HashMap<>();
//         for(int i : arr){
//             map.put(i , map.getOrDefault(i , 0) + 1);
//         }

//         List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
//         list.sort((a,b) -> b.getValue() - a.getValue());

//         int[] ans = new int[k];
//         for(int i=0;i<k;i++){
//             ans[i] = list.get(i).getKey();
//         }
//         return ans;   
//     }
// }
