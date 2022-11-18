package assignment2.ControlCoupling;

public class Printer {


    public void printType(IPrinter type){
        HP hp = new HP();
        Dell dell = new Dell();
        if(type.equals(hp)){
            hp.printModel();
        }
        else if(type.equals(dell)){
            dell.printModel();
        }
    }

}
