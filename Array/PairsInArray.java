import java.util.*;
public class PairsInArray {
    public static void pairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr = arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+curr+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        pairs(arr);
    }
}
