//QUES - https://neetcode.io/problems/valid-word-abbreviation/question?list=neetcode250
//SOURCE - CTO Bhaiya (https://youtu.be/Yi90cuHYyWQ?si=vTj3d-g-akP6ykDn)

package Arrays_ArrayList.algorithms.twoPointer;
import java.util.*;

public class ValidWordAbbreviation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word : ");
        String word = sc.nextLine();
        System.out.print("Enter Abbreviation : ");
        String abbr = sc.nextLine();

        System.out.println("Valid Abbreviation : "+validAbbreviation(word , abbr));
    }

    static boolean validAbbreviation(String word , String abbr){
        int i = 0;
        int j = 0;

        if(word.equals(abbr))
            return true;

        while(i < word.length() && j < abbr.length()){
            char wc = word.charAt(i);
            char ac = abbr.charAt(j);
            
            if(Character.isDigit(ac)){
                if(ac == '0')
                    return false;
                int curr = 0;
                while(j < abbr.length() && Character.isDigit(abbr.charAt(j))){  //converting j position char to number.
                    curr = (curr * 10) + (abbr.charAt(j) - '0');
                    j++;
                }
                i = i + curr;
            }
            else if(ac == wc){
                i++;
                j++;
            }
            else
                return false;
        }
        return i == word.length() && j == abbr.length();
    }
}

//word = "apple", abbr = "a3e"
// output - true

//word = "international", abbr = "i9l"
//output - false