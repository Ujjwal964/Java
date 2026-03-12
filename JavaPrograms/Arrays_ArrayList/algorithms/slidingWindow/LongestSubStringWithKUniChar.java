//QUES - GFG (https://www.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1)
//SOURCE - Aditya Verma (https://youtu.be/Lav6St0W_pQ?si=JorPdJWqVYTw5z0M)

package Arrays_ArrayList.algorithms.slidingWindow;
import java.util.*;

public class LongestSubStringWithKUniChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String s = sc.next();
        System.out.print("Enter Unique Char : ");
        int k = sc.nextInt();

        System.out.println(longestSubString(s , k));
    }

    static int longestSubString(String s , int k){
        HashMap<Character , Integer> map = new HashMap<>(26); 
        int i = 0;
        int j = 0;
        int longest = 0;

        while(j < s.length()){
            char ch = s.toLowerCase().charAt(j);
            map.put(ch , map.getOrDefault(ch , 0) + 1);

            if(map.size() < k)
                j++;

            else if(map.size() == k){
                longest = Math.max(longest , (j-i+1) );
                j++;
            }

            else if(map.size() > k){
                while(i <= j && map.size() > k){
                    char c = s.charAt(i);
                    map.put(c , map.get(c) - 1);

                    if(map.get(c) == 0)
                        map.remove(c);
                    i++;
                }

                if(map.size() == k)
                    longest = Math.max(longest , (j-i+1) );
                j++;
            }
        }
        return longest == 0 ? -1 : longest;
    }
}

//                i
//                            j
//input - a a b a c b e b e b e , k - 3(unique character to be in substring)
//no window size given , (Variable Size Sliding window question)
//output - 7 (longest substring length with k unique char , char can repeat but unique should be equal to k).