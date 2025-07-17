import java.util.*;
public class PrintSumOfEvenFromArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        int evenSum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                evenSum += arr[i];
            }
        }
        System.out.println("the sum of the even numbers in the arry : "+evenSum);
    }
    
}
