//QUES - given an array for numbers from -n to n , order sqaure of these number in non decreasing order.(INPUT ARRAY IS ALSO NON DECRESING)
//source - COLLEGE WALLAH (https://youtu.be/FmXF2df9OVo?si=KVxkeGeuD2QhMTIr)
//non decreasing means next number in array is greater than earlier one and next can be same as earlier also
// like : 1 2 3 4 /or/ 1 2 2 3 4 (but not 1 2 4 3).
// QUES - https://leetcode.com/problems/squares-of-a-sorted-array/description/

package Arrays_ArrayList.algorithms.twoPointer;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class OrderSquareNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.print("Enter array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Ordered Array : "+Arrays.toString(squareOrder(arr)));
    }

    static int[] squareOrder(int[] arr){
        int[] ans = new int[arr.length];
        int start = 0;
        int end = arr.length - 1;
        int k = ans.length - 1;

        while(end >= start){
            if(Math.abs(arr[start]) > Math.abs(arr[end])){
                ans[k--] = arr[start] * arr[start];
                start++;
            }
            else{
                ans[k--] = arr[end] * arr[end];
                end--;
            }
        }
        return ans;
    }
}
        //start         //end
//input -> -10 -3 -2 1 4 5
//output -> 1 4 9 16 25 100


// ----------------------------------------LEETCODE SOL-----------------------------------------
// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         int[] ans = new int[nums.length];
//         int start = 0;
//         int end = nums.length-1;
//         int k = ans.length-1;

//         while(end>=start){
//             if(Math.abs(nums[start]) > Math.abs(nums[end])){
//                 ans[k--] = nums[start] * nums[start];
//                 start++;
//             }
//             else{
//                 ans[k--] = nums[end] * nums[end];
//                 end--;
//             }
//         }
//         return ans;
//     }
// }