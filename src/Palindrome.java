public class Palindrome {
    public static void main(String[] args){
        for (int i=0;i<args.length; i++){
            String s = args[i];
        }
        String b = "хех";
        String r = reverseString(b);
        System.out.print(isPalindrome(b,r));
    }
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static boolean isPalindrome(String b, String r){
        return b.equals(r);
    }

}
