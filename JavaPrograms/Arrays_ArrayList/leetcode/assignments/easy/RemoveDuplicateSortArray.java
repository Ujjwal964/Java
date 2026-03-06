//QUES - https://leetcode.com/problems/remove-duplicates-from-sorted-array/

package Arrays_ArrayList.leetcode.assignments.easy;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class RemoveDuplicateSortArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        System.out.print("Enter array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Total Unique Numbers : "+removeDuplicates(arr));
    }

    //USING TWO POINTERS
    static int removeDuplicates(int[] arr){
        int start = 0;
        int end = start+1;
        int i = 1;
        arr[0] = arr[start];

        while(end < arr.length){
            if(arr[start] != arr[end]){
                arr[i++] = arr[end];
                start++;
                end++;
            }
            else if(arr[start] == arr[end]){
                start++;
                end++;
            }
        }
        System.out.println(Arrays.toString(arr));
        return i;
    }

    //OR - Another Approach
    // static int removeDuplicates(int[] arr){
    //     int start = 0;
    //     int end = 1;
    //     arr[0] = arr[0];

    //     while(end < arr.length){
    //         if(arr[end - 1] != arr[end]){
    //             start++;
    //             arr[start] = arr[end];
    //             end++;
    //         }
    //         else if(arr[end - 1] == arr[end]){
    //             end++;
    //         }
    //     }
    //     System.out.println(Arrays.toString(arr));
    //     return start+1;
        
    // }


    //SELF APPROACH - WITHOUT USING TWO POINTERS (ans not coming in sorted order.)
    // static int removeDuplicates(int[] arr){
    //     HashMap<Integer , Integer> map = new HashMap<>();
    //     int count = 0;

    //     for(int i=0;i<arr.length;i++){
    //         if(map.containsKey(arr[i]))
    //             continue;
    //         else{
    //             map.put(arr[i] , 1);
    //         }
    //     }
    //     return count = map.size();
    // }
}

//input - [1,1,2]
//output - 2 and also [1,2] (only 2 unique letters.)

//          start
//             end
//input - [-3,-1,0,0,0,3,3]
//output - 4 and also [-3,-1,0,3]


// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int start = 0;
//         int end = start+1;
//         int i = 1;
//         nums[0] = nums[start];

//         while( end < nums.length){
//             if(nums[start] != nums[end]){
//                 nums[i++] = nums[end];
//                 start++;
//                 end++;
//             }
//             else if(nums[start] == nums[end]){
//                 start++;
//                 end++;
//             }
//         }
//         return i;
//     }
// }