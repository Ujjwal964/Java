//QUES - https://leetcode.com/problems/concatenation-of-array/

package Arrays_ArrayList.leetcode.assignments.easy;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class ArrayConcatenation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[4];
        System.out.print("Give an array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Given array : "+Arrays.toString(arr));
        System.out.println("Concat Array : "+Arrays.toString(concatArray(arr)));
    }

    static int[] concatArray(int[] arr){
        int[] ans = new int[arr.length * 2];

        for(int i=0;i<arr.length;i++){
            ans[i]=arr[i];
        }
        for(int i=arr.length;i<ans.length;i++){
            ans[i]=arr[i - arr.length];
        }
        return ans;
    }
}


// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int[] getConcatenation(int[] nums) {
//         int[] ans = new int[nums.length * 2];

//         for(int i=0;i<nums.length;i++){
//             ans[i] = nums[i];
//         }
//         for(int i=nums.length;i<ans.length;i++){
//             ans[i] = nums[i - nums.length];
//         }
//         return ans;
//     }
// }