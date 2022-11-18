package assignment2.StampCoupling;

public class Computer {
    public String processor;
    public int RAM;
    public double PowerSupply;

    public Computer(String CPU, int ram, double power){
        this.processor = CPU;
        this.RAM = ram;
        this.PowerSupply = power;
    }
}
