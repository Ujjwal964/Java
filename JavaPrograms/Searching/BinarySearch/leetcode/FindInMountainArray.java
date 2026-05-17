//QUES - https://leetcode.com/problems/find-in-mountain-array/description/
//SOURCE - Kunal Kushwaha (https://youtu.be/W9QJ8HaRvJQ?si=4XETW5yIDYerapRr)
//Exactly similar to leetcode find peak element and peak index in mountain array ques (just little change needed)

package Searching.BinarySearch.leetcode;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class FindInMountainArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.print("Enter array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target value : ");
        int target = sc.nextInt();
        FindInMountainArray obj = new FindInMountainArray();
        System.out.println(obj.findInMountain(arr , target));
    }    

    int findInMountain(int[] arr , int target){
        int ans = -1;

        if(arr.length < 3)
            return -1;

        //find peak element first
        int start = 0;
        int end = arr.length-1;
        while(end > start){
            int middle = start + (end - start)/2;
            if(arr[middle] > arr[middle+1])
                end = middle;
            else if(arr[middle] < arr[middle+1])
                start = middle + 1;
        }
        int peakElementIndex = start;

        ans = orderAgnosticBinarySearch(arr, target, 0, peakElementIndex); //search in asc order
        
        return (ans == -1) ? orderAgnosticBinarySearch(arr, target, peakElementIndex + 1, arr.length-1) : ans;
    }

    static int orderAgnosticBinarySearch(int[] arr, int target , int start , int end){
        if(arr[start] < arr[end]){                      //asc order
            while(end >= start){
                int middle = start + (end - start)/2;
                if(arr[middle] == target)
                    return middle;
                else if(arr[middle] > target)
                    end = middle - 1;
                else if(arr[middle] < target)
                    start = middle + 1;
            }
        }
        else if(arr[start] > arr[end]){                 //desc order
            while(end >= start){
                int middle = start + (end - start)/2;
                if(arr[middle] == target)
                    return middle;
                else if(arr[middle] > target)
                    start = middle + 1;
                else if(arr[middle] < target)
                    end = middle - 1;
            }
        }
        else if(arr[start] == arr[end]){
            if(arr[start] == target)
                return start;
        }
        return -1;
    }
}

//         s
//                     e
//               m
//input - [1,2,3,4,5,3,1], target = 3
//output - 2 (3 exist at 2 and 5, return min index value)


//             s
//               e
//             m
//input - [0,5,3,1] , target = 1;
//output - 3


//             s
//             e
//             m
//input - [1,5,2] , target = 2;
//output - 2




// ------------------------------------------LEETCODE SOL---------------------------------------------

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
// class Solution {
//     public int findInMountainArray(int target, MountainArray arr) {
//         int ans = -1;

//         if(arr.length() < 3)
//             return -1;

//         //find peak element first
//         int start = 0;
//         int end = arr.length()-1;
//         while(end > start){
//             int middle = start + (end - start)/2;
//             if(arr.get(middle) > arr.get(middle+1))
//                 end = middle;
//             else if(arr.get(middle) < arr.get(middle+1))
//                 start = middle + 1;
//         }
//         int peakElementIndex = start;

//         ans = orderAgnosticBinarySearch(arr, target, 0, peakElementIndex);
        
//         return (ans == -1) ? orderAgnosticBinarySearch(arr, target, peakElementIndex + 1, arr.length()-1) : ans;
//     }

//     static int orderAgnosticBinarySearch(MountainArray arr, int target , int start , int end){
//         if(arr.get(start) < arr.get(end)){                      //asc order
//             while(end >= start){
//                 int middle = start + (end - start)/2;
//                 int middleElement = arr.get(middle);
//                 if(middleElement == target)
//                     return middle;
//                 else if(middleElement > target)
//                     end = middle - 1;
//                 else if(middleElement < target)
//                     start = middle + 1;
//             }
//         }
//         else if(arr.get(start) > arr.get(end)){                 //desc order
//             while(end >= start){
//                 int middle = start + (end - start)/2;
//                 int middleElement = arr.get(middle);
//                 if(middleElement == target)
//                     return middle;
//                 else if(middleElement > target)
//                     start = middle + 1;
//                 else if(middleElement < target)
//                     end = middle - 1;
//             }
//         }
//         else if(arr.get(start) == arr.get(end)){
//             if(arr.get(start) == target)
//                 return start;
//         }
//         return -1;
//     }
// }