//QUES - https://leetcode.com/problems/two-sum/
//SOURCE - CTO Bhaiya (https://youtu.be/SP065oLnxGA?si=fO4xGHood241ICHg)
package Arrays_ArrayList.algorithms.twoPointer;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------
//BRUTE FORCE APPROACH

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
// for sorted array , if not sorted then first sort then use two pointer.
public class TwoSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,2,4};
        int target = 6;

        System.out.println("Given array : "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array : "+Arrays.toString(arr));
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


//MAIN APPROACH USING MAP
//refer to leetcode sol.


// ----------------------------------------LEETCODE SOL-----------------------------------------
//MAIN APPROACH USING MAP

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         HashMap<Integer , Integer> map = new HashMap<>();

//         for(int i=0;i<nums.length;i++){
//             int lookingFor = target - nums[i];
//             if(map.containsKey(lookingFor)){
//                 return new int[]{map.get(lookingFor) , i};
//             }
            
//             map.put(nums[i] , i);
//         }
//         return new int[]{-1,-1};
//     }
// }