package Lab08.SRPTask01;
import java.util.*;
public class Journal {
    private ArrayList<String> entries = new ArrayList<>();

    public void addEntry(String entry) {
        entries.add(entry);
    }

    public void addEntries(ArrayList<String> entryList) {
        for(String entry : entryList)
        {
            entries.add(entry);
        }
    }

    public void removeEntry(String removeString) {
        for(String entry : entries)
        {
            if(entry.equals(removeString))
            {
                entries.remove(entry);
            }
        }
    }

    @Override
    public String toString(){
        String str = "";

        for(String entry : entries){
            str += entry + " ";
        }


        return str;

    }

}
