
public class Employee extends Person {
    
    int employeeID = 1312431256;

    void displayEmployeeInfo() {

        System.out.println(super.name + "\n" + super.age + "\n" + employeeID);
    }
}
