package Lab06.Task02;

public class Length implements Property<String>{

    @Override
    public boolean checkCharacteristic(String line){
        if(line.length() > 4){
            return true;
        }
        else{
            return false;
        }
    }
}
