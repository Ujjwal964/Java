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

    static int findLargestSubArrayEqualsSum(int[] arr , int target){
        int sum = 0;
        int i = 0;
        int j = 0;
        int maxSize = 0;

        while(j < arr.length){
            sum = arr[j] + sum;

            if(sum == target){
                maxSize = (j-i+1) > maxSize ? (j-i+1) : maxSize;
                // j++;
            }
            
            while(sum > target){
                sum = sum - arr[i];
                i++;
            }
            j++;
        }
        return maxSize;
    }
}

//                i
//                  j             
//input - 4 1 1 1 2 3 5 , sum = 5  
//output - 4 (largest subarray whose sum is 5, i.e : 1 1 1 2)