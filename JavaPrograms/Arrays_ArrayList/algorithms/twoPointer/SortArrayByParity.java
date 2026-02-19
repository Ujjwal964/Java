//QUES - array given having some numbers and move all even to beginning of array followed by odd. Relative order doesnot matter, just return as per condition.
//QUES - https://leetcode.com/problems/sort-array-by-parity/submissions/

package Arrays_ArrayList.algorithms.twoPointer;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------
//TWO POINTER APPROACH
public class SortArrayByParity {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.print("Enter array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Ordered Array : "+Arrays.toString(orderEvenOdd(arr)));
    }

    static int[] orderEvenOdd(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(end>start){
            if(arr[start]%2 == 0)
                start++;
            else if(arr[end]%2 != 0)
                end--;
            else if(arr[start]%2 != 0 && arr[end]%2 == 0){
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

//input - 1 3 4 5 6 8
//output - 8 6 4 5 3 1 (order doesnt matter)


// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int[] sortArrayByParity(int[] nums) {
//         int left = 0;
//         int right = nums.length - 1;
//         while(right>left){
//             if(nums[left] % 2 == 0)
//                 left++;
//             else if(nums[right] % 2 != 0)
//                 right--;
//             else if(nums[left] % 2 != 0 && nums[right] % 2 == 0){
//                 int temp = nums[left];
//                 nums[left] = nums[right];
//                 nums[right] = temp;
//                 left++;
//                 right--;
//             }
//         }
//         return nums;
//     }
// }