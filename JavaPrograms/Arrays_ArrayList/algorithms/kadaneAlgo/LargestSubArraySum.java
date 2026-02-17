// KADANE's ALGORITHM : used to find largest subarray sum from an array.
//LEETCODE QUES - https://leetcode.com/problems/maximum-subarray/

package Arrays_ArrayList.algorithms.kadaneAlgo;
import java.util.*;

public class LargestSubArraySum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] arr = {3,4,-2,5,6};
        System.out.println("Given array is : "+Arrays.toString(arr));
        
        largestSubArraySum(arr);
    }
    
    //--------BRUTE FORCE WAY-----------
    // static void largestSubArraySum(int[] arr){
    //     int max = 0;
    //     int start = 0;
    //     int end = 0;
    //     for(int i=0;i<arr.length;i++){
    //         int prefixSum = 0;
    //         for(int j=i;j<arr.length;j++){
    //             prefixSum = arr[j] + prefixSum;
    //             if(prefixSum > max){
    //                 max = prefixSum;
    //                 start = i;
    //                 end = j;
    //             }
    //             // max = prefixSum > max ? prefixSum : max;
    //         }
    //     }
    //     System.out.println("SubArray is : "+Arrays.toString(Arrays.copyOfRange(arr , start , end+1)));
    //     System.out.println("Largest Sum : "+max);
    // }
    
    
    //--------KADANE's ALGORITHM-----------
    static void largestSubArraySum(int[] arr){
        int max = arr[0];
        int prefixSum = 0;
        for(int i=0;i<arr.length;i++){
            prefixSum = prefixSum + arr[i];
            max = prefixSum > max ? prefixSum : max;
            
            if(prefixSum < 0)
                prefixSum = 0;
        }
        System.out.println("SubArray Max value is : "+max);
    }
}



// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int maxSubArray(int[] nums) {
//         int prefixSum = 0;
//         int max = nums[0];
//         for(int i=0;i<nums.length;i++){
//             prefixSum += nums[i];
//             max = prefixSum > max ? prefixSum : max;

//             if(prefixSum < 0)
//                 prefixSum = 0;
//         }
//         return max;
//     }
// }