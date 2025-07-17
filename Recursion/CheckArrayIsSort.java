public class CheckArrayIsSort {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,8,5,6};
        if(isSorted(arr, 0)){
            System.out.println("array is sorted ");
        } else{
            System.out.println("Array is not sorted");
        }
    }
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
}
