package basics.practise;
import java.util.*;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.nextLine();

        String rev="";

        for(int i=0;i<s.length();i++){
            char ch = s.trim().charAt(i);
            rev = ch + rev;
        }
        System.out.println("Inital String was : "+s);
        System.out.println("Reversed String is : "+rev);
    }
    
}
