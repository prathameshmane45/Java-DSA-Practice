import java.util.*;
public class prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        if(n == 2){
            System.out.println(n+" is a prime ");
        }
        else{
            boolean isprime = true;
            for(int i=2;i<=n-1;i++){
                if(n%i==0){
                    isprime = false;
                }
            }
            if(isprime == true){
                System.out.println(n+" is a prime number ");
            } else{
                System.out.println(n+" is a not prime number ");
            }
        }
        
    }
    
}
