//QUES - https://leetcode.com/problems/product-of-array-except-self/
//SOURCE - https://youtu.be/0TIUlVdvVJo?si=6ZgOOpSZPObEGtFv

package Arrays_ArrayList.leetcode.assignments.medium;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class ArrayProdExceptSelf {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        System.out.print("Enter array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(giveProductArray(arr)));
    }

    //BRUTE FORCE (T.C - O(N2) | S.C - O(1)) (SELF) - (TLE as n<=10^5)❌
    // static int[] giveProductArray(int[] arr){
    //     int[] ans = new int[arr.length];

    //     for(int i=0;i<arr.length;i++){
    //         int product = 1;
    //         for(int j=0;j<arr.length;j++){
    //             if(j == i)
    //                 continue;
    //             else
    //                 product = product * arr[j];
    //         }
    //         ans[i] = product;
    //     }
    //     return ans;
    // }


    //BETTER APPROACH (T.C - O(N) | S.C - O(N)) (SELF WORKING)✅
    //PREFIX - SUFFIX
    static int[] giveProductArray(int[] arr){
        int[] ans = new int[arr.length];
        int[] prefixArr = new int[arr.length];
        int[] suffixArr = new int[arr.length];
        prefixArr[0] = arr[0];
        suffixArr[arr.length-1] = arr[arr.length-1];

        for(int i=1;i<arr.length;i++){
            prefixArr[i] = prefixArr[i-1] * arr[i];
        }
        for(int i=arr.length-2;i>=0;i--){
            suffixArr[i] = suffixArr[i+1] * arr[i];
        }

        for(int i=0;i<arr.length;i++){
            if(i == 0)
                ans[i] = suffixArr[i+1];
            else if(i == arr.length - 1)
                ans[i] = prefixArr[i-1];
            else    
                ans[i] = prefixArr[i-1] * suffixArr[i+1];
        }
        return ans;
    }


    //OPTIMAL APPROACH (T.C - O(N) | S.C - O(1))✅
    // static int[] giveProductArray(int[] arr){
    //     int n = arr.length;
    //     int[] ans = new int[n];
    //     int prefixMultipleBeforeCurrent = 1;        //can say putting prefixmultiple in ans array.
    //     int suffixMultipleAfterCurrent = 1;         //can say last multiplying suffixmultiple in ans array.

    //     for(int i=0;i<n;i++){
    //         ans[i] = prefixMultipleBeforeCurrent;   //example if input - [1,2,3,4] then -> becomes[1,1,2,6]
    //         prefixMultipleBeforeCurrent = prefixMultipleBeforeCurrent * arr[i];
    //     }
    //     for(int i=n-1;i>=0;i--){
    //         ans[i] = ans[i] * suffixMultipleAfterCurrent; //example then -> becomes[24,12,8,6]
    //         suffixMultipleAfterCurrent = suffixMultipleAfterCurrent * arr[i];
    //     }
    //     return ans;
    // }

}

//input - [1 2 3 4]
//output - [24 12 8 6] (prod of all elements except self).
//prefixMutliple - 1 2 6 24
//suffixMultiple - 24 24 12 4

//input - [-1,1,0,-3,3]
//output - [0,0,9,0,0]
//prefixMultiple - -1 -1 0 0 0
//suffixMultiple - 0 0 0 -9 3



// ----------------------------------------LEETCODE SOL-----------------------------------------

//BETTER APPROACH (T.C - O(N) | S.C - O(N)) (SELF WORKING)✅
//PREFIX - SUFFIX
// class Solution {
//     public int[] productExceptSelf(int[] arr) {
//         int[] ans = new int[arr.length];
//         int[] prefixArr = new int[arr.length];
//         int[] suffixArr = new int[arr.length];
//         prefixArr[0] = arr[0];
//         suffixArr[arr.length-1] = arr[arr.length-1];

//         for(int i=1;i<arr.length;i++){
//             prefixArr[i] = prefixArr[i-1] * arr[i];
//         }
//         for(int i=arr.length-2;i>=0;i--){
//             suffixArr[i] = suffixArr[i+1] * arr[i];
//         }
        
//         for(int i=0;i<arr.length;i++){
//             if(i == 0)
//                 ans[i] = suffixArr[i+1];
//             else if(i == arr.length - 1)
//                 ans[i] = prefixArr[i-1];
//             else    
//                 ans[i] = prefixArr[i-1] * suffixArr[i+1];
//         }
//         return ans;
//     }
// }


// -------------------------------------------

//OPTIMAL APPROACH (T.C - O(N) | S.C - O(1))✅
// class Solution {
//     public int[] productExceptSelf(int[] arr) {
//         int n = arr.length;
//         int[] ans = new int[n];
//         int prefixMultipleBeforeCurrent = 1;
//         int suffixMultipleAfterCurrent = 1;

//         for(int i=0;i<n;i++){
//             ans[i] = prefixMultipleBeforeCurrent;
//             prefixMultipleBeforeCurrent = prefixMultipleBeforeCurrent * arr[i];
//         }
//         for(int i=n-1;i>=0;i--){
//             ans[i] = ans[i] * suffixMultipleAfterCurrent;
//             suffixMultipleAfterCurrent = suffixMultipleAfterCurrent * arr[i];
//         }
//         return ans;
//     }
// }