package CandidateKey;
import java.util.*;

public class ClosuresAttribute {
    private String closureOfAttr;
    public ClosuresAttribute(String input){
        this.closureOfAttr = this.findClosureOfAttr(input);
    }
    public static String AllAttributeSuperKey(List<String>attributes){
        String str = "";
        for(String s : attributes){
            str += s;
        }
        return str;
    }

    public String getClosureOfAttr(){
        return this.closureOfAttr;
    }

    private String findClosureOfAttr(String input){
        
        List<String> allSubstrings = SubstringsGen.getAllSubstrings(input);
        SortedSet<Character> transitivitySet = getTransitivityFD(input);
        transitivitySet  = findCompoundFD(allSubstrings , transitivitySet);
        String finalClosure = ClosuresAttribute.UniqueAttrToStr(transitivitySet);
        if(!input.equals(finalClosure))
            return this.findClosureOfAttr(finalClosure);
        else
            return finalClosure;
    }

    private SortedSet<Character> getTransitivityFD(String input){
        SortedSet<Character> sortedSet = new TreeSet<>();
        for(int i = 0 ; i < input.length() ; i++)
        {
            sortedSet.add(input.charAt(i));
        }
        return sortedSet;
    }

    private SortedSet<Character> findCompoundFD(List<String>allSubStrings, SortedSet<Character>sortedSet){
        for(String s : allSubStrings){
            if(Dependencies.dependencyTable.containsKey(s)){
                String FD = Dependencies.dependencyTable.get(s);
                for(int i = 0 ; i<FD.length() ; i++){
                    sortedSet.add(FD.charAt(i));
                }
            }
            else{
                for(int i = 0 ; i < s.length() ; i++){
                    sortedSet.add(s.charAt(i));
                }
            }
        }
        return sortedSet;
    }

    public static<T> String UniqueAttrToStr(Set<T>input)
    {
        String str = "";
        for(T t : input)
        {
            str = str + t;
        }
        return str;
    }
}
