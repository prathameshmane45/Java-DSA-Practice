public class fibonaccSeries {
    public static void main(String[] args) {
        System.out.println(fib(40));
    }
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fibn = fnm1+fnm2;
        return fibn;

    }
}
