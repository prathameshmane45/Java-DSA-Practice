public class x {
    public static boolean isPalindrome(int x) {
        int rev = 0;
        while(x > 0){
            int rem = x % 10;
            rev = (rev * 10) + rem;
            x = x / 10;
        }
        return rev == x;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
