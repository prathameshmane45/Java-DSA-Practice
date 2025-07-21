import java.util.*;
public class Search {
    public static boolean Search2d(int matrix[][], int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    System.out.println("key found at ["+i+","+j+"]");
                    return true;
                }
            }
        }
        System.out.println("key does not found");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of column : ");
        int col = sc.nextInt();
        System.out.print("Enter the size of row : ");
        int row = sc.nextInt();

        int matrix [][] = new int[row][col];
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the key which you want to search : ");
        int key = sc.nextInt();

        System.out.println(Search2d(matrix,key));
    }
}
