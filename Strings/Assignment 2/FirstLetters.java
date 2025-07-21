import java.util.Scanner;

public class FirstLetters {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str1 = sc.nextLine();
        System.out.print("Enter String : ");
        String str2 = sc.nextLine();
        System.out.print("Enter String : ");
        String str3 = sc.nextLine();
        System.out.println(str1.charAt(0)+""+str2.charAt(0)+""+str3.charAt(0));
    }
}
