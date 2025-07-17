public class palindromeString {
    public static void main(String[] args) {
        String str = "raceca";
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){ //str.equalIgnoreCase is alse used 
            System.out.println(str+" is palindrome");
        } else{
            System.out.println(str+" is not palindrome");
        }
    }
    
}
