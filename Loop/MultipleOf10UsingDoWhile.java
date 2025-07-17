import java.util.*;
public class MultipleOf10UsingDoWhile {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter the number : ");
            int n = sc.nextInt();

            if (n % 10 ==0){
                break;
            }
        } while(true);
    }
    
}
