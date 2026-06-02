class user{
    String name;
    String phone;
    String location;

    user(){}
    
    user(String name,String phone,String location){
        this.name=name;
        this.phone=phone;
        this.location=location;
    }

    public void basicinfo(){
        System.out.println("Name: "+name+" Phone: "+phone+" Location: "+location);
    }
}

class fooduser extends user{
    String favfood;
    
    fooduser(String name, String phone, String location,String favfood){
        super(name,phone,location);
        this.favfood=favfood;
    }

    public void userdetails(){
        basicinfo();
        System.out.println("Name: "+name+" Phone: "+phone+" favorite food: "+favfood);
    }
}



public class inheritance {
    public static void main(String[]args){
          fooduser f1 = new fooduser(
            "Madhesh",
            "9876543210",
            "Chennai",
            "Biryani"
        );

       f1.userdetails();

    }
}
