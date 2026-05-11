//QUES - Binary Search : searching for element by dividing array using two pointer and middle then check if we need to move/check in right or left.
//SOURCE - Kunal Kushwaha (https://youtu.be/f6UU7V3szVw?si=0uMmTHWOuNjw4Rpn)

package Searching.BinarySearch.practise;
import java.util.*;

public class BinarySearchBasics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        System.out.print("Enter array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int target = 99;
        BinarySearchBasics obj = new BinarySearchBasics();
        System.out.println(obj.binarySearch(arr , target));
        sc.close();
    }

    int binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while(end >= start){
            int middle = start + (end - start) / 2;

            if(arr[middle] == target)
                return middle;
            else if(arr[middle] < target)
                start = middle + 1;
            else if(arr[middle] > target)
                end = middle - 1;
        }
        return -1;
    }
}

//input - [12, 23, 34, 45, 56, 67, 78, 89, 99]
