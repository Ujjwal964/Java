//QUES - find maximun number in all subarray of size k and return them in array or list.
//SOURCE - Aditya Verma ()
package Arrays_ArrayList.algorithms.slidingWindow;
import java.util.*;

public class MaxAllSubArraySizeK {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter array : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter window size : ");
        int window = sc.nextInt();

        System.out.println(findMaxOfAllSubArray(arr , window));
    }

    static ArrayList<Integer> findMaxOfAllSubArray(int[] arr , int window){
        ArrayList<Integer> list = new ArrayList<>();
        Deque<Integer> max = new LinkedList<>();    //using deque as allows double ended ope like add / remove from both ends.
        int i = 0;
        int j = 0;
        // int max = Integer.MIN_VALUE;     //will not work for some cases like in 2nd input.

        while(j < arr.length){

            while(max.size() > 0 && max.peekLast() < arr[j]){
                max.pollLast();
            }
            max.addLast(arr[j]);
            // max = arr[j] > max ? arr[j] : max;

            if(j-i+1 < window)
                j++;

            else if(j-i+1 == window){
                list.add(max.peekFirst());

                if(max.peekFirst() == arr[i])
                    max.pollFirst();
                i++;
                j++;
            }
        }
        return list;
    }
}

//             i
//                  j
//input - 1 3 -1 -3 5 3 6 7 , window size - 3
//output - 3 3 5 5 6 7

//        i
//            j
//input - 9 7 2 4 6 , window size - 3
//output - 9 7 6
//working : j = 9 add into dq then j++; then j=7 condition check in dq no element was smaller than this so it also 
//got add into dq now dq is [9,7] then j++; then j=2 again condition check no element was smaller, add into dq
//dq now is [9,7,2] now window reached size so ans is dq front list.add(9) then slide window condition check dq front
//is equal to arr[i] so remove now dq left is [7,2], then j++ , i++ then again condition check j=4, smaller element than j only 1 
//so removed and added j to dq and now dq is [7,4] and max now is list.add(7) and then equal to arr[i] removed 
//then dq now is[4] now j++ , i++ and now j=6 so condition check and remove small number so dq now is [6] and 
//now max is list.add(peekFirst()) = 6 so program over. max we got is [9,7,6].

//deque ope : 
//pollFirst | pollLast - remove element from first / last. (gives null if empty list).
//offerFirst | offerLast - add element from first / last.
//removeFirst | removeLast - also removes element but gives exception if empty list.
//addFirst | addLast - also to add element (any can be used).
//peekFirst / peekLast - to see element at first / last.

//Queue | Deque - Interfaces
//LinkedList | ArrayDeque - Implementation of interfaces.
