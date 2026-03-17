//QUES - https://www.geeksforgeeks.org/problems/zero-sum-subarrays1825/1
//QUES - https://www.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1
//SOURCE - Coder Army (https://youtu.be/HZWTEeOqF4c?si=2iY_PMb5kbbggP1k)

package Arrays_ArrayList.algorithms.prefixSuffix;
import java.util.*;

public class SubArrayZeroSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.print("Enter array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println(subArrayZeroSum(arr));
    }
    
    //BRUTE FORCE APPROACH (O(N2))
    // static int subArrayZeroSum(int[] arr){
    //     int count = 0;
    //     for(int i=0;i<arr.length;i++){
    //         int sum = 0;
    //         for(int j=i;j<arr.length;j++){
    //             sum+= arr[j];
    //             if(sum == 0){
    //                 count++;
    //                 System.out.println(Arrays.toString(Arrays.copyOfRange(arr , i , j+1)));
    //             }
    //             // count += sum == 0 ? 1 : 0;
    //         }
    //     }
    //     return count;
    // }
    
    //PREFIX SUM APPROACH
    static int subArrayZeroSum(int[] arr){
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0 , 1);
        int count = 0;
        int prefixSum = 0;
        
        for(int i=0;i<arr.length;i++){
            prefixSum = prefixSum + arr[i];
            if(map.containsKey(prefixSum)){
                count += map.get(prefixSum);
                map.put(prefixSum , map.get(prefixSum) + 1);
            }
            else
                map.put(prefixSum , 1);
        }
        return count;
    }
}


//(brute) i
//        j
//input - 6 -1 -3 4 -2 2 4 6 -12 -2
//prfSum- 6  5  2 6  4 6 10 16 4  2 
// (if number coming again means sum didn't xhange like 6 came again after 2 elements means these two elements sum was zero so prefixsum didn't change.)
//output - 5 