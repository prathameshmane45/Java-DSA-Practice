import java.util.*;
public class switchh {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        System.out.println("Choose One option : ");
        int operation = sc.nextInt();

        switch(operation){
            case 1 : System.out.println(a+b);
                    break;
            case 2 : System.out.println(a-b);
                    break;
            case 3 : System.out.println(a*b);
                    break;
            case 4 : System.out.println(a/b);
                    break;
            default : System.out.println("Enter correct option ");
                    break;
        }
    }
}
