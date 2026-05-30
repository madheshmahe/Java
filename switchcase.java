import java.util.*;
class switchcase{
    public static void main(String [] args){
        int day;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the day 1-7");
        day=sc.nextInt();
        switch(day){
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("mon");
                break;
            case 3:
                System.out.println("tue");
                break;
            case 4:
                System.out.println("wed");
                break;
            case 5:
                System.out.println("thu");
                break;
            default:
                System.out.println("invalid day");
        }
    }
}