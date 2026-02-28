//QUES - using exception handling, check if entered number is valid or not as per some scenairos
// SOURCE (company assessment)

package ExceptionHandling;
import java.util.*;

public class ValidMobilePhoneNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a mobile number : ");
        String n = sc.next();

        try{
            if(n.length() < 10)
                throw new IllegalArgumentException("You have entered less than 10 digits");
            else if(n.length() > 10)
                throw new IllegalArgumentException("You have entered more than 10 digits");
            else
                validPhoneNumber(n);
        }
        catch(IllegalArgumentException iae){
            System.out.println(iae);
        }
    }

    static void validPhoneNumber(String n){
        for(int i=0;i<n.length();i++){
            char ch = n.trim().charAt(i);
            if(! Character.isDigit(ch)){
                throw new IllegalArgumentException("You have entered a character/special character instead of a digit.");
            }
        }
        System.out.println("Valid Mobile Number.");
    }
}
