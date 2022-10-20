package Lab08.SRPTask01;
import java.util.*;
public class JournalDatabase {

    private Map<String, ArrayList<String>> database = new HashMap<>();


    public void save(String id, String entry){
        ArrayList<String> list = new ArrayList<String>();
        list.add(entry);
        database.put(id,list);
    }

    public void save(String id, ArrayList<String> list){
        database.put(id,list);
    }

    public ArrayList<String> load(String string){
        return database.get(string);
    }

}
