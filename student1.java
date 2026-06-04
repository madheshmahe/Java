class school{
    private String name;
    private int age;
    private String studing;

    public void setdetails(String name, int age, String studing){
        this.name=name;
        this.age=age;
        this.studing=studing;
    }
    
    public void getdetails(){
        System.out.println("Name: "+name+" Age: "+age+" studing: "+studing);
    } 
}
public class student1 {
    public static void main(String [] args){
        school s1=new school();
        s1.setdetails("mdhesh",20,"firstyear");
        s1.getdetails();
    }
}
