public class FirstOccurance {
    public static void main(String[] args) {
        int arr[] = {1,2,5,4,5,6,5,7,8};
        System.out.println(first(arr, 10, 0));
        
    }
    public static int first(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return first(arr, key, i+1);
    }
}
