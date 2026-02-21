//QUES - given an array of numbers, find a pair whose difference is equal to target difference value.
//SOURCE : Coder Army (https://youtu.be/KKPjlsLSs5w?si=8gyQ76BhPmnG4fp3)

package Arrays_ArrayList.algorithms.twoPointer;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------
//TWO POINTER APPROACH
//only if array is sorted , if not first sort then apply.

public class PairEqualsDifference {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.print("Enter Array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Diff Target : ");
        int target = sc.nextInt();

        System.out.println(Arrays.toString(differencePair(arr , target)));
    }

    static int[] differencePair(int[] arr , int target){
        int[] ans = new int[2];
        int start = 0;
        int end = 1;
        while(end < arr.length){
            int diff = 0;
            diff = arr[end] - arr[start];
            if(diff < target)
                end++;
            else if(diff > target)
                start++;
            else if(diff == target){
                ans[0] = start;
                ans[1] = end;
                break;
            }
        }
        return ans;
    }
}

// input - 2 3 5 10 50 80 , target diff - 45
// output - [2,4] (50-5 = 45)