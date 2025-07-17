import java.util.*;
public class SumOfFirstNaturalNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int range = sc.nextInt();
        int i=0;
        int sum = 0;
        while(i<=range){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
