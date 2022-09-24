package Lab06.Task02;

public class Odd implements Property<Integer>{

    @Override
    public boolean checkCharacteristic(Integer number){
        if(number%2 == 1){
            return true;

        }
        else{
            return false;
        }
    }
}
