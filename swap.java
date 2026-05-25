import java.util.*;
class swap{
    public static void main(String []args){
       int a=10,b=5;

       int temp =b; //temp=5
       b=a; //b=10
       a=temp; //a=5
       System.out.println("after swap a="+a+ " b="+b);

       //swap valu without temp
       //b=a+b; //b=15
       //a=b-a; //a=5
       //b=b-a; //b=10
       //System.out.println("after swap without temp a="+a+ " b="+b);
       
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swap without temp a="+a+ " b="+b);
    }
}
