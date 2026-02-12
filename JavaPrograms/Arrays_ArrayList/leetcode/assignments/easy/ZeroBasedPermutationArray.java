// QUES - https://leetcode.com/problems/build-array-from-permutation/

package Arrays_ArrayList.leetcode.assignments.easy;
import java.util.*;
// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class ZeroBasedPermutationArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[6];

        System.out.print("Enter numbers : ");
        for(int i=0;i<num.length;i++){
            num[i] = sc.nextInt();
        }

        System.out.println("Given nums array : "+Arrays.toString(num));

        newArray(num);
    }

    static void newArray(int[] num){
        int[] ans = new int[num.length];

        for(int i=0;i<ans.length;i++){
            ans[i] = num[num[i]];
        }
        System.out.println("New Array : "+Arrays.toString(ans));
    }
}


// ----------------------------------------LEETCODE SOL-----------------------------------------
// class Solution {
//     public int[] buildArray(int[] nums) {
//         int[] ans = new int[nums.length];
//         for(int i=0;i<ans.length;i++){
//             ans[i]=nums[nums[i]];
//         }
//         return ans;
//     }
// }



// Zero Based Permutation means : an array from 0 to length-1 and it contains all integers till it's length
// and no duplicates means if size is 6 then num = [5,0,1,2,3,4]; most common question to make a new array from it 
// with formula newArray[i] = num[num[i]];