public class unrepatedstring {

    public static char firstRepeatedWord(String s) {

        for (int i = 0; i < s.length(); i++) {
            int count = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                return s.charAt(i);
            }
        }

        return '\0'; 
    }

    public static void main(String[] args) {

        String s = "swiss";

        char result = firstRepeatedWord(s);

        if (result != '\0') {
            System.out.println("First non-repeated character: " + result);
        } else {
            System.out.println("No non-repeated character found");
        }
    }
}