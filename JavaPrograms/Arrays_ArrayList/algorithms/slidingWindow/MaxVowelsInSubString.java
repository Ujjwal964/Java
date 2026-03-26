//QUES - https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/

package Arrays_ArrayList.algorithms.slidingWindow;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------
//FIXED SIZE SLIDING WINDOW

public class MaxVowelsInSubString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String s = sc.next();
        System.out.print("Enter integer k : ");
        int k = sc.nextInt();
        
        System.out.println(findMaxVowels(s , k));
    }
    
    static int findMaxVowels(String s , int k){
        HashMap<Character , Integer> sMap = new HashMap<>(26);
        HashMap<Character , Integer> vMap = new HashMap<>(Map.of(
            'a' , 1,
            'e' , 1,
            'i' , 1,
            'o' , 1,
            'u' , 1
        ));
        
        int max = 0;
        int i = 0;
        int j = 0;
        while(j < s.length()){
            char ch = s.charAt(j);
            sMap.put(ch , sMap.getOrDefault(ch , 0) + 1);
            
            if(j-i+1 < k)
                j++;
            else if(j-i+1 == k){
                max = Math.max(max , isHavingVowels(vMap , sMap));
                
                char leftCh = s.charAt(i);
                sMap.put(leftCh , sMap.get(leftCh) - 1);
                if(sMap.get(leftCh) == 0)
                    sMap.remove(leftCh);
                i++;
                j++;
            }
        }
        return max;
    }
    
    static int isHavingVowels(HashMap<Character , Integer> vMap ,HashMap<Character , Integer> sMap){
        int count = 0;
        
        for(char key : vMap.keySet()){
            if(sMap.containsKey(key))
                count += sMap.get(key);
        }
        return count;
    }
}

//          i
//              j
//input - " a b c i i i d e f ", k = 3
//output - 3 (as substring "iii" contains 3 vowel letters).



// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int maxVowels(String s, int k) {
//         HashMap<Character , Integer> sMap = new HashMap<>(26);
//         HashMap<Character , Integer> vMap = new HashMap<>(Map.of(
//             'a' , 1,
//             'e' , 1,
//             'i' , 1,
//             'o' , 1,
//             'u' , 1
//         ));
        
//         int max = 0;
//         int i = 0;
//         int j = 0;
//         while(j < s.length()){
//             char ch = s.charAt(j);
//             sMap.put(ch , sMap.getOrDefault(ch , 0) + 1);
            
//             if(j-i+1 < k)
//                 j++;
                
//             else if(j-i+1 == k){
//                 max = Math.max(max , isHavingVowels(vMap , sMap));
                
//                 char leftCh = s.charAt(i);
//                 sMap.put(leftCh , sMap.get(leftCh) - 1);
//                 if(sMap.get(leftCh) == 0)
//                     sMap.remove(leftCh);
//                 i++;
//                 j++;
//             }
//         }
//         return max;
//     }

//     static int isHavingVowels(HashMap<Character , Integer> vMap ,HashMap<Character , Integer> sMap){
//         int count = 0;
//         for(char key : vMap.keySet()){
//             if(sMap.containsKey(key))
//                 count += sMap.get(key);
//         }
//         return count;
//     }
// }
