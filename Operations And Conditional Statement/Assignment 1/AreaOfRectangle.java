import java.util.Scanner;

public class AreaOfRectangle {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int len = sc.nextInt();
        System.out.print("Enter the bredth : ");
        int bred = sc.nextInt();
        System.out.println("Area of rectangle : "+len*bred);
    }
}
