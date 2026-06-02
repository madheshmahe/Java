class employee {
    String name;
    String empid;
    double salary;

    employee() {
    }

    employee(String name, String empid, double salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }

    public void empinfo() {
        System.out.println("Name: " + name + " Empid: " + empid + " salary: " + salary);
    }
}

class manager extends employee {

    String department;

    manager(String name, String empId, double salary, String department) {
        super(name, empId, salary);
        this.department = department;
    }

    public void displayManager() {
        System.out.println("Department: " + department);
    }
}  

public class company {
    public static void main(String[] args) {

        manager m1 = new manager(
                "Madhesh",
                "E101",
                50000,
                "IT");

        m1.empinfo();
        m1.displayManager();
    }
}