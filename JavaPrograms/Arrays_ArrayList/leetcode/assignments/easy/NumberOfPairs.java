//QUES - https://leetcode.com/problems/number-of-good-pairs/

package Arrays_ArrayList.leetcode.assignments.easy;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class NumberOfPairs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        System.out.print("Enter an array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("No. of good pairs : "+goodPairs(arr));
    }

    static int goodPairs(int[] arr){
        int good = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                good += (arr[i] == arr[j]) ? 1 : 0;
            }
        }
        return good;
    }
}

// 1 2 3 1 1 3
// i j



// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int numIdenticalPairs(int[] nums) {
//         int good = 0;
//         for(int i=0;i<nums.length-1;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 good += (nums[i] == nums[j]) ? 1 : 0;
//             }
//         }
//         return good;
//     }
// }