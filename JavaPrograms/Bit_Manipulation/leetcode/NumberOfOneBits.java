//QUES - https://leetcode.com/problems/number-of-1-bits/description/
//SOURCE - Striver (https://youtu.be/nttpF8kwgd4?si=Zf5QFIMtHorC2vcV)

package Bit_Manipulation.leetcode;
public class NumberOfOneBits {

    //WITHOUT BIT (BRUTE FORCE APPROACH)(SELF)✅
    // public static void main(String[] args){
    //     int n = 8;
    //     String s = Integer.toBinaryString(n);
    //     int count = 0;
    //     for(char c : s.toCharArray()){
    //         count += (c == '1') ? 1 : 0;
    //     }
    //     System.out.println("Total no of set bits are : "+count);
    // }

    //USING BIT APPROACH
    public static void main(String[] args){
        int n = 13;
        int count = 0;

        //One way
        // while(n > 0){
        //     if(n % 2 == 1)
        //         count++;
        //     n=n/2;
        // }

        //OR
        while(n > 0){
            count += n & 1; //checks if last bit of number is odd or not(if odd will add 1 in count otherwise if even will add 0 in count,Advance devs do this approach to check if number is odd or even).
            n = n >> 1; //right shift by 1 - means equal to n/2 .can say divide no by 2 power 1.
        }
        System.out.println("No of set bits are : "+count);
    }
}


// ----------------------------------------LEETCODE SOL-----------------------------------------

//WITHOUT BIT (BRUTE FORCE APPROACH)(SELF)✅
// class Solution {
//     public int hammingWeight(int n) {
//         String s = Integer.toBinaryString(n);
//         int count = 0;
//         for(char c : s.toCharArray()){
//             count += (c == '1') ? 1 : 0;
//         }
//         return count;
//     }
// }

//USING BIT APPROACH
// class Solution {
//     public int hammingWeight(int n) {
//         int count = 0;
//         while( n > 0){
//             count += n & 1;
//             n = n >> 1;
//         }
//         return count;
//     }
// }
