package Revision_Practise;
import java.util.*;

public class RandomQuesPractise {
    public static void main(String[] args){
        panagram();
    }

    
    static void panagram(){
        String s = "The quick brown fox jumps over the lazy dog";

        //First Approach
        // if(s.length() < 26) System.out.println( false);
        
        // for(char ch='a';ch<='z';ch++){
        //     if(s.indexOf(ch) < 0)
        //         System.out.println( false);
        // }
        // System.out.println( true);

        
        //Second Approach
        if(s.length() < 26) System.out.println( false);
        Set<Character> ans = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch = s.trim().toLowerCase().charAt(i);
            if(ch >= 'a' && ch <= 'z')
                ans.add(ch);
        }
        if(ans.size() < 26)
            System.out.println( false);
        else
            System.out.println( true);
    }
    
}
