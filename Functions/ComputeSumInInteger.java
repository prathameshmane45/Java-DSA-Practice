import java.util.*;
public class ComputeSumInInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("The sum of Digits in "+n+" = "+sum(n));
    }
    public static int sum(int n){
        int s = 0;
        while(n>0){
            int rem = n % 10;
            s = s+rem;
            n = n/10;
        }
        return s;
    }
}
