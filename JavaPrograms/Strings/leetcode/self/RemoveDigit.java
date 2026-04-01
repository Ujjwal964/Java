//QUES - https://leetcode.com/problems/remove-digit-from-number-to-maximize-result/
//ASKED IN IBM CODING ROUND (trick based)
//SOURCE - https://youtu.be/3hkyjOshZPw?si=ebKCew22G10wXXQv

package Strings.leetcode.self;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class RemoveDigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number string : ");
        String number = sc.next();
        System.out.print("Enter char digit : ");
        char digit = sc.next().charAt(0);
        System.out.println(removeDigitFromNo(number , digit));
    }
    
    static String removeDigitFromNo(String number , char digit){
        for(int i=0;i<number.length()-1;i++){
            if(number.charAt(i) == digit && 
                number.charAt(i+1) > number.charAt(i))
                return number.substring(0 , i) + number.substring(i+1);
        }
        
        int lastIndex = number.lastIndexOf(digit);
        if(lastIndex == number.length() - 1)
            return number.substring(0 , lastIndex);
            
        return number.substring(0 , lastIndex) + number.substring(lastIndex+1);
    }
}

//input - 1231 , digit = 1
//output - 231 (among these two 123 and 231, big is 231).



// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public String removeDigit(String number, char digit) {
//         for(int i=0;i<number.length()-1;i++){
//             if(number.charAt(i) == digit && number.charAt(i+1) > number.charAt(i))
//                 return number.substring(0 , i) + number.substring(i+1);
//         }
        
//         int lastIndex = number.lastIndexOf(digit);
//         if(lastIndex == number.length() - 1)
//             return number.substring(0 , lastIndex);
            
//         return number.substring(0 , lastIndex) + number.substring(lastIndex+1);
        
//     }
// }