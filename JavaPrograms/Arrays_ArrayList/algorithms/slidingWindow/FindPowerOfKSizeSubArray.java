// QUES - https://leetcode.com/problems/find-the-power-of-k-size-subarrays-i/description/
// SOURCE - 

package Arrays_ArrayList.algorithms.slidingWindow;
import java.util.*;

public class FindPowerOfKSizeSubArray {
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,3,2,5};
        int k = 3;
        System.out.println(Arrays.toString(findKSizeSubArray(arr , k)));
    }

    //BRUTE FORCE APPROACH
    static int[] findKSizeSubArray(int[] arr , int k){
        int[] ans = new int[arr.length - k + 1];

        for(int i=0;i<arr.length-k+1;i++){
            boolean isValid = true;
            for(int j=i;j<i+k-1;j++){
                if(arr[j+1] != arr[j] + 1 ){
                    isValid = false;
                    break;
                }
            }
            ans[i] = isValid ? arr[i+k-1] : -1;
        }
        return ans;
    }

    //
}


//          i 
//                  j
//input - [ 1 , 2 , 3 , 4 , 3 , 2 , 5 ]
//output - [3,4,-1,-1,-1]



// ---------------------LEETCODE SOL------------------------

//BRUTE FORCE APPROACH
// class Solution {
//     public int[] resultsArray(int[] arr, int k) {
//         int[] ans = new int[arr.length - k + 1];

//         for(int i=0;i<arr.length-k+1;i++){
//             boolean isValid = true;
//             for(int j=i;j<i+k-1;j++){
//                 if(arr[j+1] != arr[j] + 1 ){
//                     isValid = false;
//                     break;
//                 }
//             }
//             ans[i] = isValid ? arr[i+k-1] : -1;
//         }
//         return ans;
//     }
// }