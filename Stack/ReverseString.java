import java.util.*;
public class ReverseString {
    public static void Stringrev(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(! s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        System.out.println(result.toString());
    }
    public static void main(String args[]){
        Stringrev("mane");
    }
}
