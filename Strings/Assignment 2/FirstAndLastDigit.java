import java.util.Scanner;

public class FirstAndLastDigit {
     public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter 4 digit number : ");
       int a = sc.nextInt();
       System.out.println(a/1000);
       System.out.println(a%10);
       
    }
}
