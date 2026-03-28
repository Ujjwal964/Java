//QUES - https://leetcode.com/problems/sort-characters-by-frequency/description/

package Maps.leetcode.self;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class SortCharByFreq {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string s : ");
        String s = sc.next();
        System.out.println(sortFreqInDes(s));
    }

    static String sortFreqInDes(String s){
        HashMap<Character , Integer> map = new HashMap<>(256);
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch , map.getOrDefault(ch , 0) + 1);
        }

        List<Map.Entry<Character , Integer>> list = new ArrayList<>(map.entrySet());    //converting to list , since in map we cant directly sort values ( we can try for keys but can't for values)
        list.sort((a,b) -> b.getValue() - a.getValue());                //using lambda func(here it's using comparator functional interface in backside and doing in descending order).
        //or can also use this
        // list.sort((a,b) -> Integer.compare(b.getValue() , a.getValue()));

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character , Integer> entry : list){
            char key = entry.getKey();
            int value = entry.getValue();

            for(int i=0;i<value;i++){
                sb.append(key);
            }
        }
        return sb.toString();
    }
}

//input - " t r e e"
//output - "eert" (and eetr is also valid)


// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public String frequencySort(String s) {
//         HashMap<Character , Integer> map = new HashMap<>(256);
//         for(int i=0;i<s.length();i++){
//             char ch = s.charAt(i);
//             map.put(ch , map.getOrDefault(ch , 0) + 1);
//         }

//         List<Map.Entry<Character , Integer>> list = new ArrayList<>(map.entrySet());
//         list.sort((a,b) -> b.getValue() - a.getValue());

//         StringBuilder sb = new StringBuilder();
//         for(Map.Entry<Character , Integer> entry : list){
//             char key = entry.getKey();
//             int value = entry.getValue();

//             for(int i=0;i<value;i++){
//                 sb.append(key);
//             }
//         }
//         return sb.toString();
//     }
// }