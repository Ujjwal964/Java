//QUES - https://leetcode.com/problems/two-sum/

package Arrays_ArrayList.algorithms.twoPointer;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------
//NAIVE APPROACH
// public class TwoSum {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int[] arr = {2,7,11,15,27};
//         int target = 22;

//         System.out.println("Given array : "+Arrays.toString(arr));
//         System.out.println("Index are : "+Arrays.toString(twoSum(arr , target)));
//     }

//     static int[] twoSum(int[] arr , int target){
//         int[] ans = new int[2];
    
//         for(int i=0;i<arr.length-1;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 int sum = arr[i] + arr[j];
//                 if(sum == target){
//                     ans[0] = i;
//                     ans[1] = j;
//                     return ans;
//                 }
//                 sum = 0;
//             }
//         }
//         return ans;
//     }   
// }


//         2       7     11        15
// -->increase              decrease<---- (only in sorted array when sorted order given)(TwoSum2 question)


//TWO POINTER APPROACH
public class TwoSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,4,6,18,25};
        int target = 10;

        System.out.println("Given array : "+Arrays.toString(arr));
        System.out.println("Index are : "+Arrays.toString(twoSum(arr , target)));
    }

    static int[] twoSum(int[] arr , int target){
        int[] ans = new int[2];
        int start = 0;
        int end = arr.length-1;

        while(end > start){
            int sum = 0;
            sum += arr[start] + arr[end];
            if(sum > target)                //sum is greater than target , decrease end.
                end--;
            else if(sum < target)           //sum is smaller than target , increase start.
                start++;
            else if(sum == target){
                ans[0] = start;
                ans[1] = end;
                break;
            }
        }
        return ans;
    }
}

// ----------------------------------------LEETCODE SOL-----------------------------------------
