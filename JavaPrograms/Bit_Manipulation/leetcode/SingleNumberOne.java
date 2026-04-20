//QUES - https://leetcode.com/problems/single-number/
//QUES - SINGLE NUMBER
//SOURCE - 

package Bit_Manipulation.leetcode;
import java.util.*;

public class SingleNumberOne{
    public static void main(String[] args){
        int[] arr = {4,1,2,1,2};
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i , map.getOrDefault(i , 0) + 1);
        }
        
        int number = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1)
                number = entry.getKey();
        }
        System.out.println(number);
    }
}


// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int singleNumber(int[] arr) {
//         Map<Integer,Integer> map = new HashMap<>();
//         for(int i : arr){
//             map.put(i , map.getOrDefault(i , 0) + 1);
//         }
        
//         int number = 0;
//         for(Map.Entry<Integer,Integer> entry : map.entrySet()){
//             if(entry.getValue() == 1)
//                 number = entry.getKey();
//         }
//         return number;        
//     }
// }