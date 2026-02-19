//QUES - https://leetcode.com/problems/move-zeroes/description/

package Arrays_ArrayList.algorithms.twoPointer;
import java.util.*;

//NAIVE APPROACH
public class MoveZeroes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        moveZero(arr);
    }
    
    static void moveZero(int[] arr){
        int[] ans = new int[arr.length];
        int countZero = 0;

        for(int i=0;i<arr.length;i++){
            countZero += (arr[i] == 0) ? 1 : 0;
        }
        System.out.println("Total zeros : "+countZero);

        int end = arr.length - 1;
        while(countZero>0){
            ans[end--] = 0; 
            countZero--;
        }
        System.out.println(Arrays.toString(ans));
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0)
                ans[i] = arr[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}

//input - 0 1 0 3 12
//output - 1 3 12 0 0 