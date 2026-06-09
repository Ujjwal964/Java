//QUES - GFG(https://www.geeksforgeeks.org/problems/length-of-longest-subarray0440/1)

package Arrays_ArrayList.algorithms.twoPointer;
import java.util.*;

public class LongestSubArrayNonNegative{
    public static void main(String[] args){
        int[] arr = new int[]{1, 0, 0, 1, -1, -1, 0, 0, 1, 0};
        System.out.println(findLongestSubArraySizeNonNeg(arr));
    }
    
    static int findLongestSubArraySizeNonNeg(int[] arr){
        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        
        while( j < arr.length){
            if(arr[j] >= 0){
                max = Math.max(max , (j-i+1) );
                j++;
            }

            else if(arr[j] < 0){
                j++;
                i=j;
            }
        }
        return (max == Integer.MIN_VALUE) ? 0 : max;
    }
}

//                          i
//                                   j
//input - [2, 3, 4, -1, -2, 1, 5, 6, 3]
//output - 4


// ----------------------------------------GFG SOL-----------------------------------------

// class Solution {
//     public int longestSubarray(int arr[]) {
//         int i = 0;
//         int j = 0;
//         int max = Integer.MIN_VALUE;
        
//         while( j < arr.length){
//             if(arr[j] >= 0){
//                 max = Math.max(max , (j-i+1) );
//                 j++;
//             }

//             else if(arr[j] < 0){
//                 j++;
//                 i=j;
//             }
//         }
//         return (max == Integer.MIN_VALUE) ? 0 : max;
//     }
// }
