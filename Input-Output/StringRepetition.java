import java.util.Scanner;

public class StringRepetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = sc.nextInt();

        System.out.println((s+" ").repeat(a).trim());
        
    }
    
}
