package assignment2.StampCoupling;

public class Laptop {
    private String processor;
    private int RAM;
    private double powerSupply;
    private float SSD;

    public Laptop(Computer computer, float ssd){
        this.processor = computer.processor;
        this.RAM = computer.RAM;
        this.powerSupply = computer.PowerSupply;
        this.SSD = ssd;
    }
}
