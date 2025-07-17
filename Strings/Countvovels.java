public class Countvovels {
    public static void main(String[] args) {
        String str = "we work to live and live to be happy live";
        String ch[] = str.split("");
        int count = 0;
        for(int i=0;i<ch.length;i++){
            if(ch[i].equals("a") || ch[i].equals("e") || ch[i].equals("i") || ch[i].equals("o") || ch[i].equals("u")){
                count++;
            }
        }
        System.out.println("Total vovels in the Stirng are : "+count);
    }
    
}
