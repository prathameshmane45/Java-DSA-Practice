public class HollowRectangle {
    public static void main(String args[]){
            Hollow(50, 40);
    }
    public static void Hollow(int totcol, int totrow){
        for(int i=1;i<=totrow;i++){
            for(int j=1;j<=totcol;j++){
                if(i==1 || i==totrow || j==1 || j==totcol){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
