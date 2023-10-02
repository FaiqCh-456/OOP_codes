package labtask_03;

public class Lab {
    private String labID;
    private Computer[] computers;
    private LabStatus status;
    private Employee labAttendant;

    public Lab(String labID, Computer[] computers, LabStatus status, Employee labAttendant) {
        this.labID = labID;
        this.computers = computers;
        this.status = status;
        this.labAttendant = labAttendant;
    }

    public String getLabID() {
        return labID;
    }

    public void addComputer(Computer computer) {
        // Assuming the lab has a maximum capacity
        if (computers == null) {
            computers = new Computer[5];
            computers[0] = computer;
        } else {
            for (int i = 0; i < computers.length; i++) {
                if (computers[i] == null) {
                    computers[i] = computer;
                    break;
                }
            }
        }
    }

    public void removeComputer(String computerNumber) {
        for (int i = 0; i < computers.length; i++) {
            if (computers[i] != null && computers[i].getComputerNumber().equals(computerNumber)) {
                computers[i] = null;
                break;
            }
        }
    }

    public Computer fetchComputer(String computerNumber) {
        for (Computer computer : computers) {
            if (computer != null && computer.getComputerNumber().equals(computerNumber)) {
                return computer;
            }
        }
        return null;
    }

    public void changeLabStatus(LabStatus newStatus) {
        this.status = newStatus;
    }

    public void setLabAttendant(Employee labAttendant) {
        this.labAttendant = labAttendant;
    }

    public Employee getLabAttendant() {
        return labAttendant;
    }

    public void displayDetails() {
        System.out.println("Lab ID: " + labID);
        System.out.println("Lab Status: " + status);
        System.out.println("Lab Attendant: Ali");
        labAttendant.displayDetails();
        System.out.println("Computers in the Lab:");
        for (Computer computer : computers) {
            if (computer != null) {
                computer.displayDetails();
            }
        }
    }
}

