// KMP / LPS - Longest Prefix Suffix Algorithm used to find the largest prefix suffic subarray from array
// matching string patter like [a,b,c,e,d,a,b,c,e] here largest is : "a,b,c,e" from prefix and suffix both.
//String specific, designed to find longest proper prefix/suffix from string array, compares structure.
// uses prefix suffix to work.

package Arrays_ArrayList.algorithms.kmpLpsAlgo;
import java.util.*;

// -------------------------------WITHOUT USING - BRUTE FORCE ( O(N2) )-------------------------
public class LargestPrefixSuffix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] str = {"a","b","a","b","a","b","a"};
        System.out.println("Given array is : "+Arrays.toString(str));
        
        String[] prefix = new String[str.length];
        prefix[0] = str[0];
        for(int i=1;i<str.length;i++){
            prefix[i] = prefix[i-1] + str[i];
        }
        System.out.println("Prefix array is : "+Arrays.toString(prefix));
        
        String[] suffix = new String[str.length];
        suffix[str.length-1] = str[str.length-1];
        for(int i=str.length-2;i>=0;i--){
            suffix[i] = str[i] + suffix[i+1];
        }
        System.out.println("Suffix array is : "+Arrays.toString(suffix));
        
        int max = 0;
        for(int i=0;i<prefix.length-1;i++){
            for(int j=1;j<suffix.length;j++){
                if(prefix[i].equals(suffix[j]))
                    max = Math.max(max , prefix[i].length());
            }
        }
        System.out.println("Largest Prefix Suffix is : "+max);
    }
}



// ---------------------------------- USING - KMP / LPS ( O(N2) )------------------------------
