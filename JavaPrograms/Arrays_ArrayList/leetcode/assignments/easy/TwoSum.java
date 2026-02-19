//QUEs - https://leetcode.com/problems/two-sum/

package Arrays_ArrayList.leetcode.assignments.easy;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------
//BRUTE FORCE WAY - 
public class TwoSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[4];
        System.out.print("Enter array : ");
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter target value : ");
        int t = sc.nextInt();
        
        System.out.println(Arrays.toString(findTwoSum(nums , t)));
    }
    
    static int[] findTwoSum(int[] nums , int t){
        int[] ans = new int[2];
    
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int sum = 0;
                sum = nums[i]+nums[j];
                if(sum == t){
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        return ans;
    }
}

//2 7 11 5 / 3 2 3
//target - 9 / 6
// output - [0,1]


// ----------------------------------------LEETCODE SOL-----------------------------------------
// BRUTE FORCE WAY [ O(N2) complexity ].

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int[] ans = new int[2];
//         for(int i=0;i<nums.length-1;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 int sum = 0;
//                 sum = nums[i] + nums[j];
//                 if(sum == target){
//                     ans[0] = i;
//                     ans[1] = j;
//                     break;
//                 }
//             }
//         }
//         return ans;
//     }
// }