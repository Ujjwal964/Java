//QUES - https://leetcode.com/problems/sort-an-array/description/

package Arrays_ArrayList.algorithms.twoPointer;
import java.util.*;

public class SortArrayAscending {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.print("Enter array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Ascending Array : "+Arrays.toString(ascendingOrder(arr)));
    }

    static int[] ascendingOrder(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(end > start){
            if(arr[start] < arr[end]){
                start++;
                end--;
            }
            else if(arr[start] > arr[end]){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        return arr;
    }
}

//input - 5 2 3 1 /or/ 5 1 1 2 0 0
//output - 1 2 3 5 /or/ 0 0 1 1 2 5