//QUES - https://leetcode.com/problems/find-peak-element/description/
//SOURCE - Kunal Kushwaha (https://youtu.be/W9QJ8HaRvJQ?si=4XETW5yIDYerapRr)
//Exactly same as Peak Index in Mountain array question (copy paste sol)

package Searching.BinarySearch.leetcode;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class FindPeakElement {
    public static void main(String[] args){
        int[] arr = new int[]{1,2,1,3,5,6,4};
        FindPeakElement obj = new FindPeakElement();
        System.out.println(obj.findPeak(arr));
    }

    int findPeak(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(end > start){
            int middle = start + (end - start)/2;

            if(arr[middle] > arr[middle+1])
                end = middle;
            else if(arr[middle] < arr[middle+1])
                start = middle + 1;
        }
        return start;
    }
}


//                   s
//                   e
//                 m
//input - [1,2,1,3,5,6,4]
//output - 5 (return any peak).


// ------------------------------------------LEETCODE SOL---------------------------------------------

// class Solution {
//     public int findPeakElement(int[] arr) {
//         int start = 0;
//         int end = arr.length-1;

//         while(start < end){
//             int middle = start + (end - start)/2;

//             if(arr[middle] > arr[middle + 1])           //means we are in decreasing slope
//                 end = middle;
//             else if(arr[middle] < arr[middle + 1])      //means we are in increasing slope
//                 start = middle+1;
//         }
//         return start;
//     }
// }