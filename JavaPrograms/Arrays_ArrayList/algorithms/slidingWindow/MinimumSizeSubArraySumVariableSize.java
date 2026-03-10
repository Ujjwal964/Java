//QUES - https://leetcode.com/problems/minimum-size-subarray-sum/description/
//SOURCE - nikhil lohia () | Technosage girl (https://youtu.be/1FR7rZ7aJfs?si=MsMU-bkxbtMgEBoy).

package Arrays_ArrayList.algorithms.slidingWindow;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------
//VARIABLE SIZE SLIDING WINDOW APPROACH

public class MinimumSizeSubArraySumVariableSize {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter array : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter sum value : ");
        int target = sc.nextInt();

        System.out.print(findMinimumSubArrayEqualsSum(arr , target));
    }

    static int findMinimumSubArrayEqualsSum(int[] arr , int target){
        int i = 0;
        int j = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        while(j < arr.length){
            sum = sum + arr[j];

            while(sum >= target){
                // min = (j-i+1) < min ? (j-i+1) : min;
                min = Math.min(min , (j-i+1));

                sum = sum - arr[i];
                i++;
            }
            j++;
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}

//                i
//                  j
//input - 2 3 1 2 4 3 , target - 7
//output - 2 (min subarray size is [4,3]).




// ----------------------------------------LEETCODE SOL-----------------------------------------
//VARIABLE SIZE SLIDING WINDOW APPROACH
// class Solution {
//     public int minSubArrayLen(int target, int[] nums) {
//         int i = 0;
//         int j = 0;
//         int sum = 0;
//         int min = Integer.MAX_VALUE;

//         while(j < nums.length){
//             sum = sum + nums[j];
            
//             while(sum >= target){
//                 int windowSize = j-i+1;
//                 min = windowSize < min ? windowSize : min;
//                 sum = sum - nums[i];
//                 i++;
//             }
//             j++;
//         }
//         return min == Integer.MAX_VALUE ? 0 : min;
        
//     }
// }