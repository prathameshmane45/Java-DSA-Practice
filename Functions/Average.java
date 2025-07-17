import java.util.*;
public class Average {
    public static int avg(int a, int b, int c){
        int avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the Second number : ");
        int b = sc.nextInt();
        System.out.println("Enter the third number : ");
        int c = sc.nextInt();

        System.out.println("The average of "+a+" , "+b+" & "+c+" = "+avg(a, b, c));
    }
}
