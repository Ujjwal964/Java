//QUES - (GFG) Given an array arr[ ] of length N consisting cost of N toys and an integer K depicting the amount with you. Your task is to find maximum number of toys you can buy with K amount. 
//QUES - (https://www.geeksforgeeks.org/problems/maximize-toys0331/1)

package Arrays_ArrayList.practise;
import java.util.*;

public class MaximizeToys{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter amount you have : ");
        int k = sc.nextInt();
        
        System.out.println(findMaxToys(arr , k));
    }
    
    static int findMaxToys(int[] arr , int k){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] <= k){
                count++;
                k = k - arr[i];
            }
        }
        return count;
    }
}


// arr[] = {1, 12, 5, 111, 200, 1000, 10} , k = 50
// Output: 4 (you can buy are 1, 12, 5 and 10.)