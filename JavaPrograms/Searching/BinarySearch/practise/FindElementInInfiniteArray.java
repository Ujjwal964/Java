//QUES - Array is infinite we dont know size so can't do arr.length. Find the element in infinite sorted array.
//SOURCE - Kunal Kushwaha (https://youtu.be/W9QJ8HaRvJQ?si=Ckg6pfENIpEI0An6)
//ASKED IN AMAZON INTERVIEW

package Searching.BinarySearch.practise;
import java.util.*;

public class FindElementInInfiniteArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,4,6,8,10,11,15,17,18,20,23,25,27,29,31,36,38,39};
        int target = 15;
        FindElementInInfiniteArray obj = new FindElementInInfiniteArray();
        System.out.println(obj.findElement(arr , target));
    }

    int findElement(int[] arr , int target){
        int start = 0;
        int end = 2;

        //check target lies in selected chunk or not
        while(target > arr[end]){
            int newStart = end + 1;
            end = end + (end-start+1)*2; //2+(2-0+1)*2 = 2+6= 8
            start = newStart;
        }

        //run binary search now final selected chunk
        while(end >= start){
            int middle = start + (end-start)/2;
            if(arr[middle] < target)
                start = middle+1;
            else if(arr[middle] > target)
                end = middle-1;
            else
                return middle;
        }
        return -1;
    }
    
}

//               s
//                             e 
//input - [1,2,4,6,8,10,11,15,17,18,20,23,25,27,29,31,36,38,39] , target = 15;
//output - 7