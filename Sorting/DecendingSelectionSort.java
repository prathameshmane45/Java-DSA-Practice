import java.util.*;

public class DecendingSelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        DecendingSelection(arr);
        printarr(arr);
    }
    public static void DecendingSelection(int arr[]){
        for(int i=0;i<arr.length;i++){
            int maxpos = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[maxpos] < arr[j]){
                    maxpos = j;
                }
            }
            int temp = arr[maxpos];
            arr[maxpos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
