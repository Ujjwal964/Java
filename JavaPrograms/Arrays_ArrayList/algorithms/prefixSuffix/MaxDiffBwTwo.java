//QUES - Find max diff bw two elements and print max difference.

package Arrays_ArrayList.algorithms.prefixSuffix;
import java.util.*;

public class MaxDiffBwTwo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        System.out.print("Enter array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        
        maxDiff(arr);
    }
    
    static void maxDiff(int[] arr){
        int max = 0;
        for(int i=0;i<arr.length-1;i++){
            int diff = 0;
            for(int j=i+1;j<arr.length;j++){
                diff = arr[j] - arr[i];
                max = diff > max ? diff : max;
            }
        }
        System.out.println("Max diff : "+max);
    }
}
