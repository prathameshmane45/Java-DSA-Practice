import java.util.Scanner;

public class PerimeterOfRectangle {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int len = sc.nextInt();
        System.out.print("Enter the breadth : ");
        int bred = sc.nextInt();
        System.out.println(2*(len+bred));
    }
}
