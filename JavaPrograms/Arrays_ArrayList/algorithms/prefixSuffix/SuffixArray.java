package Arrays_ArrayList.algorithms.prefixSuffix;
import java.util.*;

public class SuffixArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.print("Enter an array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        
        suffixSum(arr);
    }
    
    static void suffixSum(int[] arr){
        int[] suffix = new int[arr.length];
        suffix[arr.length - 1] = arr[arr.length - 1];
        
        for(int i=arr.length-2;i>=0;i--){
            suffix[i] = suffix[i+1] + arr[i];
        }
        System.out.println("Suffix Array is : "+Arrays.toString(suffix));
    }
}