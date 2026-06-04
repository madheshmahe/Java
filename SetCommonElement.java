import java.util.HashSet;
import java.util.Set;

public class SetCommonElement {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {3, 4, 5, 6, 7};

        Set<Integer> s = new HashSet<>();

        for (int num : arr) {
            s.add(num);
        }

      
        for (int num : arr1) {
            if (s.contains(num)) {
                System.out.println(num);
            }
        }
    }
}