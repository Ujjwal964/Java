//QUES - https://leetcode.com/problems/single-number-iii/description/
//QUES - SINGLE NUMBER 3 

package Bit_Manipulation.leetcode;
import java.util.*;


public class SingleNumberThree{
    public static void main(String[] args){
        int[] arr = {1,2,1,3,2,5};
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i , map.getOrDefault(i , 0) + 1);
        }
        
        int[] ans = new int[2];
        int index = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                ans[index++] = entry.getKey();
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}


// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int[] singleNumber(int[] arr) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i : arr){
//             map.put(i , map.getOrDefault(i , 0) + 1);
//         }
        
//         int[] ans = new int[2];
//         int index = 0;
//         for(Map.Entry<Integer,Integer> entry : map.entrySet()){
//             if(entry.getValue() == 1){
//                 ans[index++] = entry.getKey();
//             }
//         }
//         return ans;        
//     }
// }