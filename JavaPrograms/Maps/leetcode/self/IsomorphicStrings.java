//QUES - https://leetcode.com/problems/isomorphic-strings/description/

package Maps.leetcode.self;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class IsomorphicStrings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string s : ");
        String s = sc.next();
        System.out.print("Enter string t : ");
        String t = sc.next();

        System.out.println(checkIsomorphicStrings(s , t));
    }

    static boolean checkIsomorphicStrings(String s , String t){
        HashMap<Character , Character> map1 = new HashMap<>(256);    //create two hashmap one will store (String s as key : string t as value).
        HashMap<Character , Character> map2 = new HashMap<>(256);    //and other will store (String t as key : string s as value). (VICE-VERSA).

        if(s.length() != t.length())
            return false;

        for(int i=0;i<s.length();i++){
            char sCh = s.charAt(i);
            char tCh = t.charAt(i);

            if(map1.containsKey(sCh)){
                if(map1.get(sCh) != tCh)
                    return false;
                else
                    continue;
            }
            
            if(map2.containsKey(tCh)){
                if(map2.get(tCh) != sCh)
                    return false;
                else
                    continue;
            }

            map1.put(sCh , tCh);
            map2.put(tCh , sCh);
        }
        return true;
    }
}

//              i
//                                j
//input - s : " b a d c " , t : " b a b a "
//output - false

//                  i
//                                   j
//input - s : " e g g  " , t : " a d d "
//output - true

//                  i
//                                  j
//input - s : " f o o " , t : " b a r"
//output - false



// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         HashMap<Character , Character> map1 = new HashMap<>(256);
//         HashMap<Character , Character> map2 = new HashMap<>(256);

//         if(s.length() != t.length())
//             return false;

//         for(int i=0;i<s.length();i++){
//             char sCh = s.charAt(i);
//             char tCh = t.charAt(i);

//             if(map1.containsKey(sCh)){
//                 if(map1.get(sCh) != tCh)
//                     return false;
//                 else
//                     continue;
//             }
            
//             if(map2.containsKey(tCh)){
//                 if(map2.get(tCh) != sCh)
//                     return false;
//                 else
//                     continue;
//             }

//             map1.put(sCh , tCh);
//             map2.put(tCh , sCh);
//         }
//         return true;
//     }
// }

