public class palindrome {
    public static void palindromPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int k=1+1;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        palindromPattern(5);
    }
    
}
