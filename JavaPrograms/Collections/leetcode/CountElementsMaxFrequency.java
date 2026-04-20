//QUES - https://leetcode.com/problems/count-elements-with-maximum-frequency/description/
//QUES - COUNT ELEMENTS WITH MAX FREQUENCY

package Collections.leetcode;
import java.util.*;

public class CountElementsMaxFrequency{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i , map.getOrDefault(i , 0) + 1);
        }
        System.out.println(map);
        
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b) -> Integer.compare(b.getValue(),a.getValue()));
        System.out.println("Sorted list is : "+list);
        
        int max = list.get(0).getValue();
        int sum = 0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).getValue() == max)
                sum += list.get(i).getValue();
        }
        System.out.println(sum);
    }
    
    // OR
    // public static void main(String[] args){
    //     int[] arr = {1,2,3,4,5};
        
    //     HashMap<Integer,Integer> map = new HashMap<>();
    //     for(int i : arr){
    //         map.put(i , map.getOrDefault(i , 0) + 1);
    //     }
    //     System.out.println(map);
        
    //     int max = Integer.MIN_VALUE;
    //     for(int value : map.values()){
    //         max = value > max ? value : max;
    //     }
    //     System.out.println(max);
        
    //     int sum = 0;
    //     for(int value : map.values()){
    //         if(value == max)
    //             sum += value;
    //     }
    //     System.out.println(sum);
    // }
}


// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int maxFrequencyElements(int[] arr) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i : arr){
//             map.put(i , map.getOrDefault(i , 0) + 1);
//         }
        
//         List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
//         list.sort((a,b) -> Integer.compare(b.getValue(),a.getValue()));
        
//         int max = list.get(0).getValue();
//         int sum = 0;
//         for(int i=0;i<list.size();i++){
//             if(list.get(i).getValue() == max)
//                 sum += list.get(i).getValue();
//         }
//         return sum;
//     }
// }


//OR
// class Solution {
//     public int maxFrequencyElements(int[] arr) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i : arr){
//             map.put(i , map.getOrDefault(i , 0) + 1);
//         }
        
//         int max = Integer.MIN_VALUE;
//         for(int value : map.values()){
//             max = value > max ? value : max;
//         }
        
//         int sum = 0;
//         for(int value : map.values()){
//             if(value == max)
//                 sum += value;
//         }
//         return sum;
//     }
// }