//QUES - https://leetcode.com/problems/check-if-the-sentence-is-pangram/
//A pangram is a sentence where every letter of the English alphabet appears at least once.
//(TOUGH)

package Arrays_ArrayList.leetcode.assignments.easy;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------
                                     //no hashset , no array , just normal loop

public class PanagramSentence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        String s = sc.nextLine().toLowerCase();

        System.out.println(checkPanagram(s));
    }

    static boolean checkPanagram(String s){
        if(s.length() < 26)
            return false;

        for(char ch='a';ch<='z';ch++){
            if(s.indexOf(ch) < 0)
                return false;
        }
        return true;
    }
}
//leetcode


// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public boolean checkIfPangram(String sentence) {
//         if(sentence.length() < 26){
//             return false;
//         }
//         for(char ch = 'a';ch<='z';ch++){
//             if(sentence.indexOf(ch) < 0){
//                 return false;
//             }
//         }
//         return true;
//     }
// }