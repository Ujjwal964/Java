//QUES - https://leetcode.com/problems/valid-palindrome-ii/description/
//SOURCE - CTO Bhaiya (https://youtu.be/Yi90cuHYyWQ?si=vTj3d-g-akP6ykDn)

package Arrays_ArrayList.algorithms.twoPointer;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------
//WITHOUT USING TWO POINTER APPROACH (use reverse approach)

public class ValidPalindromeTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = "abca";
        System.out.println("Valid Palindrome : "+validPalindrome2(s));
    }

    //main function
    static boolean validPalindrome2(String s){
        int start = 0;
        int end = s.length()-1;

        while(end > start){
            if(s.charAt(start) == s.charAt(end)){
                end--;
                start++;
            }
            else{           //checking first delete start element and move by 1 or  checking deleting from end by -1 and yes at single time we are deleting atmost one element only. so calling helper function same as a normal palindrome logic.
                boolean check = isPalindromeHelper(s , start+1 , end) || isPalindromeHelper(s , start , end-1);
                return check;
            }
        }
        return true;
    }

    //helper function
    static boolean isPalindromeHelper(String s , int start , int end){
        while(end > start){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }
            else
                return false;
        }
        return true;
    }
}


// input - abbxa
// output - true palindrome , remove x.






// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public boolean validPalindrome(String s) {
//         int start = 0;
//         int end = s.length()-1;

//         while(end > start){
//             if(s.charAt(start) == s.charAt(end)){
//                 start++;
//                 end--;
//             }
//             else{
//                 boolean check = isPalindromeHelper(s,start+1,end) || isPalindromeHelper(s,start,end-1);
//                 return check;
//             }
//         }
//         return true;
//     }

//     static boolean isPalindromeHelper(String s , int start , int end){
//         while(end > start){
//             if(s.charAt(start) == s.charAt(end)){
//                 start++;
//                 end--;
//             }
//             else
//                 return false;
//         }
//         return true;
//     }
// }