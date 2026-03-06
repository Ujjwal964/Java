//QUES - https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
//SOURCE - Aditya Verma (https://youtu.be/MW4lJ8Y0xXk?si=w8mP7Dl7P99FUM06) / Nikhil Lohia (https://youtu.be/egPDpu26q0M?si=s58y0uW_n0HVYHhd)

package Arrays_ArrayList.algorithms.slidingWindow;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class AllAnagramsInString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string (lowercase) : ");
        String s = sc.nextLine();
        System.out.print("Enter anagram string (lowercase) : ");
        String p = sc.nextLine();

        System.out.println(findAnagrams(s , p));
    }

    //USING ARRAYS + SLIDING WINDOW APPROACH (nikhil lohia)
    // static ArrayList<Integer> findAnagrams(String s , String p){
    //     ArrayList<Integer> ans = new ArrayList<>();     //for returning ans, as in ques.
    //     int[] sCount = new int[26];                     //creating 2 arrays to store char count of each string at their resp index.
    //     int[] pCount = new int[26];
    //     int start = 0;                                  //for sliding window.
    //     int end = 0;

    //     if(p.length() > s.length())
    //         return new ArrayList<>();

    //     for(int i=0;i<p.length();i++){              //Storing p string(string to find anagram)every value in an array and their index and increasing count as per occurence.
    //         char ch = p.trim().charAt(i);
    //         pCount[ch - 'a']++;
    //     }

    //     while(end < s.length()){
    //         sCount[s.charAt(end) - 'a']++;          //Storing s string(string to look for anagram)every value in an array and their index and increasing count as per occurence.

    //         if(end-start+1 < p.length())
    //             end++;

    //         else if(end-start+1 == p.length()){

    //             if(Arrays.equals(sCount , pCount))      //comparing and checking if both arrays are same means char count is same and exact char as available so adding into ans list.
    //                 ans.add(start);

    //             sCount[s.charAt(start) - 'a']--;        //removing first i element as window slides forward by 1 , a new element get added and first one gets removed.
    //             start++;                                //sliding the window.
    //             end++;
    //         }
    //     }
    //     return ans;
    // }


    //USING HASHMAP + SLIDING WINDOW APPROACH (aditya verma) - big n more steps approach
    static ArrayList<Integer> findAnagrams(String s , String p){
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Character , Integer> sMap = new HashMap<>(26);
        HashMap<Character , Integer> pMap = new HashMap<>(26);
        int i = 0;
        int j = 0;
        int sSize = s.length();
        int pSize = p.length();
        int count = 0;

        if(pSize > sSize)
            return new ArrayList<>();

        for(int a=0;a<pSize;a++){
            char ch = p.charAt(a);
            pMap.put(ch , pMap.getOrDefault(ch , 0) + 1);
                    // Or
            // if(pMap.containsKey(ch))
            //     pMap.put(ch , pMap.get(ch) + 1);
            // else
            //     pMap.put(ch , 1);
        }

        while(j < sSize){
            char ch = s.charAt(j);
            sMap.put(ch , sMap.getOrDefault(ch , 0) + 1);

            if(j-i+1 < pSize)
                j++;

            else if(j-i+1 == pSize){
                if(pMap.equals(sMap)){
                    count++;
                    list.add(i);
                }

                sMap.put(s.charAt(i) , sMap.get(s.charAt(i)) - 1);
                if(sMap.get(s.charAt(i)) == 0)
                    sMap.remove(s.charAt(i));
                i++;
                j++;
            }
        }
        System.out.println("Total Anagrams in given string is : "+ count);
        return list;
    }
}

//input s - cbaebabacd | p - abc (find p anagrams in s).
//outpit - count - 2 | index : [0 , 6] (start index).





// ----------------------------------------LEETCODE SOL-----------------------------------------
//USING ARRAYS + SLIDING WINDOW APPROACH

// class Solution {
//     public List<Integer> findAnagrams(String s, String p) {
//         ArrayList<Integer> list = new ArrayList<>();
//         int[] sCount = new int[26];
//         int[] pCount = new int[26];
//         int i = 0;
//         int j = 0;
//         int sSize = s.length();
//         int pSize = p.length();

//         if(pSize > sSize)
//             return new ArrayList<>();
        
//         for(int a=0;a < pSize; a++){
//             char ch = p.charAt(a);
//             pCount[ch - 'a']++;
//         }    
        
//         while(j < sSize){
//             sCount[s.charAt(j) - 'a']++;

//             if(j-i+1 < pSize)
//                 j++;

//             else if(j-i+1 == pSize){

//                 if(Arrays.equals(sCount , pCount))
//                     list.add(i);

//                 sCount[s.charAt(i) - 'a']--;
//                 i++;
//                 j++;
//             }
//         }
//         return list;
//     }
// }