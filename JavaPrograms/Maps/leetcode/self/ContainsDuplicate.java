//QUES - https://leetcode.com/problems/contains-duplicate/description/

package Maps.leetcode.self;
import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,1};
        ContainsDuplicate obj = new ContainsDuplicate();
        System.out.println(obj.containsDuplicate(arr));
    }

    boolean containsDuplicate(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int a : arr){
            if(set.contains(a))
                return true;
            set.add(a);
        }
        return false;
    }
}




// ----------------------------------LEETCODE SOL---------------------------------

// class Solution {
//     public boolean containsDuplicate(int[] arr) {
//         Set<Integer> set = new HashSet<>();
//         for(int a : arr){
//             if(set.contains(a))
//                 return true;
//             set.add(a);
//         }
//         return false;
//     }
// }