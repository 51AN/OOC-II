package CandidateKey;
import java.util.ArrayList;
import java.util.List;

public class SubstringsGen {
    public static List<String> getAllSubstrings(String input)
    {
        List<String> strings = new ArrayList<>();
        strings = SubstringsGen.getAllSubstringsGen(input,0,0,strings);
        return strings;
    }

    protected static List<String> getAllSubstringsGen(String input, int start, int end, List<String> result)
    {
        if (end == input.length())
            return result;
        else if (start > end)
            getAllSubstringsGen(input, 0, end + 1,result);
        else {
            String finalSS = "";
            for (int i = start; i <= end ; i++)
                finalSS = finalSS + input.charAt(i);
            result.add(finalSS);
            getAllSubstringsGen(input, start + 1, end, result);
        }
        return result;
    }
}
