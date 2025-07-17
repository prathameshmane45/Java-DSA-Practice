
public class CountWordsInString {
    public static void main(String[] args) {
        String str = "hello, I am java Developer";
        int count = 1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                count ++;
            }
        }
        System.out.println("the total words in String are : "+count);
    }    
}
