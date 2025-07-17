import java.util.*;
public class ReverseArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        // revarr(arr);
        for(int j=arr.length-1;j>=0;j--){
            System.out.println("arr["+j+"] = "+arr[j]);
            // System.out.print("["+arr[j]+"]");
        }
    }
    // public static void revarr(int arr[]){
    //     for(int i=arr.length-1;i>=0;i--){
    //         System.out.println(arr[i]);
    //     }
    // }
}
