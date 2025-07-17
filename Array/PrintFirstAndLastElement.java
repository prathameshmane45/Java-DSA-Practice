import java.util.*;
public class PrintFirstAndLastElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("First Element in array is : "+arr[0]);
        System.out.println("Last Element in array is : "+arr[arr.length-1]);
    }
}
