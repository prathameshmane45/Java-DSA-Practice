public class ArrayLength {
    public static void main(String args[]){
        int arr[] = {11,22,33,44,55,66,77,88,99};
        System.out.println("the length of the array is : "+arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        String str[] = {"Kabir", "Pratik", "Dhanarj", "Prathamesh", "Ramjan", "zaid"};
        System.out.println("The size of the String array is : "+str.length);
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]+" ");
        }
    }
}
