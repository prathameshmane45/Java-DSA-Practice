import java.util.*;
public class ReverseUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();

        while(n>0){
            int remainder = n %10;
            System.out.print(remainder);
            n = n/10;
        }
    }
}
