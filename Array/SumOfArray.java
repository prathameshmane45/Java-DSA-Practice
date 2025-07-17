import java.util.*;
public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();
        int sum = 0;
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println("The sum of the array is : "+sum);

    }
}
