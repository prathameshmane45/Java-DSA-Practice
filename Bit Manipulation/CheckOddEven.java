import java.util.*;
public class CheckOddEven{
    public static void evenOrOdd(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("Even number");
        } else{
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        evenOrOdd(10);
        evenOrOdd(9);
        evenOrOdd(3);
        evenOrOdd(4);
        evenOrOdd(5);
    }
}