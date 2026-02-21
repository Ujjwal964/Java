//QUES - https://leetcode.com/problems/reverse-string/description/
//SOURCE - CTO Bhaiya (https://youtu.be/Yi90cuHYyWQ?si=vTj3d-g-akP6ykDn)

package Arrays_ArrayList.algorithms.twoPointer;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------
//TWO POINTER APPROACH (0(1)) space complexity

public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] chr = new char[5];
        System.out.print("Enter characters : ");
        for(int i=0;i<chr.length;i++){
            chr[i] = sc.next().charAt(0);
        }

        System.out.println("Given Array : "+Arrays.toString(chr));
        reverseString(chr);
        System.out.println("Reversed Array : "+Arrays.toString(chr));
    }

    static void reverseString(char[] chr){
        int start = 0;
        int end = chr.length-1;

        while(end > start){
            char temp = chr[start];
            chr[start] = chr[end];
            chr[end] = temp;
            end--;
            start++;
        }
    }
}

// Input: ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]



// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public void reverseString(char[] s) {
//         int start = 0;
//         int end = s.length-1;

//         while(end > start){
//             char temp = s[start];
//             s[start] = s[end];
//             s[end] = temp;
//             end--;
//             start++;
//         }
//     }
// }