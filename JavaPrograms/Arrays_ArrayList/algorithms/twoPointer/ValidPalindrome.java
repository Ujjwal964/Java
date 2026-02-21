//QUES - https://leetcode.com/problems/valid-palindrome/description/
//SOURCE - CTO Bhaiya (https://youtu.be/Yi90cuHYyWQ?si=vTj3d-g-akP6ykDn)

package Arrays_ArrayList.algorithms.twoPointer;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------
//WITHOUT USING TWO POINTER APPROACH (use reverse approach)

// public class ValidPalindrome {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a string : ");
//         String s = sc.nextLine();

//         System.out.println("Valid Palindrome : "+validPalindrome(s));
//     }

//     static boolean validPalindrome(String s){
//         String finalS = s.replaceAll("[^a-zA-Z0-9]" , "").toLowerCase();
//         String rev = "";

//         for(int i=0;i<finalS.length();i++){
//             char ch = finalS.trim().charAt(i);
//             rev = ch + rev;
//         }

//         if(rev.equals(finalS))
//             return true;

//         return false;
//     }   
// }


//USING TWO POINTER APPROACH

public class ValidPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.nextLine();

        System.out.println("Valid Palindrome : "+validPalindrome(s));
    }

    static boolean validPalindrome(String s){
        String finalS = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int start = 0;
        int end = finalS.length()-1;

        while(end >= start){
            if(finalS.charAt(start) == finalS.charAt(end)){
                end--;
                start++;
            }
            else
                return false;
        }
        return true;
    }
}

//madam
// input : "A man, a plan, a canal: Panama"
//output : yes "amanaplanacanalpanama" palindrome.



// ----------------------------------------LEETCODE SOL-----------------------------------------
// WITHOUT USING TWO POINTER (using reverse approach)

// class Solution {
//     public boolean isPalindrome(String s) {
//         String finalS = s.replaceAll("[^a-zA-Z0-9]" , "").toLowerCase();
//         String rev = "";

//         for(int i=0;i<finalS.length();i++){
//             char ch = finalS.trim().charAt(i);
//             rev = ch + rev;
//         }

//         if(rev.equals(finalS))
//             return true;
        
//         return false;
//     }
// }



//USING TWO POINTER APPROACH

// class Solution {
//     public boolean isPalindrome(String s) {
//         String finalS = s.replaceAll("[^a-zA-Z0-9]" , "").toLowerCase();
//         int start = 0;
//         int end = finalS.length()-1;
        
//         while(end >= start){
//             char a = finalS.charAt(start);
//             char b = finalS.charAt(end);
//             if(a == b){
//                 end--;
//                 start++;
//             }
//             else
//                 return false;
//         }
//         return true;
//     }
// }