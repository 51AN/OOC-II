package assignment2.ControlCoupling;

public class FactoryPrinter {
    public void print(IPrinter type){
        Printer printer = new Printer();
        printer.printType(type);
    }
}
