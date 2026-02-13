//QUES - given an array and with index range , 'l' means left index and 'r' means right.
//find the sum of subarray between these index.

package Arrays_ArrayList.algorithms.prefixSuffix;
import java.util.*;

public class SubArraySumIndexRange{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int s = sc.nextInt();
        
        int[] arr = new int[s];
        System.out.print("Enter Array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.print("From Index : ");
        int l = sc.nextInt();
        System.out.print("From Index : ");
        int r = sc.nextInt();
        sumOfRange(arr , l , r);
    }
    
    static void sumOfRange(int[] arr , int l , int r){
        int totalSum = 0;
        for(int i=0;i<=r;i++){
            totalSum = arr[i] + totalSum;
        }
        
        int prefixSum = 0;
        for(int i=0;i<l;i++){
            prefixSum = arr[i] + prefixSum;
        }
        
        System.out.println("Sum of array in range is : "+ (totalSum - prefixSum));
    }
    
    // -------------------OR-----------------------
    
    // static void sumOfRange(int[] arr , int l , int r){
    //     int[] prefixArr = new int[arr.length];
    //     prefixArr[0] = arr[0];
    //     for(int i=1;i<prefixArr.length;i++){
    //         prefixArr[i] = prefixArr[i-1] + arr[i];
    //     }
    //     System.out.println("Prefix Array : "+Arrays.toString(prefixArr));
        
    //     System.out.println("Sum is : "+ (prefixArr[r] - prefixArr[l-1]));
    // }
}
