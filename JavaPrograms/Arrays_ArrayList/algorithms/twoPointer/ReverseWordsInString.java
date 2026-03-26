//QUES - https://leetcode.com/problems/reverse-words-in-a-string/

package Arrays_ArrayList.algorithms.twoPointer;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class ReverseWordsInString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String s = sc.nextLine();
        System.out.println(reverseWords(s));
    }

    static String reverseWords(String s){
        // String ans = "";
        s = s.trim().replaceAll("\\s+" , " ");
        String[] arr = s.split(" ");
        int start = 0;
        int end = arr.length-1;
        
        while(end > start){
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
        //OR
        return String.join(" ",arr);
        
        //OR
        // for(int i=0;i<arr.length;i++){
        //     ans = ans + " " + arr[i];
        // }
        // return ans.trim();

        //OR
        // StringBuilder sb = new StringBuilder();
        // for(String str : arr){
        //     sb.append(str).append(" ");
        // }
        // return sb.toString().trim();
    }
}

//         start
//                     end
//input - "the sky is blue"
//output - "blue is sky the"


// ----------------------------------------LEETCODE SOL-----------------------------------------
// class Solution {
//     public String reverseWords(String s) {
//         s = s.trim().replaceAll("\\s+" , " ");
//         String[] arr = s.split(" ");
//         int start = 0;
//         int end = arr.length-1;
        
//         while(end > start){
//             String temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
        
//         return String.join(" ",arr);
//         // StringBuilder sb = new StringBuilder();
//         // for(String str : arr){
//         //     sb.append(str).append(" ");
//         // }
//         // return sb.toString().trim();
//     }
// }

