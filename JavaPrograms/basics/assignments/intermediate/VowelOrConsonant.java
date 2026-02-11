package basics.assignments.intermediate;
import java.util.*;

public class VowelOrConsonant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any alphabet : ");
        char ch = sc.next().trim().toLowerCase().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                System.out.println(ch+" is a Vowel.");
            else
                System.out.println(ch+" is a consonant.");
        }
        else
            System.out.println("Please enter alphabet.");
    }
}
