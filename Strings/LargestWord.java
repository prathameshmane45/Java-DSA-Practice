public class LargestWord {
    public static void main(String[] args) {
        String str = "I am a java developer";
        String str2[] = str.split(" ");
        System.out.println("Total words in string are : "+str2.length);
        for(int i=0;i<str2.length;i++){
            System.out.print(str2[i]+"-");
            System.out.println(str2[i].length());
        }
        int max = 0;
        for(int i=0;i<str2.length;i++){
            if(str2[i].length() > max){
                max = str2[i].length();
            }
        }
        System.out.println("The longest word in the Strign : "+max);

    }
    
}
