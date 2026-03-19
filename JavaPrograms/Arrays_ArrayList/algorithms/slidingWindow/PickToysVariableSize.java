//QUES - Problem Description: Not at any platform, it was an interview problem.(similar to max fruits question of leetcode).
// John is at a toy store help him pick maximum number of toys. He can only select in a continuous manner and he can select only two types of toys.

package Arrays_ArrayList.algorithms.slidingWindow;
import java.util.*;

public class PickToysVariableSize {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter toys string : ");
        String s = sc.next();

        System.out.println(pickMaxToys(s));
    }
    
    static String pickMaxToys(String s){
        HashMap<Character , Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;

        while(j < s.length()){
            char ch = s.charAt(j);
            map.put(ch , map.getOrDefault(ch , 0) + 1);

            if(map.size() < 2)
                j++;
            else if(map.size() == 2){
                if((j-i+1) > max){
                    max = j-i+1;
                    start = i;
                    end = j+1;
                }
                // max = (j-i+1) > max ? (j-i+1) : max;
                j++;
            }
            else if(map.size() > 2){

                while(map.size() > 2){
                    char chr = s.charAt(i);
                    map.put(chr , map.get(chr) - 1);
                    if(map.get(chr) == 0)
                        map.remove(chr);
                    i++;
                }
                j++;
            }
        }
        System.out.println(max);
        return s.substring(start , end);
    }
}

//            i
//                j  
//input - a b a c c a b
//output - acca (since max toys can be here with atmost of 2 types(a,c)).
