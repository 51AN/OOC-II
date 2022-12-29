package CandidateKey;

import java.util.*;
//during input, finds all the dependencies of attributes.
public class Dependencies {
    public List<String> dependAttributes;

    public Dependencies(){
        this.dependAttributes = Dependencies.findDependAttributes();
    }

    public static Map<String, String> dependencyTable;

    public static List<String> findDependAttributes(){
        List<String> dependants = new ArrayList<>();

        Iterator<Map.Entry<String, String>> TableIterator = Dependencies.dependencyTable.entrySet().iterator();
        while (TableIterator.hasNext()) {
            Map.Entry<String, String> dependencyTableElement = TableIterator.next();
            dependants.add(dependencyTableElement.getValue());
        }
        return getUniqueAttributes(dependants);
    }
    //a  function that filters attributes to return only unique elements in the set
    public static List<String> getUniqueAttributes(List<String>attributes)
    {
        SortedSet<String> set =new TreeSet<>();

        List<String>result=new ArrayList<>();

        for(String s : attributes){
            for(int i = 0 ; i<s.length() ; i++){
                set.add(String.valueOf(s.charAt(i)));
            }
        }
        for(String s : set){
            result.add(s);
        }
        return result;
    }

    //for finding the left attribute of an FD
    public List<PairCpp<String,String>>getLeftAttributeFD(List<String>input)
    {
        List<PairCpp<String,String>>dependee = new ArrayList<>();
        Iterator<Map.Entry<String, String>> TableIterator = Dependencies.dependencyTable.entrySet().iterator();
        while (TableIterator.hasNext()) {
            Map.Entry<String, String> dependencyTableElement = TableIterator.next();
            for(String s : input)//checks transitivity
            {
                if(dependencyTableElement.getValue().contains(s)){
                    PairCpp<String,String> pairCpp = new PairCpp<>(s, dependencyTableElement.getKey());
                    dependee.add(pairCpp);
                }
            }
        }
        return dependee;
    }





}
