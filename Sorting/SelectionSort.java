import java.util.*;
public class SelectionSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the size of an array : ");
        // int size = sc.nextInt();

        // int arr[] = new int[size];

        // for(int i=0;i<arr.length;i++){
        //     arr[i] = sc.nextInt();
        // }
        int arr[] = {5,4,1,3,2};
        Selection(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    
    }
    public static void Selection(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minpos = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[minpos] > arr[j]){
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }
    // public static void printarr(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    // }
}
