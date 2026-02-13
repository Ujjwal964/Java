//QUES - print all possible subarrays of given array.

package Arrays_ArrayList.algorithms.prefixSuffix;
import java.util.*;

public class AllSubArrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.print("Give an array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("All SubArrays are : ");
        subArrays(arr);
    }
    
    static void subArrays(int[] arr){
        int start = 0;
        int end = arr.length-1;
        for(int i=start;i<=end;i++){
            for(int j=i;j<=end;j++){
                System.out.println(Arrays.toString(Arrays.copyOfRange(arr,i,j+1)));
                // for(int k=i;k<=j;k++){
                //     System.out.print("["+arr[k]+"]");
                // }
                // System.out.println();
            }
        }
    }
}