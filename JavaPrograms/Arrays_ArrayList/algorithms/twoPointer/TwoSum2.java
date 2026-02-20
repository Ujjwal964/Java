//QUES - https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
// find sum of 2 number of array which are equal to target. Diff in TwoSum2 and TwoSum is here in 
//TwoSum2 array given to us is in sorted order.

package Arrays_ArrayList.algorithms.twoPointer;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------
//TWO POINTER APPROACH
public class TwoSum2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[2];
        System.out.print("Enter Array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Target value : ");
        int target = sc.nextInt();

        System.out.println("Output Array : "+Arrays.toString(twoSum2(arr , target)));
    }

    static int[] twoSum2(int[] arr , int target){
        int[] ans = new int[2];
        int start = 0;
        int end = arr.length-1;

        while(end>start){
            int sum = 0;
            sum = arr[start] + arr[end];
            if(sum > target)
                end--;
            else if(sum < target)
                start++;
            else{
                ans[0] = start+1;
                ans[1] = end+1;
                break;
            }
        }
        return ans;
    }  
}

// input - 2 7 11 15 , target = 9
// output (follow 1 indexing) - [1,2]




// ----------------------------------------LEETCODE SOL-----------------------------------------
//TWO POINTER APPROACH

// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int[] ans = new int[2];
//         int start = 0;
//         int end = numbers.length-1;

//         while(end > start){
//             int sum = 0;
//             sum = numbers[start] + numbers[end];
//             if(sum > target)
//                 end--;
//             else if(sum < target)
//                 start++;
//             else{
//                 ans[0] = start + 1;
//                 ans[1] = end + 1;
//                 break;

//             } 
//         }
//         return ans;
//     }
// }