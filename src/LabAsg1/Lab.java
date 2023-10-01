package LabAsg1;

public class Lab {
    private String labID;
    public Computer[] computers;
    private LabStatus status;
    private Employee labAttendant;
    private int CompM = 5;
    private int CompC = 5;

    public Lab() {
        this.labID = null;
        this.computers = null;
        this.status = null;
        this.labAttendant = null;
    }

    public Lab(String labID, Computer[] computers, LabStatus status, Employee labAttendant) {
        this.labID = labID;
        this.computers = computers;
        this.status = status;
        this.labAttendant = labAttendant;
    }

    public Lab(String number, String number1, LabStatus labStatus, Employee ali) {
    }

    public void addComputer(Computer computer) {
        if (CompC < CompM) {
            computers[CompC++] = computer;
        }
    }

    public boolean removeComputer(String computerNumber) {
        for (int i = 0; i < CompC; i++) {
            if (computers[i].getComputerNumber().equals(computerNumber)) {
                for (int j = i; j < CompC - 1; j++) {
                    computers[j] = computers[j + 1];
                }
                computers[--CompC] = null;
                return true;
            }
        }
        return false;
    }
    public Computer fetch(String computerNumber){
        for (Computer comp : computers){
            if (comp.getComputerNumber().equals(computerNumber)){
                return comp;
            }
        }
        return null;
}




}
