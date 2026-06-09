//QUES - GFG (https://www.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1)

package Arrays_ArrayList.algorithms.slidingWindow;
import java.util.*;

public class CountDistinctElementsInEveryWindow{
    public static void main(String[] args){
        int[] arr = new int[]{1,1,1,1,1};
        int k = 3;
        System.out.println(countDistinctElements(arr , k));
    }
    
    static ArrayList<Integer> countDistinctElements(int[] arr , int k){
        int i = 0;
        int j = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        
        while(j < arr.length){
            map.put(arr[j] , map.getOrDefault(arr[j] , 0) + 1);
            

            if(j-i+1 < k)
                j++;
            
            else if(j-i+1 == k){
                ans.add(map.size());
                j++;
                
                if(map.containsKey(arr[i])){
                    map.put(arr[i] , map.get(arr[i]) - 1);
                    
                    if(map.get(arr[i]) == 0)
                        map.remove(arr[i]);
                }
                i++;
            }
        }
        return ans;
    }
}

//                       i
//                                  j
//input - [ 1 , 2 , 1 , 3 , 4 , 2 , 3] , k = 4;
//output - [3,4,4,3]


// ----------------------------------------GFG SOL-----------------------------------------

// class Solution {
//     ArrayList<Integer> countDistinct(int arr[], int k) {
//         int i = 0;
//         int j = 0;
//         ArrayList<Integer> ans = new ArrayList<>();
//         Map<Integer,Integer> map = new HashMap<>();
        
//         while(j < arr.length){
//             map.put(arr[j] , map.getOrDefault(arr[j] , 0) + 1);
            

//             if(j-i+1 < k)
//                 j++;
            
//             else if(j-i+1 == k){
//                 ans.add(map.size());
//                 j++;
                
//                 if(map.containsKey(arr[i])){
//                     map.put(arr[i] , map.get(arr[i]) - 1);
                    
//                     if(map.get(arr[i]) == 0)
//                         map.remove(arr[i]);
//                 }
//                 i++;
//             }
//         }
//         return ans;
//     }
// }