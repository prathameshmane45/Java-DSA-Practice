import java.util.*;
public class Binomial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();
        System.out.println("Enter value of r : ");
        int r = sc.nextInt();
        System.out.println("The Binomial coefficant = "+binomial(n, r));
    }
    public static int facto(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact * i;
        }
        return fact;
    }
    public static int binomial(int n, int r){
        int fact_n = facto(n);
        int fact_r = facto(r);
        int fact_nmr = facto(n-r);

        return fact_n / (fact_r * fact_nmr);
    }
}
