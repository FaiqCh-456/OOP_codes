package labtask_03;

public class Computer {
    public String computerNumber;
    public String lcdModel;
    public int ramSize;
    public int hddSize;
    public boolean hasGpu;



    public Computer(String computerNumber, String lcdModel, int ramSize, int hddSize, boolean hasGpu) {
        this.computerNumber = computerNumber;
        this.lcdModel = lcdModel;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.hasGpu = hasGpu;
    }


    public String getComputerNumber() {
        return computerNumber;
    }

    public void setComputerNumber(String computerNumber) {
        this.computerNumber = computerNumber;
    }

    public String getLcdModel() {
        return lcdModel;
    }

    public void setLcdModel(String lcdModel) {
        this.lcdModel = lcdModel;
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

    public boolean isHasGpu() {
        return hasGpu;
    }

    public void setHasGpu(boolean hasGpu) {
        this.hasGpu = hasGpu;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Computer computer = (Computer) obj;
        return computerNumber.equals(computer.computerNumber);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public static Computer clone(Computer comp){
        return new Computer(comp.getComputerNumber(), comp.getLcdModel(), comp.getRamSize(), comp.getHddSize(), comp.hasGpu);
}
    public void displayDetails() {
        System.out.println("Computer Number: " + computerNumber);
        System.out.println("LCD Model: " + lcdModel);
        System.out.println("RAM Size: " + ramSize + " GB");
        System.out.println("Hard Disk Size: " + hddSize + " GB");
        System.out.println("GPU Available: " + (hasGpu ? "Yes" : "No"));
    }



}
