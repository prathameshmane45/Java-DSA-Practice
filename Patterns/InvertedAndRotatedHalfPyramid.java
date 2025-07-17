public class InvertedAndRotatedHalfPyramid {
    public static void Inverted(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;i<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Inverted(4);
    }
    
    
}
