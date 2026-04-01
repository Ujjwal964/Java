//QUES - https://leetcode.com/problems/maximum-product-subarray/description/
//SOURCE - Nikhil Lohia () / Striver ()

package Arrays_ArrayList.algorithms.kadaneAlgo;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class MaximumProductSubArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter array : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println(findMaxProdSubArray(arr));
    }
    
    //BRUTE FORCE APPROACH (O(N2))
    // static int findMaxProdSubArray(int[] arr){
    //     int max = Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         int prefixMulitple = 1;
    //         for(int j=i;j<arr.length;j++){
    //             prefixMulitple *= arr[j]; 
    //             max = Math.max(max , prefixMulitple);
    //         }
    //     }
    //     return max;
    // }

    //KADANE's ALGO - we can't use it directly means we need to use it's trick but not complete here,
    // since here we have some conditions like lets say all +ve no / even -ve no / odd -ve no
    //so for this we have diff result on both side lets say middle we have -ve no so from left to that middle
    //gives diff prod result and same from middle to right gives different. 
    //SO THIS PROBLEM MAJORLY BECOMES PREFIX - SUFFIX ALGO.
    //we will calculate both prefixProd and suffixProd and compare max from both and our final max is ans.
    //For condition if array have no - 0 , then we use KADANE ALGO trick to convert prod to 1 if == 0.
    
    //PREFIX-SUFFIX + KADANE ALGO (O(N))
    static int findMaxProdSubArray(int[] arr){
        int max = Integer.MIN_VALUE;
        int prefixMultiple = 1;
        int suffixMultiple = 1;
        
        for(int i=0;i<arr.length;i++){
            prefixMultiple = arr[i] * prefixMultiple;                       //PREFIX
            suffixMultiple = arr[arr.length - 1 - i] * suffixMultiple;      //SUFFIX
            
            max = Math.max(max , Math.max(prefixMultiple , suffixMultiple));
            
            if(prefixMultiple == 0)
                prefixMultiple = 1;                                         //KADANE ALGO TRICK   

            if(suffixMultiple == 0)
                suffixMultiple = 1;
        }
        return max;
    }
}

//                i
//input - [2 3 -2 4]
//output - 6 ( since [2 3] gives 6 which is max).

//input - [-3 -1 -1]
//output - 3 (as [-3 -1] gives 3).

//input - [1,0,-1,2,3,-5,-2]
//output - 60


// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int maxProduct(int[] arr) {
//         int max = Integer.MIN_VALUE;
//         int prefixMultiple = 1;
//         int suffixMultiple = 1;
        
//         for(int i=0;i<arr.length;i++){
//             prefixMultiple = arr[i] * prefixMultiple;                       //PREFIX
//             suffixMultiple = arr[arr.length - 1 - i] * suffixMultiple;      //SUFFIX

//             max = Math.max(max , Math.max(prefixMultiple , suffixMultiple));
            
//             if(prefixMultiple == 0)
//                 prefixMultiple = 1;                                         //KADANE ALGO TRICK   
            
//             if(suffixMultiple == 0)
//                 suffixMultiple = 1;
//         }
//         return max;
//     }
// }