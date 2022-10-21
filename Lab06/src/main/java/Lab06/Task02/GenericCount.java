package Lab06.Task02;
import java.util.List;

public class GenericCount {

    public <T> int countIf(List<T> list, Property<T> chara){
        int cnt = 0;

        for(T value : list){
            if(chara.checkCharacteristic(value) == true){
                ++cnt;
            }
        }
        return cnt;
    }

}

