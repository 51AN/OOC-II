package Lab06.Task02;

public class DivisibleThree implements Property<Integer> {

    @Override
    public boolean checkCharacteristic(Integer number){
        if(number%3 == 0){
            return true;
        }
        else{
            return false;
        }
    }

}
