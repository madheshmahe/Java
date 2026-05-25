import java.util.*;
class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter you age");
        int num=sc.nextInt();
        System.out.println("Hello " + name);
        System.out.println("your age is " +num);
    }
}