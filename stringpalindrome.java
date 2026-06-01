public class stringpalindrome {
     public static void main(String[] args) {
        if(palindrome("madam")){
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        
    }
   public static boolean palindrome(String a) {

    for (int i = 0; i < a.length() / 2; i++) {

        if (a.charAt(i) != a.charAt(a.length() - 1 - i)) {
            return false;
        }
    }

    return true;
    }
}    
