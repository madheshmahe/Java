class bankaccount{
    private double balance=0;

    public void setbalance(int amount){
        balance+=amount;
    }
    public double getbalance(){
        return balance;
    }

}



public class encapsulation {
    public static void main(String []args){

        bankaccount account=new bankaccount();
        account.setbalance(1000);
        System.out.println(account.getbalance());
    }
}
