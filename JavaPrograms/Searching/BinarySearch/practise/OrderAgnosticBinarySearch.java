//QUES - When we only know array is sorted but dont know if in desc / asc.
//SOURCE - Kunal Kushwaha (https://youtu.be/f6UU7V3szVw?si=0uMmTHWOuNjw4Rpn)

package Searching.BinarySearch.practise;
import java.util.*;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        System.out.print("Enter array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = 99;
        OrderAgnosticBinarySearch obj = new OrderAgnosticBinarySearch();
        System.out.println(obj.agnosticBinarySearch(arr, target));
        sc.close();
    }

    int agnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (arr[end] > arr[start]) {
            while (end >= start) {
                int middle = start + (end - start) / 2;

                if (arr[middle] == target)
                    return middle;
                else if (arr[middle] < target)
                    start = middle + 1;
                else if (arr[middle] > target)
                    end = middle - 1;
            }
        }
        else{
            while(end >= start){
                int middle = start + (end - start) / 2;

                if(arr[middle] == target)
                    return middle;
                else if(arr[middle] > target)
                    start = middle + 1;
                else if(arr[middle] < target)
                    end = middle - 1;
            }
        }
        return -1;
    }
}

// input - ASC : [12, 23, 34, 45, 56, 67, 78, 89, 90]
// input - DESC : [99, 88, 77, 66, 55, 44, 33, 22, 11]