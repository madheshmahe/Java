import java.util.HashSet;
import java.util.Set;

public class setstring{
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        String str = "banana";
        String[] arr = str.split("");

        for (String a : arr) {
            if (!s.add(a)) {
                duplicates.add(a);
            }
        }

        System.out.println(duplicates);
    }
}