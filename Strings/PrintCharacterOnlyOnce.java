import java.util.*;
public class PrintCharacterOnlyOnce {
    public static void main(String[] args) {
        String str = "javajavajavadev";
        String str2 = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(str2.indexOf(ch) == -1){
                str2 = str2+ch;
            }
        }
        System.out.println("unique character are : "+str2);
    }
}
