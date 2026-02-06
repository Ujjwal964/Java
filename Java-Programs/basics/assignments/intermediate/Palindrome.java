package basics.assignments.intermediate;
import java.util.*;
// -----------------------------------------TAKING INT INPUT-------------------------------------------------

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int rev = 0;
        int n = num;

        while(n>0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        System.out.println("Reversed of Original Number : "+rev);

        if(rev == num)
            System.out.println(num+" is a Palindrome Number.");
        else
            System.out.println(num+" is not a Palindrome Number.");


        // ------------OR - WITH FOR LOOP--------------

        
        // for(int i=num;i>0;i/=10){
        //     int rem = i % 10;
        //     rev = rev * 10 + rem;
        // }

        // System.out.println("Reversed of Original Number : "+rev);

        // if(rev == num)
        //     System.out.println(num+" is a Palindrome Number.");
        // else
        //     System.out.println(num+" is not a Palindrome Number.");

    }
}


// ----------------------------------------TAKING STRING INPUT----------------------------------------------

// public class Palindrome{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter any string : ");
//         String str = sc.next().toLowerCase();

//         String rev = "";

//         for(int i=0;i<str.length();i++){
//             char ch = str.trim().charAt(i);
//             rev = ch + rev;
//         }
//         System.out.println("Initial String : "+str);
//         System.out.println("Reversed String : "+rev);

//         if(rev.equals(str))
//             System.out.println(str+" is a Palindrome String.");
//         else
//             System.out.println(str+" is not a Palindrome String.");
//     }
// }