//QUES - https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/
//SOURCE - CTO Bhaiya

package Arrays_ArrayList.algorithms.twoPointer;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class CountPairsSumLessTarget {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.print("Enter array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target amount : ");
        int target = sc.nextInt();

        System.out.println("Total Pairs : "+countPairs(arr , target));
    }

    //BRUTE FORCE APPROACH
    // static int countPairs(int[] arr , int target){
    //     int count = 0;
    //     for(int i=0;i<arr.length-1;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             count += (arr[i]+arr[j] < target) ? 1 : 0;
    //         }
    //     }
    //     return count;
    // }

    //TWO POINTER APPROACH
    static int countPairs(int[] arr , int target){
        Arrays.sort(arr);       //first sort so array become like ex: given 3,2,1,4,5 so it becomes after sort :  1,2,3,4,5 and target is 7.
                                //now we'll check sum of extreme ends and comapre with targets means sum of index 0 and index last is 6, so 6 < 7 right means since array is sorted
                                //so below this last index all index will also satisfy this right they will also be < target(7) . so now how to count pairs bw these indx is simple just diff of last index from start which is 4-0 = 4.(these pairs will be of from index 0 like (1,2)(1,3)(1,4)(1,5) right!
                                // and if sum is > target means last index need to decrease by 1.
                                // and when we count pairs from a index we increase start by 1 then count from that index.

        int start = 0;
        int end = arr.length-1;
        int count = 0;

        while(end > start){
            int sum = arr[start] + arr[end];
            if(sum < target){
                count += end - start;
                start++;
            }
            else
                end--;
        }
        return count;
    }
}

//input - [-1,1,2,3,1] , target = 2;
//output - 3 (like indexes [0,1] , [0,2] , [0,4])



// ----------------------------------------LEETCODE SOL-----------------------------------------
//BRUTE FORCE APPROACH
// class Solution {
//     public int countPairs(List<Integer> nums, int target) {
//         int count = 0;
//         for(int i=0;i<nums.size()-1;i++){
//             for(int j=i+1;j<nums.size();j++){
//                 count += (nums.get(i) + nums.get(j) < target) ? 1 : 0;
//             }
//         }
//         return count;
//     }
// }

//TWO POINTER APPROACH 
// class Solution {
//     public int countPairs(List<Integer> nums, int target) {
//         Collections.sort(nums);

//         int start = 0;
//         int end = nums.size()-1;
//         int count = 0;
        
//         while(end > start){
//             int sum = nums.get(start) + nums.get(end);
//             if(sum < target){
//                 count += end - start;
//                 start++;
//             }
//             else
//                 end--;
//         }
//         return count;
//     }
// }