//QUES - https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/2004524454/
//SOURCe - Kunal Kushwaha (https://youtu.be/W9QJ8HaRvJQ?si=M7P4FbDZ5gncUPeX)

package Searching.BinarySearch.leetcode;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class PeakIndexInMountain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        System.out.print("Enter array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        PeakIndexInMountain obj = new PeakIndexInMountain();
        System.out.println(obj.findPeak(arr));
    }

    //BRUTE FORCE
    // int findPeak(int[] arr){
    //     int max = 0;
    //     for(int i=0;i<arr.length;i++){
    //         max = arr[i] > arr[max] ? i : max;
    //     }
    //     return max;
    // }

    //OPTIMAL BINARY APPROACH
    int findPeak(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int middle = start + (end - start)/2;

            if(arr[middle] > arr[middle + 1])           //means we are in decreasing slope
                end = middle;
            else if(arr[middle] < arr[middle + 1])      //means we are in increasing slope
                start = middle+1;
        }
        return start; //we can return any either start or end, bcoz at end both will be pointing to same largest element only as per condition checks.
    }
}

//input - [0,1,0]
//output - 1

//input - [0,10,5,2]
//output - 1

//               s
//                   e
//                 m
//input - [1,2,3,5,6,4,3,2]
//output - 1


// ------------------------------------------LEETCODE SOL---------------------------------------------

//BRUTE FORCE
// class Solution {
//     public int peakIndexInMountainArray(int[] arr) {
//         int max = 0;
//         for(int i=0;i<arr.length;i++){
//             max = arr[i] > arr[max] ? i : max;
//         }
//         return max;
//     }
// }


//BETTER BINARY SEARCH APPROACH (SELF)✅
// class Solution {
//     public int peakIndexInMountainArray(int[] arr) {
//         int start = 0;
//         int end = arr.length-1;

//         while(start <= end){
//             int middle = start + (end - start)/2;
//             if(arr[middle] > arr[middle + 1] && arr[middle] > arr[middle - 1])
//                 return middle;

//             if(arr[middle] > arr[middle + 1])
//                 end = middle;
//             else if(arr[middle] < arr[middle + 1])
//                 start = middle;
//         }
//         return -1;
        
//     }
// }


//OPTIMAL BINARY SEARCH APPROACH
// class Solution {
//     public int peakIndexInMountainArray(int[] arr) {
//         int start = 0;
//         int end = arr.length-1;

//         while(start < end){
//             int middle = start + (end - start)/2;

//             if(arr[middle] > arr[middle + 1])
//                 end = middle;
//             else if(arr[middle] < arr[middle + 1])
//                 start = middle+1;
//         }
//         return start;        
//     }
// }