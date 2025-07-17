import java.util.*;
public class GreatestElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int maxNum = Integer.MIN_VALUE;
        for(int j=0;j<arr.length;j++){
            if(arr[j] > maxNum){
                maxNum = arr[j];
            }
        }
        System.out.println("The maximum number in the array is : "+maxNum);
    }
}
