class student {
    String name;
    int age;

    //default constructor;
    student(){

    }
    public void display() {
        System.out.println("Name: " + name + " Age: " + age);
    }
    // parameterized constructor;
    student(String name,int age){
        this.name=name;
        this.age=age;
    }
    student(String n){
        name=n;
        age=20;
    }
}

public class obj {
    public static void main(String[] args) {
        student s1 = new student("saaro",19);
        student s2=new student("sama");
        s2.display();
        // s1.name = "test";
        // s1.age = 20;
        s1.display();
        s1.name="madhesh";
        s1.age=18;
        s1.display();
    }
}