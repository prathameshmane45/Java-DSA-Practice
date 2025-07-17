import java.util.Scanner;

public class Indexing {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int num = sc.nextInt();
        
        System.out.println(word.charAt(num));
    }
}
