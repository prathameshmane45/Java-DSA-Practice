
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        int factorial = 1;

        for (int i=number;i<=1;i--){
             factorial = number * i;
        }
        System.out.println(factorial+" is  ");
    }
    
}
