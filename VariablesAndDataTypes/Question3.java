package VariablesAndDataTypes;
import java.util.*;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of the pen : ");
        float pen = sc.nextFloat();
        System.out.print("Enter the amount of the pencile : ");
        float pencile = sc.nextFloat();
        System.out.print("Enter the amount of the eraser : ");
        float eraser = sc.nextFloat();

        float total = pen+pencile+eraser;
        System.out.println(("Total amount = "+total));

        float nextTotal = total + (0.18f*total);
        System.out.print("Total amount with GST = "+nextTotal);


    }
}
