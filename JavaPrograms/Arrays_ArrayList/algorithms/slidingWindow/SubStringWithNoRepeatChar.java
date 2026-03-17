//QUES - https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
//SOURCE - Aditya Verma (https://youtu.be/L6cffskouPQ?si=D5RNM5d7klzmNbmF)

package Arrays_ArrayList.algorithms.slidingWindow;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class SubStringWithNoRepeatChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.next();
        
        System.out.println(longestSubString(s));
    }
    
    //SELF APPROACH
    static int longestSubString(String s){
        HashMap<Character , Integer> map = new HashMap<>();
        int i =0;
        int j = 0;
        int longest = 0;
        
        while(j < s.length()){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                longest = Math.max(longest , (j-i) );
                System.out.println(s.substring(i , j));
                map.remove(s.charAt(i));
                i++;
            }
            else{
                map.put(ch , 1);
                j++;
            }
        }
        return longest;
    }
    
    //ADITYA VERMA USING GENERAL VARIABLE SIZE SLIDING WINDOW APPROACH
}

// 3
//            i      
//                j      
//input - a b c a b c b b
//output - 3 (longest with non repeating is abc).

//input - abcb
//output - 3 (for this , this approach is little weak.)



// ----------------------------------------LEETCODE SOL-----------------------------------------

//SELF APPROACH
// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         HashMap<Character , Integer> map = new HashMap<>();
//         int i = 0;
//         int j = 0;
//         int longest = 0;

//         if(s.isEmpty())
//             return 0;

//         while(j < s.length()){
//             char ch = s.charAt(j);

//             if(map.containsKey(ch)){
//                 longest = Math.max(longest , (j-i) );
//                 map.remove(s.charAt(i));
//                 i++;
//             }
//             else{
//                 map.put(ch , 1);
//                 longest = Math.max(longest , (j-i+1) );
//                 j++;
//             }
//         }
//         return longest == 0 ? 1 : longest;
//     }
// }


//SELF ANOTHER APPROACH
// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         HashMap<Character , Integer> map = new HashMap<>();
//         int i = 0;
//         int j = 0;
//         int longest = 0;

//         if(s.isEmpty())
//             return 0;

//         while(j < s.length()){
//             char ch = s.charAt(j);

//             while(map.containsKey(ch)){
//                 longest = Math.max(longest , (j-i));
//                 map.remove(s.charAt(i));
//                 i++;
//             }

//             map.put(ch , 1);
//             longest = Math.max(longest , (j-i+1));
//             j++;

//         }
//         return longest;
//     }
// }


//ADITYA VERMA USING GENERAL VARIABLE SIZE SLIDING WINDOW APPROACH
