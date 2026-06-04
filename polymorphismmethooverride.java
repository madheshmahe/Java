class animal{
    public void makesound(){
        System.out.println("animal sound");
    }
}

class dog extends animal{
    @Override
    public void makesound(){
        System.out.println("dog barks");
    }
}

public class polymorphismmethooverride {
    public static void main(String[]args){
        animal d=new dog();//run time polymorphism
        d.makesound();
    }
}

