//QUES - https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/description/

package Arrays_ArrayList.algorithms.slidingWindow;
import java.util.*;

public class NumOfSubArraysWithThreshold{
    public static void main(String[] args){
        int[] arr = new int[]{2,2,2,2,5,5,5,8};
        int k = 3;
        int threshold = 4;
        System.out.println(findNumOfSubArrays(arr , k , threshold));
    }
    
    static int findNumOfSubArrays(int[] arr , int k , int threshold){
        int i = 0;
        int j = 0;
        int count = 0;
        int average = 0;
        int sum = 0;

        while(j < arr.length ){
            sum = sum + arr[j];

            if(j-i+1 < k)
                j++;
            else if(j-i+1 == k){
                average = sum / k;
                if(average >= threshold)
                    count++;
                
                j++;
                sum = sum - arr[i];
                i++;
            }
        }
        return count;  
    }
}


//             i
//                 j
// input - [2,2,2,2,5,5,5,8] , k = 3 , threshold = 4;
// output - 3


// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int numOfSubarrays(int[] arr, int k, int threshold) {
//         int i = 0;
//         int j = 0;
//         int count = 0;
//         int average = 0;
//         int sum = 0;

//         while(j < arr.length ){
//             sum = sum + arr[j];

//             if(j-i+1 < k)
//                 j++;
//             else{
//                 average = sum / k;
//                 if(average >= threshold)
//                     count++;
                
//                 j++;
//                 sum = sum - arr[i];
//                 i++;
//             }
//         }
//         return count;        
//     }
// }
