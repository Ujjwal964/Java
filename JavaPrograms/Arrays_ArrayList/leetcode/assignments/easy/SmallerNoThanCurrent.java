//QUES - https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

package Arrays_ArrayList.leetcode.assignments.easy;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class SmallerNoThanCurrent {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];

        System.out.print("Enter an array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Output array is : "+Arrays.toString(smallerThanCurrent(arr)));
    }

    static int[] smallerThanCurrent(int[] arr){
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int min = 0;
            for(int j=0;j<arr.length;j++){
                min += (arr[i] > arr[j] && j != i) ? 1 : 0;
            }
            ans[i] = min;
        }
        return ans;
    }
}





// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int[] smallerNumbersThanCurrent(int[] nums) {
//         int[] ans = new int[nums.length];
//         for(int i=0;i<nums.length;i++){
//             int min = 0;
//             for(int j=0;j<nums.length;j++){
//                 min += (nums[i] > nums[j] && j != i) ? 1 : 0;
//             }
//             ans[i] = min;
//         }
//         return ans;
//     }
// }