//QUES - (https://leetcode.com/problems/hamming-distance/)
//Same as Min Bit Flips To Convert Number (https://leetcode.com/problems/minimum-bit-flips-to-convert-number/description/)

package Bit_Manipulation.leetcode;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class HammingDistance {
    public static void main(String[] args){
        int x = 1 , y = 4;
        int ans = x ^ y;
        int count = 0;
        while(ans > 0){
            count += ans & 1;
            ans = ans >> 1;
        }
        System.out.println("Hamming Distance is : "+ count);
    }
}


// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int hammingDistance(int x, int y) {
//         int ans = x ^ y;
//         int count = 0;
//         while(ans > 0){
//             count += ans & 1;
//             ans = ans >> 1;
//         }
//         return count;
//     }
// }