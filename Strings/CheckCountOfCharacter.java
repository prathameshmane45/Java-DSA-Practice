import java.util.*;
public class CheckCountOfCharacter {
    public static void main(String[] args) {
        String s = "javaEEdev";
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'E' || s.charAt(i) == 'e'){
                count++;
            }
        }
        System.out.println(count);
    }
}
