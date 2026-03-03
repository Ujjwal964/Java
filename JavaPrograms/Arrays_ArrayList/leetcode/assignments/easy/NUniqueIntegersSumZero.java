//QUES - https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
//SOURCE - (https://youtu.be/dTK-WRnKsr8?si=mBOBrp0u2nUSGcZo)

package Arrays_ArrayList.leetcode.assignments.easy;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class NUniqueIntegersSumZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Integer : ");
        int n = sc.nextInt();

        System.out.println(Arrays.toString(findNUniqueIntegers(n)));
    }

    static int[] findNUniqueIntegers(int n){
        int[] arr = new int[n];

        if(n == 1)
            return new int[]{0};
        if(n % 2 == 0){
            for(int i=0;i<n;i=i+2){
                arr[i] = i+1;
                arr[i+1] = -1 * arr[i];   
            }
        }
        else if(n % 2 != 0){
            for(int i=0;i<n-1;i=i+2){
                arr[i] = i+1;
                arr[i+1] = -1 * arr[i];
            }
            arr[n-1] = 0;
        }
        return arr;
    }
}


//input - n=5
//output can be : [1,-1,2,-2,0]
//aproach can be if even add pairs like 1 so -1 and 2 so -2
//approach for odd like n=5 so add pairs like 1,-1,2,-2 and add at end 0.




// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int[] sumZero(int n) {
//         int[] arr = new int[n];

//         if(n == 1)
//             return new int[]{0};
        
//         if(n % 2 == 0){
//             for(int i=0;i<n;i=i+2){
//                 arr[i] = i+1;
//                 arr[i+1] = -1 * arr[i];
//             }
//         }
//         else if(n % 2 != 0){
//             for(int i=0;i<n-1;i=i+2){
//                 arr[i] = i+1;
//                 arr[i+1] = -1 * arr[i];
//             }
//             arr[n-1] = 0;
//         }
//         return arr;
//     }
// }