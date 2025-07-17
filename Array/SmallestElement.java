import java.util.*;
public class SmallestElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int minElement = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < minElement){
                minElement = arr[i];
            }
        }
        System.out.println("The smallest Element in an array is : "+minElement);
        }
}
