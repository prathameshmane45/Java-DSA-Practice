import java.util.*;
public class CopyArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        int b[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            b[i] = arr[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("b[ "+i+" ] = "+b[i]);
        }
    }
}
