//QUES - https://leetcode.com/problems/shuffle-the-array/

package Arrays_ArrayList.leetcode.assignments.easy;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class ShuffleArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.print("Enter an array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Given array : "+Arrays.toString(arr));
        shuffle(arr);
    }

    static void shuffle(int[] arr){
        int n = arr.length / 2;

        System.out.println("Shuffled Array is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " "+arr[n+i]+" ");
        }
    }
}

// i    (n+i)
// 2 5 1 3 4 7
// 2 3 5 4 1 7


// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int[] shuffle(int[] nums, int n) {
//         int[] ans = new int[2 * n];
//         for(int i=0;i<n;i++){
//             ans[2 * i] = nums[i];
//             ans[2 * i+1]= nums[n+i];
//         }
//         return ans;
//     }
// }

// 1 2 3 4 5 6
// 1 4 2 5 3 6

