//QUES - https://leetcode.com/problems/longest-harmonious-subsequence/?envType=problem-list-v2&envId=sliding-window

package Arrays_ArrayList.algorithms.slidingWindow;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class HarmoniousSubsequence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        System.out.print("Enter array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findLongestHarmonious(arr));
    }
    
    static int findLongestHarmonious(int[] arr){
        Arrays.sort(arr);
        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        while(j < arr.length){
            int diff = arr[j] - arr[i];
            
            if(diff == 0)
                j++;
            else if(diff == 1){
                max = (j-i+1) > max ? (j-i+1) : max;
                j++;
            }
            else if(diff > 1)
                i++;
        }
        return max;
    }
}

//                             i
//                             j
//sorted array : 1 2 2 2 3 3 5 7
//input - [1,3,2,2,5,2,3,7]
//output - 5 ( as 2 2 2 3 3 is longest)
//since in harmonious diff of largest - smallest == 1.



// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int findLHS(int[] nums) {
//         Arrays.sort(nums);
//         int i=0;
//         int j=0;
//         int max = Integer.MIN_VALUE;

//         while(j<nums.length){
//             int diff = nums[j] - nums[i];

//             if(diff == 0)
//                 j++;
//             else if(diff == 1){
//                 max = (j-i+1) > max ? (j-i+1) : max;
//                 j++;
//             }
//             else if(diff > 1)
//                 i++;
//         }
//         return max == Integer.MIN_VALUE ? 0 : max;
//     }
// }