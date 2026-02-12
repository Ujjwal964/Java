//QUES - https://leetcode.com/problems/running-sum-of-1d-array/
//MEANS : running sum means lets say array is [1,2,3,4] so output will be [1,3,6,10].
//it will take sum of previous values on every coming index.

package Arrays_ArrayList.leetcode.assignments.easy;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class ArrayRunningSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[4];
        System.out.print("Give an array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        runningSum(arr);
    }

    static void runningSum(int[] arr){
        int[] runSum = new int[arr.length];
        int sum = 0;

        for(int i=0;i<runSum.length;i++){
            sum = arr[i] + sum;
            runSum[i] = sum;
        }
        System.out.println("Running Sum of Array : "+Arrays.toString(runSum));
    }
}


// ----------------------------------------LEETCODE SOL-----------------------------------------


// class Solution {
//     public int[] runningSum(int[] nums) {
//         int[] runningSum = new int[nums.length];
//         int sum = 0;

//         for(int i=0;i<runningSum.length;i++){
//             sum = nums[i] + sum;
//             runningSum[i] = sum;
//         }

//         return runningSum;
//     }
// }