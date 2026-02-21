//QUES - given an array of numbers, find a pair whose multiply is equal to target value. sorted array given.
//SOURCE : Coder Army (https://youtu.be/KKPjlsLSs5w?si=8gyQ76BhPmnG4fp3)

package Arrays_ArrayList.algorithms.twoPointer;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------
//TWO POINTER APPROACH

public class PairEqualsMultiply {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target value : ");
        int target = sc.nextInt();

        System.out.println("Pair is : "+Arrays.toString(multiplyPair(arr , target)));
    }

    static int[] multiplyPair(int[] arr , int target){
        int[] ans = new int[2];
        int start = 0;
        int end = arr.length-1;
        while(end > start){
            int multiply = 0;
            multiply = arr[start] * arr[end];
            if(multiply > target)
                end--;
            else if(multiply < target)
                start++;
            else{
                ans[0] = start;
                ans[1] = end;
                break;
            }
        }
        return ans;
    }
    
}

//input - 3 7 8 11 25 , target - 56
// output - [1,2] (7 * 8 = 56)