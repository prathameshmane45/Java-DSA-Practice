public class SumOfFirstNnaturalNumbers {
    public static void main(String[] args) {
        System.out.println(sum(5));
    } 
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        int fnm = sum(n-1);
        return n + fnm;
    }
}
