package LabAsg1;

public class Employee {
    private String employeeID;
    private String name;
    private final String designation = "Lab Attendant";

    public Employee() {
        this.employeeID = null;
        this.name = null;
    }

    public Employee(String employeeID, String name) {
        this.employeeID = employeeID;
        this.name = name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
