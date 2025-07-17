import java.util.Scanner;

public class HalfString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int Half = str.length()/2;
        System.out.println(str.substring(0, Half));
    }
    
}
