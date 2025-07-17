public class LastOccurance {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,2,3,2};
        System.out.println(last(arr, 2, 0));
    }
    public static int last(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isfound = last(arr, key, i+1);
        if(isfound != -1){
            return isfound;
        }
        if(arr[i] == key){
            return i;
        }
        return last(arr, key, i+1);
    }
}
