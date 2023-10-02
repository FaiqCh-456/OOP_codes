package labtask_03;

public class Employee {
    private String employeeID;
    private String name;
    private static final String designation = "Lab Attendant";





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


    public static String getDesignation() {
        return designation;
    }
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
    }


}
