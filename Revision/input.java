import java.util.*;
public class input{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value for a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value for b: ");
        int b = sc.nextInt();
        System.out.print("Enter the value for c: ");
        int c = sc.nextInt();

        int avg = (a + b + c)/3;
        System.out.println("Avg : "+avg);

    }
}