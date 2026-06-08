package Revision_Practise;
import java.util.*;

public class SlidingWindowFixedSizePractise {
    public static void main(String[] args){

        //QUES - https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
        //Max subarray sum of size k (Aditya Verma Video 3)
        maxSubArraySumSizeK();

        //QUES - https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
        //First negative number in window size K (Aditya Verma Video 4)
        firstNegNoInSizeK();

    }

    static void maxSubArraySumSizeK(){
        int[] arr = new int[]{100,200,300,400};
        int k = 2;

        int i = 0;
        int j = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        
        while(j < arr.length){
            sum = sum + arr[j];
            
            if(j-i+1 < k)
                j++;
                
            else if(j-i+1 == k){
                max = Math.max(max , sum);
                j++;
                
                sum = sum - arr[i];
                i++;
            }
        }
        System.out.println("Max subarray sum is : "+max);
    }

    static void firstNegNoInSizeK(){
        int[] arr = new int[]{-8,2,3,-6,10};
        int k = 2;

        int i = 0;
        int j = 0;
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        
        while(j < arr.length){
            if(arr[j] < 0)
                queue.offer(arr[j]);
            
            if(j-i+1 < k)
                j++;
                
            else if(j-i+1 == k){
                
                if(queue.size() != 0){
                    ans.add(queue.peek());
                    j++;
                    
                    if(queue.peek() == arr[i])
                        queue.poll();
                    i++;
                }
                
                else{
                    ans.add(0);
                    i++;
                    j++;
                }
            }
        }
        System.out.println("First Neg no in every subarray : "+ans);
    }

}
