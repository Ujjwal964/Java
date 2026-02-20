//QUES - https://leetcode.com/problems/move-zeroes/description/

package Arrays_ArrayList.algorithms.twoPointer;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------
//--NAIVE APPROACH (good for understanding but not for time and space complexity).
// can also make one more array and store all 0's there and all

// public class MoveZeroes {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[5];
//         System.out.print("Enter array : ");
//         for(int i=0;i<arr.length;i++){
//             arr[i] = sc.nextInt();
//         }

//         moveZero(arr);
//     }

//     // ------------OR--------------
//     static void moveZero(int[] arr){
//         int k = 0;

//         for(int i=0;i<arr.length;i++){
//             if(arr[i] != 0)
//                 arr[k++] = arr[i];
//         }

//         while(k < arr.length){
//             arr[k++] = 0;
//         }

//         System.out.println("Sorted Array : "+Arrays.toString(arr));
//     }
    

//     // ------------OR--------------
//     // static void moveZero(int[] arr){
//     //     int k = 0;
//     //     int countZero = 0;
//     //     int z = arr.length-1;

//     //     for(int i=0;i<arr.length;i++){
//     //         if(arr[i] != 0)
//     //             arr[k++] = arr[i];
//     //         else
//     //             countZero++;
//     //     }
//     //     System.out.println("Total Zeroes : "+countZero);

//     //     for(int i=0;i<countZero;i++){
//     //         arr[z--] = 0;
//     //     }

//     //     System.out.println("Sorted Array : "+Arrays.toString(arr));
//     // }
// }



//USING TWO POINTER APPROACH

public class MoveZeroes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        moveZero(arr);
    }

    static void moveZero(int[] arr){
        int l = 0;
        int r = 0;

        while(r<arr.length){
            if(arr[r] == 0){
                r++;
            }
            else{
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r++;
            }
        }
        System.out.println("Sorted Array : "+Arrays.toString(arr));
    }
}    

//input - 0 1 0 3 12
//output - 1 3 12 0 0 

// l l
// 0 1 0 3 12
// r r r r


// ----------------------------------------LEETCODE SOL-----------------------------------------

//NAIVE APPROACH

// class Solution {
//     public void moveZeroes(int[] nums) {
//         int k = 0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i] != 0)
//                 nums[k++] = nums[i];
//         }
//         while(k < nums.length){
//             nums[k++] = 0;
//         }
//         Arrays.toString(nums);
//     }
// }


//USING TWO POINTER APPROACH
class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0;
        int r = 0;

        while(r < nums.length){
            if(nums[r] == 0)
                r++;
            else{
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r++;
            }
        }
        Arrays.toString(nums);
    }
}

