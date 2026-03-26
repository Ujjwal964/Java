//QUES - https://leetcode.com/problems/maximum-subarray-with-equal-products/description/?envType=problem-list-v2&envId=sliding-window

package Arrays_ArrayList.algorithms.slidingWindow;
import java.util.*;

public class MaxSubArrayWithEqualProducts {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        findSubArrayWithEqualProducts(arr);
    }

    static int findSubArrayWithEqualProducts(int[] arr){
        int i = 0;
        int j = 0;
        int max = 0;
        
    }
    
}

//input - [1,2,1,2,1,1,1]
//output - 5 (as longest product equivalent subarray is [1, 2, 1, 1, 1], 
// where prod([1, 2, 1, 1, 1]) = 2, gcd([1, 2, 1, 1, 1]) = 1, and lcm([1, 2, 1, 1, 1]) = 2.)