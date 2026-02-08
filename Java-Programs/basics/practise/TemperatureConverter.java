package basics.practise;
import java.util.*;

public class TemperatureConverter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature(in celsius) : ");
        float celsius = sc.nextFloat();

        System.out.println( convertTemp(celsius) );
    }

    static float convertTemp(float c){
        float f = ( c * 9/5) + 32;
        return f;
    }

}
