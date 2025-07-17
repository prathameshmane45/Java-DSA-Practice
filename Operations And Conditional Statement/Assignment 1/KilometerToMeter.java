import java.util.Scanner;

public class KilometerToMeter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Kilometer : ");
        double kilo = sc.nextDouble();
        double meter = kilo*1000;
        System.out.println((int)meter);
    }
}
