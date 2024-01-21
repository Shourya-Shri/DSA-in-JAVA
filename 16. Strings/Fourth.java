// Check if a string is Palindrome or not
public class Fourth{
    public static boolean isPalindrome(String str){
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                // Not a Palindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        System.out.println(isPalindrome("ABABA"));
        System.out.println(isPalindrome("Shourya"));
    }
}