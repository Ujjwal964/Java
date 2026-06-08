//QUES - https://leetcode.com/problems/first-unique-character-in-a-string/description/

package Maps.leetcode.self;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class UniCharInString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String s = sc.nextLine();
        System.out.println(firstUniChar(s));
    }
    
    static int firstUniChar(String s){
        // char unique = '\0';
        Map<Character , Integer> map = new LinkedHashMap<>(26);
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch , map.getOrDefault(ch , 0) + 1);
        }
        
        for(Map.Entry<Character , Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return s.indexOf(entry.getKey());
                // unique = entry.getKey();
                // break;
            }
        }
        return -1;
    }
}

//input - "leetcode" / "loveleetcode"
//output - 0 (l at 0th index is only unique letter) / 2 ( v at 2th index is only unique letter).



// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int firstUniqChar(String s) {
//         Map<Character , Integer> map = new LinkedHashMap<>(26);
        
//         for(int i=0;i<s.length();i++){
//             char ch = s.charAt(i);
//             map.put(ch , map.getOrDefault(ch , 0) + 1);
//         }
//         System.out.println(map);
        
//         for(Map.Entry<Character , Integer> entry : map.entrySet()){
//             if(entry.getValue() == 1){
//                 return s.indexOf(entry.getKey());
//             }
//         }
//         return -1;
//     }
// }


//OR
// class Solution {
//     public int firstUniqChar(String s) {
//         char[] arr = s.toCharArray();
//         Map<Character,Integer> map = new LinkedHashMap<>(26);
//         Queue<Character> queue = new LinkedList<>();
//         for(char c : arr){
//             if(map.containsKey(c)){
//                 if(queue.contains(c))
//                     queue.remove(c);
//             }
//             else{
//                 map.put(c , 1);
//                 queue.offer(c);
//             }
//         }
//         return (! queue.isEmpty()) ? s.indexOf(queue.poll()) : -1;
//     }
// }


//OR
// class Solution {
//     public int firstUniqChar(String s) {
//         char[] arr = s.toCharArray();
//         Map<Character,Integer> map = new LinkedHashMap<>(26);
//         Queue<Character> queue = new LinkedList<>();
//         for(char c : arr){
//             map.put(c , map.getOrDefault(c , 0 ) + 1);

//             if(map.get(c) == 1)
//                 queue.offer(c);
//             else{
//                 if(queue.contains(c))
//                     queue.remove(c);
//             }
//         }
//         return (! queue.isEmpty()) ? s.indexOf(queue.poll()) : -1;
//     }
// }
