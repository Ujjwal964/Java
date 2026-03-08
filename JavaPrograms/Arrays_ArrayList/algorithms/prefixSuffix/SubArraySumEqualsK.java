//QUES - https://leetcode.com/problems/subarray-sum-equals-k/description/
//SOURCE - Engineering Digest (https://youtu.be/eUNDQ6SAJcE?si=ASOWchZ9beeExefn)

package Arrays_ArrayList.algorithms.prefixSuffix;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class SubArraySumEqualsK {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter array : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter sum : ");
        int k = sc.nextInt();

        System.out.println(findSubArraySumEqualK(arr, k ));
    }

    static int findSubArraySumEqualK(int[] arr , int k){
        int count = 0;
        int prefixSum = 0;
        HashMap<Integer , Integer> map = new HashMap<>();

        map.put(0 ,1);
        for(int i=0;i<arr.length;i++){
            prefixSum = prefixSum + arr[i];

            int ifEarlierPresent = prefixSum - k;
            count += map.getOrDefault(ifEarlierPresent , 0);
            map.put(prefixSum , map.getOrDefault(prefixSum , 0) + 1);
        }
        return count;
    }
}

//input - [1,1,1] , k = 2
//output - 2 (as one is [1,1] and other also is [1,1]).

//input - [1,2,3] , k - 3
//output - 2 (as one is [1,2] and other is [3]).


// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int prefixSum = 0;
//         int count = 0;
//         Map<Integer , Integer> map = new HashMap<>();

//         map.put(0 , 1);
//         for(int i=0;i<nums.length;i++){
//             prefixSum = prefixSum + nums[i];

//             int isEarlierPresent = prefixSum - k;
//             count += map.getOrDefault(isEarlierPresent , 0);
//             map.put(prefixSum , map.getOrDefault(prefixSum , 0) + 1);
//         }
//         return count;
//     }
// }