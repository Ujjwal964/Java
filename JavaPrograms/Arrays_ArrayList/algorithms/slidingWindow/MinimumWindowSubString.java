//QUES - https://leetcode.com/problems/minimum-window-substring/
//SOURCE - Aditya Verma / Nikhil Lohia (https://youtu.be/SdeaOYoPhIs?si=EDnEbI-2kIgevKrl)

package Arrays_ArrayList.algorithms.slidingWindow;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class MinimumWindowSubString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string s : ");
        String s = sc.next();
        System.out.print("Enter string t : ");
        String t = sc.next();
        System.out.println(findMinWindowSubstring(s , t));
    }

    static String findMinWindowSubstring(String s , String t){
        HashMap<Character , Integer> tMap = new HashMap<>(26);
        HashMap<Character , Integer> sMap = new HashMap<>(26);

        if(t.length() > s.length())
            return "";

        for(int k=0;k<t.length();k++){
            char ch = t.charAt(k);
            tMap.put(ch , tMap.getOrDefault(ch , 0) + 1);
        }

        int i = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;

        while(j < s.length()){
            char ch = s.charAt(j);
            sMap.put(ch , sMap.getOrDefault(ch , 0) + 1);

            while(isContains(tMap , sMap)){             //MAIN IMP method is checking if values of key is equal or not in sMap
                // min = Math.min(min , (j-i+1));
                if((j-i+1) < min){
                    min = j-i+1;
                    start = i;
                    end = j;
                }

                char startCh = s.charAt(i);
                sMap.put(startCh , sMap.get(startCh) - 1); 
                if(sMap.get(startCh) == 0)
                    sMap.remove(startCh);

                i++;
            }
            j++;
        }
        return min == Integer.MAX_VALUE ? "" : s.substring(start , end+1);
    }

    static boolean isContains(HashMap<Character , Integer> tMap ,HashMap<Character , Integer> sMap){
        for(char key : tMap.keySet()){
            if(! sMap.containsKey(key))
                return false;
            if(tMap.get(key) > sMap.get(key))
                return false;
        }
        return true;
    }
}


//               i
//                         j
//input - s = "A D O B E C O D E B A N C", t = "ABC"
//output - "BANC"

//tmap = a b c
//smap = a d o b e c
//min = 6 ......and so on dry run.




// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public String minWindow(String s, String t) {
//         HashMap<Character , Integer> sMap = new HashMap<>(26);
//         HashMap<Character , Integer> tMap = new HashMap<>(26);

//         if(t.length() > s.length())
//             return "";
        
//         for(int k=0;k<t.length();k++){
//             char ch = t.charAt(k);
//             tMap.put(ch , tMap.getOrDefault(ch , 0) + 1);
//         }

//         int i = 0;
//         int j = 0;
//         int min = Integer.MAX_VALUE;
//         int start = 0;
//         int end = 0;

//         while(j < s.length()){
//             char ch = s.charAt(j);
//             sMap.put(ch , sMap.getOrDefault(ch , 0) + 1);

//             while(isContains(tMap , sMap)){
//                 if( (j-i+1) < min){
//                     min = j-i+1;
//                     start = i;
//                     end = j;
//                 }

//                 char startCh = s.charAt(i);
//                 sMap.put(startCh , sMap.get(startCh) - 1);
//                 if(sMap.get(startCh) == 0)
//                     sMap.remove(startCh);
                
//                 i++;
//             }
//             j++;
//         }
//         return min == Integer.MAX_VALUE ? "" : s.substring(start , end+1);
//     }

//     static boolean isContains(HashMap<Character , Integer> tMap, HashMap<Character , Integer> sMap){
//         for(char key : tMap.keySet()){
//             if(! sMap.containsKey(key))
//                 return false;
//             if(tMap.get(key) > sMap.get(key))
//                 return false;
//         }
//         return true;
//     }
// }