//QUES - https://leetcode.com/problems/power-of-two/description/

package Arrays_ArrayList.practise;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class PowerOfTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.println(isPowerOfTwo(n));
    }

    static boolean isPowerOfTwo(int n){
        if(n <= 0)
            return false;
        return (n&n-1) == 0;

        //OR in single line
        // return (n>0 && (n&n-1) == 0);
    }
}


// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         //OR
//         return (n > 0 && (n&n-1) == 0);

//         //OR
//         // if(n <= 0)
//         //     return false;
//         // return (n & n-1) == 0;

//         //OR
//         // if(n <= 0)
//         //     return false;
//         // if((n & n-1) == 0)
//         //     return true;
//         // return false;
//     }
// }
