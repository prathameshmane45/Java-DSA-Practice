import java.util.Scanner;

public class ReverseTheDigit {
   public static void main(String[] args) { 
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // String str = String.valueOf(num);
        // char fdigit = str.charAt(0);
        // char sDigit = str.charAt(1);
        // int first = Character.getNumericValue(fdigit);
        // int second = Character.getNumericValue(sDigit);
        // System.out.print(sDigit);
        // System.out.print(fdigit);
        
        int tens = num /10;
        int ones = num % 10;
        
        int reversed = ones *10 + tens;
        System.out.printf("%02d\n", reversed);
        sc.close();
        
        
    } 
}
