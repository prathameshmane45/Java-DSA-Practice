package Loops;
import java.util.*;
public class Question2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number;
        int choise;
        int evensum = 0;
        int oddsum = 0;
        do {
            System.out.println("Enter the number : ");
            int num = sc.nextInt();

            if(num % 2 == 0) {
                evensum += num;
            } else{
                oddsum += num;
            }

            System.out.println("If you want to continue press 1 else press 0");
            System.out.println("Enter choise : ");
            choise = sc.nextInt();
        } while(choise == 1);
            System.out.println("Even sum = "+evensum);
            System.out.println("odd sum = "+oddsum);
        
       
    }
}
