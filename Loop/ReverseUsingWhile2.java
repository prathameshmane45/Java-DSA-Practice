import java.util.*;
public class ReverseUsingWhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int rev = 0;
        while(n>0){
            int rem = n % 10;
            rev = (rev * 10) + rem;
            n /= 10;
        }
        System.out.println("reverse number = "+rev);
    }
    
}
