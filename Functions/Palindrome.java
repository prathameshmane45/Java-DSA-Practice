import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if(isPalindrome(n)){
            System.out.println("Number is Palindrome");
        } else{
            System.out.println("Number is not Palindrome");
        }
    }
    public static boolean isPalindrome(int n){
        int pal = n;
        int rev = 0;
        while(n>0){
            int rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }
        if(pal == rev){
            return true;
        }
        else{
            return false;
        }
    }
    
}
