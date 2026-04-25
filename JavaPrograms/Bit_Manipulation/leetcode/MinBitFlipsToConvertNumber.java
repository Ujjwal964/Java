//QUES - https://leetcode.com/problems/minimum-bit-flips-to-convert-number/description/
//SOURCE - Striver (https://youtu.be/OOdrmcfZXd8?si=n62i2OswiHM8-_X-)

package Bit_Manipulation.leetcode;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class MinBitFlipsToConvertNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number : ");
        int start = sc.nextInt();
        System.out.print("Enter goal number : ");
        int goal = sc.nextInt();
        System.out.println(minBitFlips(start,goal));
        sc.close();
    }

    static int minBitFlips(int start , int goal){
        int xorResult = start ^ goal; //XOR will give ans where 1 will be at indexes which need to be changed to reach goal.
        int count = 0;                //so to count bit flips we can count No of 1 bits right.
        while(xorResult > 0){
            count += xorResult & 1;     //checking odd or even,if odd we'll get 1 so add in count otherwise 0.
            xorResult = xorResult >> 1; //reducing number(n/2) or we can right shift right.
        }
        return count;
    }
}

//start - 10 , goal - 7
//10 - 1 0 1 0
//7 -  0 1 1 1

// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int minBitFlips(int start, int goal) {
//         int xorResult = start ^ goal;
//         int count = 0;
//         while(xorResult > 0){
//             count += xorResult & 1;
//             xorResult = xorResult >> 1;
//         }
//         return count;
//     }
// }