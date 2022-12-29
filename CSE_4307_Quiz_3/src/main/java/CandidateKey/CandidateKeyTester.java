package CandidateKey;
import java.util.*;
public class CandidateKeyTester {
    public List<String> attributes;
    public CandidateKeyTester(List<String> attributes)
    {
        this.attributes = attributes;
    }
    public boolean isCK(String input){

        ClosuresAttribute closuresAttribute = new ClosuresAttribute(input);
        if(!closuresAttribute.getClosureOfAttr().equals(ClosuresAttribute.AllAttributeSuperKey(this.attributes))){
            return false;
        }
        List<String> substrings= SubstringsGen.getAllSubstrings(input);
        for(String s:substrings)
        {
            ClosuresAttribute closuresAttribute2 = new ClosuresAttribute(s);
            if(closuresAttribute2.getClosureOfAttr().equals(ClosuresAttribute.AllAttributeSuperKey(this.attributes)) && !s.equals(input))
            {
                return false;
            }
        }
        return true;
    }

    public String checkPSS(String input)
    {
        if(isCK(input))
        {
            return input;
        }
        else{
            List<String> substrings = SubstringsGen.getAllSubstrings(input);
            for(String s : substrings)
            {
                if(isCK(s))
                {
                    return s;
                }
            }
        }
        return input;
    }

    public static int findLargestCKSize(Set<String> input)
    {
        int maximum = 0;
        for(String str : input)
        {
            if(str.length() > maximum)
                maximum = str.length();
        }
        return maximum;
    }
}
