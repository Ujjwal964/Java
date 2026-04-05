//QUES - https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

package Arrays_ArrayList.leetcode.assignments.medium;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class FirstAndLastPosSortedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[1];
        System.out.print("Enter array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target value : ");
        int target = sc.nextInt();
        System.out.println(Arrays.toString(findFirstAndLastPosition(arr , target)));
    }


    //BETTER APPROACH (T.C - O(N) | S.C - O(1)) (SELF)✅
    // static int[] findFirstAndLastPosition(int[] arr , int target){
    //     int startIndex = -1;
    //     int endIndex = -1;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i] == target){
    //             startIndex = i;
    //             break;
    //         }
    //     }
    //     for(int i=arr.length-1;i>=0;i--){
    //         if(arr[i] == target){
    //             endIndex = i;
    //             break;
    //         }
    //     }
    //     return new int[]{startIndex , endIndex};
    // }


    //SIMILAR APPROACH.(OPTIMAL WILL BE USING BINARY SEARCH (O(logN)) (NOT DOING CURRENTLY) )
    static int[] findFirstAndLastPosition(int[] arr , int target){
        int startIndex = -1;
        int endIndex = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                if(startIndex == -1)
                    startIndex = i;

                endIndex = i;
            }
        }
        return new int[]{startIndex , endIndex};
    }
}

//input - [5,7,7,8,8,10], target = 8
//output - [3,4]


// ----------------------------------------LEETCODE SOL-----------------------------------------

//BETTER APPROACH (T.C - O(N) | S.C - O(1)) (SELF)✅
// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int startIndex = -1;
//         int endIndex = -1;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i] == target){
//                 startIndex = i;
//                 break;
//             }
//         }
//         for(int i=nums.length-1;i>=0;i--){
//             if(nums[i] == target){
//                 endIndex = i;
//                 break;
//             }
//         }
//         return new int[]{startIndex , endIndex};
//     }
// }