public class TillingProblem {
    public static void main(String args[]){
        System.out.println(tilling(20));
    }
    public static int tilling(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        //vertical choise
        int fnm1 = tilling(n-1);

        // horizontal Choise 
        int fnm2 = tilling(n-2);

        int totalchoise = fnm1 + fnm2;
        return totalchoise;
    }
    
}
