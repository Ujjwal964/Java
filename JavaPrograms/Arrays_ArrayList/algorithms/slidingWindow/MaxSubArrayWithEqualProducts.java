//QUES - hhttps://leetcode.com/problems/maximum-subarray-with-equal-products/description/?envType=problem-list-v2&envId=sliding-window
package Arrays_ArrayList.algorithms.slidingWindow;
import java.util.*;
// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class MaxSubArrayWithEqualProducts{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        System.out.print("Enter array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println(findSubArrayWithEqualProducts(arr));
    }
    
    static int findSubArrayWithEqualProducts(int[] arr){
        int max = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        
        for(int i =0;i<arr.length;i++){
            int prod = 1;
            int lcm = 1;
            int gcd = 0;
            for(int j=i;j<arr.length;j++){
                prod = arr[j] * prod;
                gcd = gcd(gcd , arr[j]);
                lcm = lcm(lcm , arr[j]);
                
                // if(prod == lcm * gcd){
                //     max = Math.max(max , (j-i+1));
                //     // System.out.println(Arrays.toString(Arrays.copyOfRange(arr , i , j+1)));
                // }
                
                //OR
                // if(prod == lcm * gcd){
                //     if((j-i+1) > max){
                //         max = j-i+1;
                //         start = i;
                //         end = j;
                //     }
                // }
            }
        }
        // System.out.println(Arrays.toString(Arrays.copyOfRange(arr , start , end+1)));
        return max;
    }
    
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return (a / gcd((int)a, (int)b)) * b;
    }
}

//         i
//         j
//input - [1 , 2  , 1 , 2 , 1 , 1 , 1]
//output - 5 (as longest product equivalent subarray is [1, 2, 1, 1, 1], 
// where prod([1, 2, 1, 1, 1]) = 2, gcd([1, 2, 1, 1, 1]) = 1, and lcm([1, 2, 1, 1, 1]) = 2.)


// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int maxLength(int[] arr) {
//         int max = Integer.MIN_VALUE;
        
//         for(int i =0;i<arr.length;i++){
//             int prod = 1;
//             int lcm = 1;
//             int gcd = 0;
//             for(int j=i;j<arr.length;j++){
//                 prod = arr[j] * prod;
//                 gcd = gcd(gcd , arr[j]);
//                 lcm = lcm(lcm , arr[j]);
                
//                 if(prod == lcm * gcd)
//                     max = Math.max(max , (j-i+1));
//             }
//         }
//         return max;
//     }

//     static int gcd(int a, int b) {
//         return b == 0 ? a : gcd(b, a % b);
//     }

//     static int lcm(int a, int b) {
//         return (a / gcd((int)a, (int)b)) * b;
//     }
// }