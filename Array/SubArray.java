import java.util.*;
public class SubArray {
    public static void PrintsubArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
                
            }
            // System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the size of an array : ");
        // int size = sc.nextInt();

        // int arr[] = new int[size];
        // for(int i=0;i<arr.length;i++){
        //     arr[i] = sc.nextInt();
        // }
        int arr[] = {2,4,6,8,10};
        PrintsubArray(arr);
    }
    
}
