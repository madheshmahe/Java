interface payment {
    void makepayment();
    
}

class googlepay implements payment {
    public void makepayment(){
        System.out.println("payment make by googlepay");
    }
    
}
class phonepay implements payment {
    public void makepayment(){
        System.out.println("payment make by phonepay");
    }
    
}
class paytm implements payment {
    public void makepayment(){
        System.out.println("payment make by paytm");
    }
    
}


public class makingpayment {
    public static void main(String[] args) {
        payment gpay=new googlepay();
        payment ppay=new phonepay();
        payment payt=new paytm();

        gpay.makepayment();
        ppay.makepayment();
        payt.makepayment();
    }
    
}
