public class PrintNumbersFromNto1{
    public static void main(String[] args) {
        printDec(10);
    }
    public static void printDec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        printDec(n-1);
    }
}