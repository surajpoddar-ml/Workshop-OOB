package Week4;

class Person4 {
    protected String address;

    Person4(String address) {
        this.address = address;
    }
}

class Employee4 extends Person4 {
    private String department;

    Employee4(String address, String department) {
        super(address);
        this.department = department;
    }

    void showDetails() {
        
        System.out.println("Employee Department: " + department);
        System.out.println("Employee Address: " + address);
       
    }
}

public class Question4 {

    public static void main(String[] args) {
        Employee4 emp = new Employee4("Kathmandu, Nepal", "IT Department");
        emp.showDetails();
    }

}