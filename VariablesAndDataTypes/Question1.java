package VariablesAndDataTypes;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of A : ");
        int a = sc.nextInt();

        System.out.print("Enter value of B : ");
        int b = sc.nextInt();

        System.out.print("Enter value of C : ");
        int c = sc.nextInt();

        int avg = (a+b+c)/3;
        System.err.println("The average = "+avg);
    }
    
}
