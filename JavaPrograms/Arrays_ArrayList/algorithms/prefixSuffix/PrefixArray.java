package Arrays_ArrayList.algorithms.prefixSuffix;
import java.util.*;

 public class PrefixArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[6];
        System.out.print("Enter an array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        
        prefixSum(arr);
    }
    
    static void prefixSum(int[] arr){
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        System.out.println("Prefix Array is : "+Arrays.toString(prefix));
    }
}
