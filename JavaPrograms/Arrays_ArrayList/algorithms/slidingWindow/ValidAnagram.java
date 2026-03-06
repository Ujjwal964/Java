//QUES - https://leetcode.com/problems/valid-anagram/description/

package Arrays_ArrayList.algorithms.slidingWindow;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class ValidAnagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string s : ");
        String s = sc.nextLine();
        System.out.print("Enter anagram t : ");
        String t = sc.nextLine();

        System.out.println(isAnagram(s , t));
    }

    //ARRAYS APPROACH
    static boolean isAnagram(String s , String t){
        int sSize = s.length();
        int tSize = t.length();
        int[] sCount = new int[26];
        int[] tCount = new int[26];

        if(tSize > sSize)
            return false;

        for(int i=0;i<tSize;i++){
            char ch = t.charAt(i);
            tCount[ch - 'a']++;
        }

        for(int i=0;i<sSize;i++){
            char ch = s.charAt(i);
            sCount[ch - 'a']++;
        }

        return Arrays.equals(sCount , tCount);
    }
}

//input - s : anagram | t : nagaram
//output - true

//input - s : rat | t : car
//output - false




// ----------------------------------------LEETCODE SOL-----------------------------------------
//USING ARRAYS APPROACH

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         int sSize = s.length();
//         int tSize = t.length();
//         int[] sCount = new int[26];
//         int[] tCount = new int[26];

//         if(tSize > sSize)
//             return false;
        
//         for(int i=0;i<tSize;i++){
//             char ch = t.charAt(i);
//             tCount[ch - 'a']++;
//         }

//         for(int i=0;i<sSize;i++){
//             char ch = s.charAt(i);
//             sCount[ch - 'a']++;
//         }

//         return Arrays.equals(sCount , tCount);
//     }
// }



//USING HASHMAP (not best approach , slow with more complexity and more line of code)
// class Solution {
//     public boolean isAnagram(String s, String t) {
//         int sSize = s.length();
//         int tSize = t.length();
//         HashMap<Character , Integer> sMap = new HashMap<>(26);
//         HashMap<Character , Integer> tMap = new HashMap<>(26);

//         if(tSize > sSize)
//             return false;
        
//         for(int i=0;i<tSize;i++){
//             char ch = t.charAt(i);
//             tMap.put(ch , tMap.getOrDefault(ch , 0) + 1);
//         }

//         for(int i=0;i<sSize;i++){
//             char ch = s.charAt(i);
//             sMap.put(ch , sMap.getOrDefault(ch , 0) + 1);
//         }

//         return tMap.equals(sMap);
//     }
// }