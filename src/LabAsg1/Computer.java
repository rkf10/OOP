package LabAsg1;

import java.util.Objects;

public class Computer {
   private String computerNumber;
   private String IcdModel;
   private int ramSize;
   private int hddSize;
   private boolean hasGPU;
   public Computer() {
       this.computerNumber = null;
       this.IcdModel = null;
       this.ramSize = 0;
       this.hddSize = 0;
       this.hasGPU = false;
   }

    public Computer(String computerNumber, String icdModel, int ramSize, int hddSize, boolean hasGPU) {
        this.computerNumber = computerNumber;
        this.IcdModel = icdModel;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.hasGPU = hasGPU;
    }

    public String getComputerNumber() {
        return computerNumber;
    }

    public void setComputerNumber(String computerNumber) {
        this.computerNumber = computerNumber;
    }

    public String getIcdModel() {
        return IcdModel;
    }

    public void setIcdModel(String icdModel) {
        IcdModel = icdModel;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHddSize() {
        return hddSize;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public boolean isHasGPU() {
        return hasGPU;
    }

    public void setHasGPU(boolean hasGPU) {
        this.hasGPU = hasGPU;
    }

    @Override
    public boolean equals(Object o) {

        Computer computer = (Computer) o;
        return getRamSize() == computer.getRamSize() && getHddSize() == computer.getHddSize() && isHasGPU() == computer.isHasGPU() && Objects.equals(getComputerNumber(), computer.getComputerNumber()) && Objects.equals(getIcdModel(), computer.getIcdModel());
    }

    public Computer clone(){
        return new Computer(this.getComputerNumber(), this.getIcdModel(), this.getRamSize(), this.getHddSize(), this.isHasGPU());
    }


}
