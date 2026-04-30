//QUES - https://leetcode.com/problems/subsets/description/
//SOURCE - Striver (https://youtu.be/LqKaUv1G3_I?si=ntGpWpZ6_CYzQMon)/ Shashcode (https://youtu.be/Dd9d-uWyilE?si=3xEI5xQHCd8Nwq9C)

package Bit_Manipulation.leetcode;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class Subsets {
    public static void main(String[] args){
        int[] arr = {1,2,3};
        
        int totalSubsets = 1 << arr.length;
        List<List<Integer>> ans = new ArrayList<>(totalSubsets);
        for(int i=0;i<totalSubsets;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<arr.length;j++){
                if((i & (1 << j)) != 0 ) //checking if in i the jth bit is set or not
                    list.add(arr[j]);
            }
            ans.add(list);
        }
        System.out.println(ans);
    }
}

// ----------------------------------------LEETCODE SOL-----------------------------------------
// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
//         List<List<Integer>> ans = new ArrayList<>();
//         int totalSubsets = 1 << nums.length;

//         for(int i=0;i<totalSubsets;i++){
//             List<Integer> eachSet = new ArrayList<>();
//             for(int j = 0;j<nums.length;j++){
//                 if((i & (1 << j)) != 0)
//                     eachSet.add(nums[j]);
//             }
//             ans.add(eachSet);
//         }
//         return ans;   
//     }
// }