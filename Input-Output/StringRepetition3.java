import java.util.Scanner;

public class StringRepetition3 {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        
        String sub = str.substring((str.length())-3);
        System.out.println(sub.repeat(n));
    }
    
}
