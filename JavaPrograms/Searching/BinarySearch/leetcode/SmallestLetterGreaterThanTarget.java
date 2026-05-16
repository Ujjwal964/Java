//QUES - Smallest letter greater than target (similar to ceiling of a number)(https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/)
//SOURCE - https://youtu.be/W9QJ8HaRvJQ?si=M02gHdFkIdGtJQBZ

package Searching.BinarySearch.leetcode;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[3];
        System.out.print("Enter char array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.next().charAt(0);
        }
        char target = 'c';
        SmallestLetterGreaterThanTarget obj = new SmallestLetterGreaterThanTarget();
        System.out.println(obj.findSmallestLetterGreaterThanTarget(arr , target));
    }

    char findSmallestLetterGreaterThanTarget(char[] arr , char target){
        int start = 0;
        int end = arr.length-1;

        if(target >= arr[end])
            return arr[0];

        while(end >= start){
            int middle = start + (end - start)/2;

            if(arr[middle] == target)
                start = middle+1;               //only diff in this vs ceiling of no
            else if(arr[middle] < target)
                start = middle + 1;
            else if(arr[middle] > target)
                end = middle - 1;
        }
        return arr[start];
    }
    
}

//input - ["c","f","j"], target = "a"
//output - 'c'

//input - ["c","f","j"], target = "j"
//output - 'c'

//                                  s
//                              e
//                                  m
//input - ["e","e","e","e","e","e","n","n","n","n"] , target - 'e'
//output - 'n'



// ------------------------------------------LEETCODE SOL---------------------------------------------
// class Solution {
//     public char nextGreatestLetter(char[] arr, char target) {
//         int start = 0;
//         int end = arr.length-1;

//         if(target >= arr[end])
//             return arr[0];

//         while(end >= start){
//             int middle = start + (end - start)/2;

//             if(arr[middle] == target)
//                 start = middle + 1;
//             else if(arr[middle] < target)
//                 start = middle + 1;
//             else if(arr[middle] > target)
//                 end = middle - 1;
//         }
//         return arr[start];
//     }
// }