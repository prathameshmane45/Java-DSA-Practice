public class Wordfrequency {
    public static void main(String[] args) {
        String str = "we work to live and live to happy live";
        String word = "live";
        check(str, word);
    }
    public static void check(String str, String word){
        String ch[] = str.split(" ");
        int count = 0;
        for(int i=0;i<ch.length;i++){
            if(word.equals(ch[i])){
                count++;
            }
        }
        System.out.println("count : "+count);
    }
}
