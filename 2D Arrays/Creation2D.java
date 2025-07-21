import java.util.*;
public class Creation2D{
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

        // output 
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                 System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}