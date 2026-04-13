//QUES - https://leetcode.com/problems/group-anagrams/description/
//SOURCE - https://youtu.be/C9V66KyZCP8?si=MUVJkndsd7IWODBP

package Maps.leetcode.self;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class GroupAnagrams{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[6];
        System.out.print("Enter array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.next();
        }
        System.out.println(groupAnagrams(arr));
    }
    
    //BETTER APPROACH (SORTING THEN COMPARING IN MAP) (NIKHIL LOHIA)✅
    //since after sorting string becomes same so if there is anagram then after sort two strings will look equal same.
    static List<List<String>> groupAnagrams(String[] arr){
        List<List<String>> list = new ArrayList<>();
        HashMap<String , List<String>> map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            char[] charArray = arr[i].toCharArray();
            Arrays.sort(charArray);
            String s = new String(charArray);

            //EITHER THIS
            map.computeIfAbsent(s , k -> new ArrayList<>()).add(arr[i]);

            //OR
            // if(map.containsKey(s))
            //     map.get(s).add(arr[i]);
            // else{
            //     List<String> temp = new ArrayList<>();
            //     temp.add(arr[i]);
            //     map.put(s,temp);
            // }
        }
        
        for(List<String> value : map.values()){
            list.add(value);
        }
        
        return list;
    }
}

//input - [ eat tea tan ate nat bat ]
//output - [[eat, tea, ate], [bat], [tan, nat]]



// ------------------------------------------LEETCODE SOL---------------------------------------------

//BETTER APPROACH (SORTING THEN COMPARING IN MAP) (NIKHIL LOHIA)✅
// class Solution {
//     public List<List<String>> groupAnagrams(String[] arr) {
//         List<List<String>> list = new ArrayList<>();
//         HashMap<String , List<String>> map = new HashMap<>();
        
//         for(int i=0;i<arr.length;i++){
//             char[] charArray = arr[i].toCharArray();
//             Arrays.sort(charArray);
//             String s = new String(charArray);

//             if(map.containsKey(s))
//                 map.get(s).add(arr[i]);
//             else{
//                 List<String> temp = new ArrayList<>();
//                 temp.add(arr[i]);
//                 map.put(s,temp);
//             }
//         }
        
//         for(List<String> value : map.values()){
//             list.add(value);
//         }
        
//         return list;
//     }
// }