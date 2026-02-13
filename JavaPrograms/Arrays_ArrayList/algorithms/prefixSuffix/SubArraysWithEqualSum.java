//QUES - find 2 subarrays from given array whose sum of numbers is equal.

package Arrays_ArrayList.algorithms.prefixSuffix;
import java.util.*;

public class SubArraysWithEqualSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        System.out.print("Enter an array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        
        equalSum(arr);
    }
    
    //------1st approach - time complexity - O(n2)------
    
//     static void equalSum(int[] arr){
//         for(int i=0;i<arr.length-1;i++){
//             int sum1 = 0;
//             int sum2 = 0;
            
//             for(int j=0;j<=i;j++){
//                 sum1 = arr[j] + sum1;
//             }
//             for(int k=i+1;k<arr.length;k++){
//                 sum2 = arr[k] + sum2;
//             }
            
//             if(sum1 == sum2){
//                 System.out.print("SubArray 1 is : ");
//                 System.out.println(Arrays.toString(Arrays.copyOfRange(arr,0 ,i+1)));
//                 System.out.print("SubArray 2 is : ");
//                 System.out.println(Arrays.toString(Arrays.copyOfRange(arr,i+1,arr.length)));
//                 System.out.println("Yes , Sum is : "+sum1);
//                 return;
//             }
//         }
//         System.out.println("No Subarrays found with equal sum.");
//     }

    //-----2nd approach - time complexity - O(n)----------

    static void equalSum(int[] arr){
        int totalSum = 0;
        int prefixSum = 0;
        for(int i=0;i<arr.length;i++){
            totalSum = arr[i] + totalSum;
        }
        // System.out.println("Total Sum : "+totalSum);
        
        for(int i=0;i<arr.length-1;i++){
            prefixSum = arr[i]+prefixSum;
            
            int suffixSum = totalSum - prefixSum;
            
            if(prefixSum == suffixSum){
                System.out.print("SubArray 1 is : ");
                System.out.println(Arrays.toString(Arrays.copyOfRange(arr,0,i+1)));
                System.out.print("SubArray 2 is : ");
                System.out.println(Arrays.toString(Arrays.copyOfRange(arr,i+1,arr.length)));
                System.out.println("Sum is : "+prefixSum);
                return;
            }
        }
        System.out.println("No SubArrays with equal sum found.");
    }
}    

//approach earlier I thought  that i will start finding prefix and suffix also at same time in loop condiiton but that will break as loop will run and will never find same point.
//FIRST APPROACH : but we can follow approach of spliting means we'll find sum from left and sum from right how? by split see [1 2 3 4 5 6], now see we'll keep i on 1 as split means 1 is on left and remaining further is on right and we'll iterate for complete from 0 to n-1 why bcos for last we can keep i as we are comparing left to right if we keep i on last index also then it will need something to compare to right also. now we'll use two conditions inside this loop, one will run to find left sum and second will run to find right sum and it will keep increasing themself till thwey find. 
//  TIME COMPLEXITY : o(n2).

//SECOND APPROACH : why we need this bcos in earlier time complexity is coming as n2 now that's not the best way, yes it's a good working way but we can also do like: think by yourself of taking total sum of array and then start taking sum from 1st index of array so if you subtract total - each index sum it will give you rest hlaf array sum right, so by then you can add a condition to compare prefixsum to subrtacted sum if equals means we found 2 subarrays right.
// TIME COMPLEXITY : o(n).

