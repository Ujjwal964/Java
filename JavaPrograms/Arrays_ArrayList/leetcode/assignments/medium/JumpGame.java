//QUES - https://leetcode.com/problems/jump-game/description/
//SOURCE - Striver (https://youtu.be/tZAa_jJ3SwQ?si=-wyCbxGoO6ikol7o)
//Greedy Algorithm & DP

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

package Arrays_ArrayList.leetcode.assignments.medium;
import java.util.*;

public class JumpGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(jumpArrayPossible(arr));
    }

    //GREEDY ALGO APPROACH
    static boolean jumpArrayPossible(int[] arr){
        int maxIndex = 0;

        for(int i=0;i<arr.length;i++){

            if(i > maxIndex)
                return false;

            int canMaxGoTo = i + arr[i];
            maxIndex = Math.max(canMaxGoTo , maxIndex);
        }
        return maxIndex >= (arr.length - 1) ? true : false;
    }
}

//          i                            i
//input - [ 2 3 1 1 4 ]      / [ 3 2 1 0 4 ]
//output - true (yes can reach last index.)
//max = 3



// ----------------------------------------LEETCODE SOL-----------------------------------------

//GREEDY ALGO APPROACH
// class Solution {
//     public boolean canJump(int[] arr) {
//         int maxIndex = 0;

//         for(int i=0;i<arr.length;i++){

//             if(i > maxIndex)
//                 return false;

//             int canMaxGoTo = i + arr[i];
//             maxIndex = Math.max(canMaxGoTo , maxIndex);
//         }
//         return maxIndex >= (arr.length - 1) ? true : false;
//     }
// }