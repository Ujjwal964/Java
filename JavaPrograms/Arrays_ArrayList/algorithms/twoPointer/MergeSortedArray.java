//QUES - https://leetcode.com/problems/merge-sorted-array/description/
//SOURCE - CTO Bhaiya (https://youtu.be/SP065oLnxGA?si=fO4xGHood241ICHg)

package Arrays_ArrayList.algorithms.twoPointer;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------
//TWO POINTER APPROACH

public class MergeSortedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of elements in nums1 : ");
        int m = sc.nextInt();
        System.out.print("Enter no of elements in nums2 : ");
        int n = sc.nextInt();

        int[] nums1 = new int[m+n];
        System.out.print("Enter nums1 array : ");
        for(int i=0;i<m;i++){
            nums1[i] = sc.nextInt();
        }
        int[] nums2 = new int[n];
        System.out.print("Enter nums2 array : ");
        for(int i=0;i<n;i++){
            nums2[i] = sc.nextInt();
        }

        System.out.println("\nNums1 array : "+Arrays.toString(nums1));
        System.out.println("Nums2 array : "+Arrays.toString(nums2));

        mergeArray(nums1 , m , nums2 , n);
    }

    static void mergeArray(int[] nums1 , int m , int[] nums2 , int n){
        int start = m-1;
        int end = nums2.length-1;
        int k = nums1.length-1;

        while(end >= 0 && start >= 0){
            if(nums1[start] < nums2[end]){
                nums1[k--] = nums2[end];
                end--;
            }
            else if(nums1[start] > nums2[end]){
                nums1[k--] = nums1[start];
                start--;
            }
            else{
                nums1[k--] = nums1[start];
                start--;
            }
        }

        while(end >=0){
            nums1[k--] = nums2[end];
            end--;
        }
        System.out.println("Sorted Array : "+Arrays.toString(nums1));
    }
}

//         i i i k k k
//nums1 - [1,2,3,0,0,0] , m=3   /OR/    [4,5,6,0,0,0] , m=3 
//nums2 - [2,5,6] , n=3;        /OR/    [1,2,3] , n=3   
//         j j j
//output after merge - [1,2,2,3,5,6]    /OR/ output - [1,2,3,4,5,6]



// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int start = m-1;
//         int end = n-1;
//         int k = m + n - 1;

//         while(start >= 0 && end >= 0){
//             if(nums1[start] < nums2[end]){
//                 nums1[k--] = nums2[end];
//                 end--;
//             }
//             else if(nums1[start] > nums2[end]){
//                 nums1[k--] = nums1[start];
//                 start--;
//             }
//             else{
//                 nums1[k--] = nums1[start];
//                 start--;
//             }
//         }

//         while(end >= 0){
//             nums1[k--] = nums2[end];
//             end--;
//         }
//     }
// }

