import java.util.Scanner;
class gessthenumber{
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
    int secreat=30;
    int gess;

    do{
        
        System.out.println("enter the gess number");
        gess =sc.nextInt();
        if(gess<30){    
            System.out.println("gess higher");
        }else if(gess>30){
            System.out.println("gess lesser");
        }
    }while(gess!=secreat);
    System.out.println("congratulation you gess the number");
    }
}