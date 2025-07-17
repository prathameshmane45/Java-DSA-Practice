import java.util.*;
public class CheckPrime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if(isprime(n)){
            System.out.println("Number is prime");
        } else{
            System.out.println("Number is not prime");
        }
    }
    public static boolean isprime(int n){
        if(n == 2){
            return true;
        } 
        for(int i=2;i<=n-1;i++){
            if(n % i == 0 ){
                return false;
            }
        }
        return true;
    }
    
}
