package basics.practise;
import java.util.*;

public class CaseCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = sc.next().trim().charAt(0);


        // if(Character.toLowerCase(ch) == ch)
        // System.out.println("Lowercase value");

        // else if(Character.toUpperCase(ch) == ch)
        // System.out.println("Uppercase value");

//        ----------------OR-----------------

        if(ch>='a' && ch<='z')
        System.out.println("Lowercase");
        else if(ch>='A' && ch<='Z')
        System.out.println("UpperCase");
        else
        System.out.println("Not a letter");

    }
}
