package lab05.task03;
import java.util.List;
public class Printer <T>{

    public String printList(List<? extends Person> persons){
        return persons.toString();
    }
}
