package ConditionalStatement;
import java.util.*;
public class Question1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println(num+" is postive");
        }
        else if(num < 0){
            System.out.println(num+" is negative");

        }
        else{
            System.out.println("Number is Zero");
        }
    }
}
