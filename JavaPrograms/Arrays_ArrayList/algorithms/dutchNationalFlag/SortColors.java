// DUTCH NATIONAL FLAG ALGORITHM (DNF) - Basically 3 pointer approach.

//QUES - https://leetcode.com/problems/sort-colors/description/
//SOURCE - https://youtu.be/6sMssUHgaBs?si=a8HB6pbWGbiw7kwy

package Arrays_ArrayList.algorithms.dutchNationalFlag;
import java.util.*;

public class SortColors{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.print("Enter array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        sortColors(arr);
    }
    
    //BETTER APPROACH (T.C - O(NLogN) | S.C - O(N)) (SELF)✅
    // static void sortColors(int[] arr){
    //     Map<Integer, Integer> map = new TreeMap<>();
    //     for(int i=0;i<arr.length;i++){
    //         map.put(arr[i] , map.getOrDefault(arr[i] , 0) + 1);
    //     }
    //     int index = 0;
        
    //     for(Map.Entry<Integer,Integer> pair : map.entrySet()){
    //         int key = pair.getKey();
    //         int value = pair.getValue();
            
    //         for(int i=0;i<value;i++){
    //             arr[index++] = key;
    //         }
    //     }
    //     System.out.println(Arrays.toString(arr));
    // }
    
    
    //OPTIMAL APPROACH (DUTCH NATIONAL FLAG ALGO (DNF) : TWO POINTERS)
    //(T.C - O() | S.C - O())✅
    static void sortColors(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        
        while(high >= mid){
            if(arr[mid] == 2){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
            else if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            }
            else if(arr[mid] == 1)
                mid++;
        }
        System.out.println(Arrays.toString(arr));
    }
}

//          low
//          mid
//                    high       
//input - [ 0 0 1 1 2 2 ]
//output - [ 0 0 1 1 2 2 ]

//            low
//            mid
//            high       
//input - [ 0 1 2 ]
//output - [ 0 1 2 ]



// -------------------------------------------LEETCODE SOL--------------------------------------------

//BETTER APPROACH (T.C - O(NLogN) | S.C - O(N)) (SELF)✅
// class Solution {
//     public void sortColors(int[] arr) {
//         Map<Integer, Integer> map = new TreeMap<>();
//         for(int i=0;i<arr.length;i++){
//             map.put(arr[i] , map.getOrDefault(arr[i] , 0) + 1);
//         }
//         int index = 0;
        
//         for(Map.Entry<Integer,Integer> pair : map.entrySet()){
//             int key = pair.getKey();
//             int value = pair.getValue();
            
//             for(int i=0;i<value;i++){
//                 arr[index++] = key;
//             }
//         }        
//     }
// }



//OPTIMAL APPROACH (DUTCH NATIONAL FLAG ALGO : TWO POINTERS)
//(T.C - O() | S.C - O())✅
// class Solution {
//     public void sortColors(int[] arr) {
//         int low = 0;
//         int mid = 0;
//         int high = arr.length-1;
        
//         while(high >= mid){
//             if(arr[mid] == 2){
//                 int temp = arr[mid];
//                 arr[mid] = arr[high];
//                 arr[high] = temp;
//                 high--;
//                 // mid++;
//             }
//             else if(arr[mid] == 0){
//                 int temp = arr[low];
//                 arr[low] = arr[mid];
//                 arr[mid] = temp;
//                 mid++;
//                 low++;
//             }
//             else if(arr[mid] == 1)
//                 mid++;
//         }     
//     }
// }