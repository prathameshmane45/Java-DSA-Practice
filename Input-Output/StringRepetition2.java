import java.util.Scanner;

public class StringRepetition2 {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        System.out.println(str.repeat(n));
    }
    
}
