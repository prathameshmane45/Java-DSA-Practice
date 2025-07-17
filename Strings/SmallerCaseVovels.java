
public class SmallerCaseVovels {
    public static void main(String[] args) {
        String str = "javaDev";
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                System.out.println(str.charAt(i));
                count++;
            }
        }
        System.out.println("The vovels in smaller case are : "+count);
    }    
}
