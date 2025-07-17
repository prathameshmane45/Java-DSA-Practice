import java.util.*;
public class AverageOfArray {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the size of an array : ");
    //     int size = sc.nextInt();
    //     int sum = 0;
    //     int arr[] = new int[size];
    //     for(int i=0;i<size;i++){
    //         arr[i] = sc.nextInt();
    //     }
    //     for(int i=0;i<arr.length;i++){
    //         sum += arr[i];
    //     }
    //     int avg = sum / arr.length;
    //     System.out.println("The average of the array : "+avg);

    // }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of an Array : ");
        int size = sc.nextInt();
        int sum = 0;
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        float avg = sum / arr.length;
        System.err.println("Average : "+avg);
    }

}
