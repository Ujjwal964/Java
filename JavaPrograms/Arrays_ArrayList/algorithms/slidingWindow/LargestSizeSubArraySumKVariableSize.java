//QUES - Find largest subarray of sum equals k and variable window size. (earlier we did for fixed window size by comparing if i and j is equal to window size or not but now we have
// we have variable window size so now we will compare i and j as they get equal to sum.)
//SOURCE - aditya verma / 

package Arrays_ArrayList.algorithms.slidingWindow;
import java.util.*;

public class LargestSizeSubArraySumKVariableSize {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter array : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter sum value : ");
        int target = sc.nextInt();

        System.out.print(findLargestSubArrayEqualsSum(arr , target));
    }


    // 1st Approach - OPTIMAL (if array contains all positive and zeros then use SLIDING WINDOW).
    static int findLargestSubArrayEqualsSum(int[] arr , int target){
        int sum = 0;
        int i = 0;
        int j = 0;
        int maxSize = 0;

        while(j < arr.length){
            sum = sum + arr[j];

            if(sum < target)
                j++;

            else if(sum == target){
                maxSize = (j-i+1) > maxSize ? (j-i+1) : maxSize;
                j++;
            }
            else if(sum > target){
                while(i <= j && sum > target){
                    sum = sum - arr[i];
                    i++;
                }

                if(sum == target)
                    maxSize = (j-i+1) > maxSize ? (j-i+1) : maxSize;
                
                j++;
            }
        }
        return maxSize;
    }


    // 2nd Approach - BETTER (if array contains negative number also then use PREFIXSUM + HASHMAP).
    // static int findLargestSubArrayEqualsSum(int[] arr , int target){
    //     int prefixSum = 0;
    //     int max = 0;
    //     HashMap<Integer , Integer> map = new HashMap<>();

    //     for(int i=0;i<arr.length;i++){
    //         prefixSum += arr[i];

    //         if(prefixSum == target)
    //             max = Math.max(max , (i+1));

    //         int isEarlierPresent = prefixSum - target;
    //         if(map.containsKey(isEarlierPresent)){
    //             int len = i - map.get(isEarlierPresent);
    //             max = Math.max(max , len);
    //         }

    //         if(! map.containsKey(prefixSum))   //so that if we have zeroes and negative in array , then for longest the index should not get changed everytime for duplicate prefixSum.
    //             map.put(prefixSum , i );  
    //     }
    //     return max;
    // }

    //OR
    // static int findLargestSubArrayEqualsSum(int[] arr , int target){
    //     int prefixSum = 0;
    //     int max = 0;
    //     HashMap<Integer , Integer> map = new HashMap<>();
    //     map.put(0,-1);

    //     for(int i=0;i<arr.length;i++){
    //         prefixSum += arr[i];

    //         int isEarlierPresent = prefixSum - target;
    //         if(map.containsKey(isEarlierPresent)){
    //             int len = i - map.get(isEarlierPresent);
    //             max = Math.max(max , len);
    //         }

    //         if(! map.containsKey(prefixSum))        
    //             map.put(prefixSum , i );  
    //     }
    //     return max;
    // }


    // 3rd Approach - BRUTE FORCE (O(N3)) (STANDARD Approach)
    // static int findLargestSubArrayEqualsSum(int[] arr , int target){
    //     int max = 0;
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i;j<arr.length;j++){
    //             int sum = 0;
    //             for(int k=i;k<=j;k++){
    //                 sum = sum + arr[k];
    //             }
    //             if(sum == target)
    //                 max = (j-i+1) > max ? (j-i+1) : max;
    //         }
    //     }
    //     return max;
    // }

    //OR - - BRUTE FORCE (O(N2)) (LITTLE BETTER Approach)
    // static int findLargestSubArrayEqualsSum(int[] arr , int target){
    //     int max = 0;
    //     for(int i=0;i<arr.length;i++){
    //         int sum = 0;
    //         for(int j=i;j<arr.length;j++){
    //             sum = sum + arr[j];
    //             if(sum == target)
    //                 max = (j-i+1) > max ? (j-i+1) : max;

    //             System.out.println(Arrays.toString(Arrays.copyOfRange(arr , i , j+1)));
    //         }
    //     }
    //     return max;
    // }
}

//BRUTE FORCE DRY RUN
//        i
//              j             
//input - 4 1 1 1 2 3 5 , sum = 5  

//SLIDING WINDOW DRY RUN
//          i
//            j             
//input - 4 1 1 1 2 3 5 , sum = 5  
//output - 4 (largest subarray whose sum is 5, i.e : 1 1 1 2)

//PREFIXSUM DRY RUN
//          i          
//input - 4 1 1 1 2 3 5 , sum = 5 