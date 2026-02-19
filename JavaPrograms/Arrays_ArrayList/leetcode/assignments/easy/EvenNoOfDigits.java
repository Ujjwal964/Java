//QUES - https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

package Arrays_ArrayList.leetcode.assignments.easy;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class EvenNoOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];
        System.out.print("Enter array : ");
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Even digit numbers are : "+countEvenDigits(nums));
    }

    static int countEvenDigits(int[] nums){
        int even = 0;

        for(int i=0;i<nums.length;i++){
            int digit = 0;
            int n = nums[i];
            while(n>0){
                n = n / 10;
                digit++;
            }

            even += ( digit % 2 == 0 ) ? 1 : 0;
        }
        return even;
    }
}

//12,345,2,6,7896

// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int findNumbers(int[] nums) {
//         int even = 0;
        
//         for(int i=0;i<nums.length;i++){
//             int n = nums[i];
//             int digit = 0;
//             while(n>0){
//                 n = n / 10;
//                 digit++;
//             }

//             even += (digit % 2 == 0) ? 1 : 0;
//         }
//         return even;
//     }
// }