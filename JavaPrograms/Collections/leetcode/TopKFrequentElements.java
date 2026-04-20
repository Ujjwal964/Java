//QUES - https://leetcode.com/problems/top-k-frequent-elements/description/
//QUES - TOP-K FREQUENT ELEMENTS (COLLECTIONS + COMPARATOR + LAMBDA + LIST)

package Collections.leetcode;
import java.util.*;

//BETTER APPROACH (USING COLLECTIONS + COMPARATOR + LAMBDA + LIST )
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


//ANOTHER OPTIMAL APPROACH USING HEAP ( PRIORITY QUEUE )
// public class TopKFrequentElements{
//     public static void main(String[] args){
//         int[] arr = {1,2,1,2,1,2,3,1,3,2};
//         int k = 2;
//         Map<Integer,Integer> map = new HashMap<>();
//         for(int i : arr){
//             map.put(i , map.getOrDefault(i , 0) + 1);
//         }
//         System.out.println("Map is : "+map);
        
//         Queue<Integer> maxHeap = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        
//         for(int key : map.keySet()){
//             maxHeap.offer(key);
//         }
//         System.out.println("Max Heap Queue is : "+maxHeap);
        
//         int[] ans = new int[k];
//         for(int i=0;i<k;i++){
//             ans[i] = maxHeap.poll();
//         }
//         System.out.println(Arrays.toString(ans));
//     }    
// }

// ----------------------------------------LEETCODE SOL-----------------------------------------

//BETTER APPROACH (USING COLLECTIONS + COMPARATOR + LAMBDA + LIST )
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


//ANOTHER OPTIMAL APPROACH USING HEAP ( PRIORITY QUEUE )
// class Solution {
//     public int[] topKFrequent(int[] arr, int k) {
//         Map<Integer,Integer> map = new HashMap<>();
//         for(int i : arr){
//             map.put(i , map.getOrDefault(i , 0) + 1);
//         }
        
//         Queue<Integer> maxHeap = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
//         for(int key : map.keySet()){
//             maxHeap.offer(key);
//         }
        
//         int[] ans = new int[k];
//         for(int i=0;i<k;i++){
//             ans[i] = maxHeap.poll();
//         }   
//         return ans;
//     }
// }
