import java.util.*;
public class MultiplicationWhile {
    public static void main(String args[]){   
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int n = sc.nextInt();
    int i=1;
    while(i != 11){
        System.out.println(n+" * "+i+" = "+(n*i));
        i++;
    }
}
}
