package basics.practise;
import java.util.*;

public class OverloadingExample {
    public static void main(String[] args){
        // int ans = sum(3,4);
        // System.out.println(ans);
        System.out.println(sum(3,4,5));
        sum(1,2,3,4,5,6);
        sum("Kunal","Ujjwal","Bansal","Hello","HEHE");
    }

    static int sum(int a , int b){              //OVERLOADING : func with same names but diff parameters count or return types.
        System.out.println("First one.");
        return a+b;
    }

    static int sum(int a , int b , int c ){
        System.out.println("Second one.");
        return a+b+c;
    }

    static void sum(int ...v){                  //VARIABLE LENGTH ARGUMENTS
        System.out.println("Third One.");
        System.out.println(Arrays.toString(v));
    }

    static void sum(String ...v){
        System.out.println("Fourth One.");
        System.out.println(Arrays.toString(v));
    }
    
}
