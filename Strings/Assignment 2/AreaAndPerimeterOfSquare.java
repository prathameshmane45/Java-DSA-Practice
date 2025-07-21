import java.util.Scanner;

public class AreaAndPerimeterOfSquare {
     public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter side of square : ");
       int length = sc.nextInt();
       System.out.println("Area of the square is: "+ (length*length));
       System.out.println("Perimeter of the square is: "+ (4*length));
    }
}
