//QUES - https://leetcode.com/problems/rotate-array/

package Arrays_ArrayList.leetcode.assignments.medium;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class RotateArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        System.out.print("Enter array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter value of k : ");
        int k = sc.nextInt();
        rotateArray(arr , k);
    }
    
    //BETTER APPROACH (T.C - O(N) | S.C - O(N)) (SELF)✅ 
    // static void rotateArray(int[] arr , int k){
    //     if(arr.length == 0)
    //         return;
            
    //     k = k % arr.length;
    //     if(k == 0)
    //         return;
            
    //     List<Integer> list = new ArrayList<Integer>();
    //     for(int i : arr){
    //         list.add(i);
    //     }
    //     System.out.println(list);
        
    //     while(k>0){
    //         int i = list.size()-1;
    //         list.add(0 , list.get(i));
    //         list.remove(i+1);
    //         k--;
    //     }
    //     System.out.println(list);
        
    //     for(int i=0;i<list.size();i++){
    //         arr[i] = list.get(i);
    //     }
    //     System.out.println(Arrays.toString(arr));
    // }
    
    //ANOTHER APPROACH (TWO POINTER)
    static void rotateArray(int[] arr , int k){
        if(arr.length == 0)
            return;

        k = k % arr.length;
        if(k == 0)
            return;

        while(k > 0){
            int i = arr.length - 2;
            int j = arr.length - 1;

            while(i >= 0 && j > i){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i--;
                j--;
            }
            k--;
        }
        System.out.println(Arrays.toString(arr));
    }
}


//                          i j
//input - nums = [1,2,3,4,5,6,7], k = 3
//output - [5,6,7,1,2,3,4]



// -------------------------------------------LEETCODE SOL--------------------------------------------

//BETTER APPROACH (T.C - O(N) | S.C - O(N)) (SELF)✅ 

// class Solution {
//     public void rotate(int[] nums, int k) {
//         if(nums.length == 0)         //edge case
//             return;
            
//         k = k % nums.length;
//         if(k == 0)                   //edge case
//             return;

//         List<Integer> list = new ArrayList<Integer>();
//         for(int i : nums){
//             list.add(i);
//         }

//         while(k>0){
//             int i = list.size()-1;
//             list.add(0 , list.get(i));
//             list.remove(i+1);
//             k--;
//         }
        
//         for(int i=0;i<list.size();i++){
//             nums[i] = list.get(i);
//         }
//     }
// }




//NOT WORKING - TLE
// class Solution {
//     public void rotate(int[] nums, int k) {
//         if(nums.length == 0)
//             return;

//         k = k % nums.length;
//         if(k == 0)
//             return;

//         while(k > 0){
//             int i = nums.length - 2;
//             int j = nums.length - 1;

//             while(i >= 0 && j > i){
//                 int temp = nums[i];
//                 nums[i] = nums[j];
//                 nums[j] = temp;
//                 i--;
//                 j--;
//             }
//             k--;
//         }
//     }
// }