//https://leetcode.com/problems/3sum/description/
//SOURCE - CTO Bhaiya (https://youtu.be/SP065oLnxGA?si=fO4xGHood241ICHg)

package Arrays_ArrayList.algorithms.twoPointer;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------
//TWO POINTER APPROACH

public class ThreeSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[6];
        System.out.print("Enter Array : ");
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(findTriplets(nums));
    }

    static List<List<Integer>> findTriplets(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        int f = 0;
        while(f < nums.length){
            if(nums[f] > 0)
                break;

            if(f == 0 || nums[f] != nums[f-1]){
                twoSumHelper(f , nums , ans);
            }
            f++;
        }
        return ans;
    }

    static void twoSumHelper(int f , int[] nums , List<List<Integer>> ans){     //normal two sum approach, same the way we do two sum.
        int i = f+1;
        int j = nums.length-1;

        while(j > i){
            int sum = nums[f] + nums[i] + nums[j];

            if(sum > 0)
                j--;
            else if(sum < 0)
                i++;
            else{
                //found triplet.
                ans.add(Arrays.asList(nums[f] , nums[i] , nums[j]));
                i++;
                j--;

                while(j > i && nums[i] == nums[i-1])
                    i++;

                while(j>i && nums[j] == nums[j+1])
                    j--;
            }
        }
    }
}

//          f  i         j
// input - [-1,0,1,2,-1,-4]
// output - distinct triplets - [[-1,-1,2],[-1,0,1]]



// ----------------------------------------LEETCODE SOL-----------------------------------------
//TWO POINTER APPROACH

// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         Arrays.sort(nums);
//         List<List<Integer>> ans = new ArrayList<>();

//         for(int f=0;f<nums.length;f++){
//             if(nums[f] > 0)
//                 break;

//             if(f==0 || nums[f] != nums[f-1])
//                 twoSumHelper(f , nums , ans);
//         }
//         return ans;
//     }

//     static void twoSumHelper(int f , int[] nums , List<List<Integer>> ans){
//         int i = f+1;
//         int j = nums.length-1;

//         while(j > i){
//             int sum = nums[f] + nums[i] + nums[j];
//             if(sum > 0)
//                 j--;
//             else if(sum < 0)
//                 i++;
//             else{
//                 ans.add(Arrays.asList(nums[f] , nums[i] , nums[j]));
//                 i++;
//                 j--;

//                 while(j>i && nums[i] == nums[i-1])
//                     i++;
                
//                 while(j>i && nums[j] == nums[j+1])
//                     j--;
//             }
//         }
//     }
// }