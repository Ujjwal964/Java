//QUES - https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/

package Arrays_ArrayList.algorithms.slidingWindow;
import java.util.*;

public class SubStringWithDistinctChar{
    public static void main(String[] args){
        String s = new String("aababcabc");
        System.out.println(countGoodSubstrings(s));
    }
    static int countGoodSubstrings(String s){
        Map<Character , Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        int i = 0;
        int j = 0;
        int count = 0;

        while( j < arr.length){
            map.put(arr[j] , map.getOrDefault(arr[j] , 0) + 1);

            if(j-i+1 < 3)
                j++;
            else{
                if(map.size() == 3)
                    count++;
                j++;

                if(map.containsKey(arr[i])){
                    map.put(arr[i] , map.get(arr[i]) - 1);

                    if(map.get(arr[i]) == 0)
                        map.remove(arr[i]);
                }
                i++;
            }
        }
        return count;
    }
}


//          i
//                j
//input - " a a b a b c a b c" , size - 3
//output - 1


// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int countGoodSubstrings(String s) {
//         Map<Character , Integer> map = new HashMap<>();
//         char[] arr = s.toCharArray();
//         int i = 0;
//         int j = 0;
//         int count = 0;

//         while( j < arr.length){
//             map.put(arr[j] , map.getOrDefault(arr[j] , 0) + 1);

//             if(j-i+1 < 3)
//                 j++;
//             else{
//                 if(map.size() == 3)
//                     count++;
//                 j++;

//                 if(map.containsKey(arr[i])){
//                     map.put(arr[i] , map.get(arr[i]) - 1);

//                     if(map.get(arr[i]) == 0)
//                         map.remove(arr[i]);
//                 }
//                 i++;
//             }
//         }
//         return count;
//     }
// }