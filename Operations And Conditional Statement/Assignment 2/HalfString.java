import java.util.Scanner;

public class HalfString {
     public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();
        System.out.println(str.substring(str.length()/2));
    }
    
}
