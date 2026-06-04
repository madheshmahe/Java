import java.util.HashSet;
import java.util.Set;

public class setex {
    public static void main(String[] args) {
     Set<Integer> s=new HashSet<>(); 
     int[] arr={1,2,3,2,1,4,54,3,5};
   
       for(int i=0;i<arr.length;i++){
        if(s.contains(arr[i])){
            System.out.println(arr[i]);
           
        }
        s.add(arr[i]);
       }
       System.out.println(s.size());
    }
}
