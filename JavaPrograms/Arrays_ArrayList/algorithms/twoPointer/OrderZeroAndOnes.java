//QUES - array consist of 0's and 1's only , sort array ascending so that all 0's comes first then 1's.
//source - COLLEGE WALLAH (https://youtu.be/FmXF2df9OVo?si=KVxkeGeuD2QhMTIr)

package Arrays_ArrayList.algorithms.twoPointer;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------
//APPROACH 1- brute force : traversing array two times(2 for loops), not best time & space complexity.

// public class OrderZeroAndOnes{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
        
//         int[] arr = {1,0,1,0,0,1,0,1,0};
//         System.out.println("Current Array : "+Arrays.toString(arr));
        
//         System.out.println("Ordered Array : "+Arrays.toString(order(arr)));
//     }
    
//     static int[] order(int[] arr){
//         int zeroCount = 0;
//         for(int i=0;i<arr.length;i++){
//             zeroCount += arr[i] == 0 ? 1 : 0;
//         }
        
//         for(int i=0;i<arr.length;i++){
//             arr[i] = (i < zeroCount) ? 0 : 1;
//         }
//         return arr;
//     }
// }

// 1 0 1 0 1 0 1 0 ---output---> 0 0 0 0 1 1 1 1


//APPROACH 2- TWO POINTERS
public class OrderZeroAndOnes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] arr = {1,0,0,1,1,0,0,1,1,0};
        System.out.println("Current Array : "+Arrays.toString(arr));
        System.out.println("Ordered Array : "+Arrays.toString(order(arr)));
    }
    
    static int[] order(int[] arr){
        int left = 0;
        int right = arr.length-1;
        
        while(right>left){
            if(arr[left] == 0 && arr[right] == 1){
                left++;
                right--;
                continue;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
} 