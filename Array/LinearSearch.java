import java.util.*;
public class LinearSearch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int index = Linear(arr, 20);
        if(index == -1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Index of Key : "+index);
        }
    }
    public static int Linear(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}