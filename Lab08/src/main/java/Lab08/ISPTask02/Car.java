package Lab08.ISPTask02;

public class Car implements IEngine, Switchable{

    @Override
    public boolean startEngine(){
        return true;
    }

    @Override
    public boolean turnOn(Electronics electronics){
        return true;
    }
    public boolean turnOff(Electronics electronics){
        return false;
    }
}
