import java.util.*;
import java.lang.ArithmeticException;

public class exceptional_handling {
    public static void main(String[] args) {
        System.out.println("main method started");
        int a = 10;
        int b = 0;
        int c;

        try {
            c = a / b;
            System.out.println(c);

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("main method ends");
    }

}
