import java.util.*;
public class PrimeInRange {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        primeinrange(100);
    }
    public static boolean isprime(int n){
        if(n == 2){
            return true;
        }
        for(int i=2;i<n-1;i++){
            if(n % i == 0){
                return false;
            }
           
        }
        return true;
    }
    public static void primeinrange(int n){
        for(int i=2;i<=n;i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
