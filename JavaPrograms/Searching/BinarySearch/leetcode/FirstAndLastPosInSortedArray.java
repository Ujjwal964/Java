//QUES - https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
//SOURCE - Kunal Kushwaha (https://youtu.be/W9QJ8HaRvJQ?si=Q-PrXnSg-nWZ6kvb)

package Searching.BinarySearch.leetcode;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class FirstAndLastPosInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.print("Enter array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = 8;
        System.out.println(Arrays.toString(findFirstAndLastPosition(arr, target)));
    }

    // BRUTE FORCE
    // static int[] findFirstAndLastPosition(int[] arr, int target) {
    //     int a = -1;
    //     int b = -1;
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] == target) {
    //             a = i;
    //             break;
    //         }
    //     }
    //     for (int i = arr.length - 1; i >= 0; i--) {
    //         if (arr[i] == target) {
    //             b = i;
    //             break;
    //         }
    //     }
    //     return new int[] { a, b };
    // }


    // OPTIMAL APPROACH USING BINARY SEARCH
    static int[] findFirstAndLastPosition(int[] arr , int target){
        int a = -1;
        int start = 0;
        int end = arr.length-1;

        //first occurence
        while(end>=start){
            int middle = start + (end-start)/2;

            if(arr[middle] < target)
                start = middle + 1;
            else if(arr[middle] > target)
                end = middle - 1;
            else{
                a = middle;
                end = middle - 1;
            }
        }

        //last occurence
        int b = -1;
        start = 0;
        end = arr.length-1;
        while(end >= start){
            int middle = start + (end-start)/2;

            if(arr[middle] < target)
                start = middle + 1;
            else if(arr[middle] > target)
                end = middle - 1;
            else{
                b = middle;
                start = middle + 1;
            }
        }
        return new int[]{a,b};
    }
}

//                               s
//                           e
//                               m
// input - [ 5 , 7 , 8 , 8 , 8 , 10 ], target = 8
// output - [3,4]



// ------------------------------------------LEETCODE SOL---------------------------------------------

// BRUTE FORCE
// class Solution {
//     public int[] searchRange(int[] arr, int target) {
//         int a = -1;
//         int b = -1;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 a = i;
//                 break;
//             }
//         }
//         for (int i = arr.length - 1; i >= 0; i--) {
//             if (arr[i] == target) {
//                 b = i;
//                 break;
//             }
//         }
//         return new int[] { a, b };
//     }
// }


// ANOTHER BETTER APPROACH
// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int startIndex = -1;
//         int endIndex = -1;
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == target) {
//                 if (startIndex == -1)
//                     startIndex = i;

//                 endIndex = i;
//             }
//         }
//         return new int[] { startIndex, endIndex };
//     }
// }


//OPTIMAL BINARY SEARCH APPROACH (applying binary search two times)
// class Solution {
//     public int[] searchRange(int[] arr, int target) {
//         int a = -1;
//         int start = 0;
//         int end = arr.length-1;

//         while(end>=start){
//             int middle = start + (end-start)/2;
//             if(arr[middle] < target)
//                 start = middle + 1;
//             else if(arr[middle] > target)
//                 end = middle - 1;
//             else{
//                 a = middle;
//                 end = middle - 1;
//             }
//         }

//         int b = -1;
//         start = 0;
//         end = arr.length-1;
//         while(end >= start){
//             int middle = start + (end-start)/2;
//             if(arr[middle] < target)
//                 start = middle + 1;
//             else if(arr[middle] > target)
//                 end = middle - 1;
//             else{
//                 b = middle;
//                 start = middle + 1;
//             }
//         }
//         return new int[]{a,b};
//     }
// }