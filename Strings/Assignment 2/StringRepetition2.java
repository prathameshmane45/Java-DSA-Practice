import java.util.Scanner;

public class StringRepetition2 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String str = sc.nextLine();
        System.out.print("Enter repetition Number: ");
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            System.out.print(str+" ");
        }
    }
}
