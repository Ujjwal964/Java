package basics.assignments.veryBasics;
import java.util.*;

public class GreetingMsg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name : ");
        String name = sc.nextLine();

        System.out.println("Good Afternoon "+name+",\n I hope you are doing well!");
    }
}
