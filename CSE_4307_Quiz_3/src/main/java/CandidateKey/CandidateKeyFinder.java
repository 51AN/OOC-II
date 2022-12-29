package CandidateKey;
import java.util.*;
public class CandidateKeyFinder {
    public List<String> attributes;
    public SetOpsAttributes setOpsAttributes;
    public CandidateKeyFinder(List<String>inputAttributeList){
        this.attributes=inputAttributeList;
        setOpsAttributes = new SetOpsAttributes();
    }

    public String firstCK()//provides the first CK generated from the elimination process
    {
        CandidateKeyTester candidateKeyTester = new CandidateKeyTester(this.attributes);
        String input = String.valueOf(ClosuresAttribute.AllAttributeSuperKey(this.attributes).charAt(0));//getting closure of attributes
        while(!new ClosuresAttribute(input).getClosureOfAttr().equals(ClosuresAttribute.AllAttributeSuperKey(this.attributes)))//checking closure of provided attribute
        {
            input = input + findNext(input);
        }
        input = candidateKeyTester.checkPSS(input);//checking for PSS
        for(int CKcurrPos = 0 ; CKcurrPos < input.length() ; CKcurrPos++){
            setOpsAttributes.PAs.add(String.valueOf(input.charAt(CKcurrPos)));
        }
        return input;
    }


    //finds next CK
    public String findNext(String input)
    {
        String attributeClosure = new ClosuresAttribute(input).getClosureOfAttr();
        String str = "";
        for(int CKcurrPos = 0; CKcurrPos< ClosuresAttribute.AllAttributeSuperKey(this.attributes).length(); CKcurrPos++){

            String viability = String.valueOf(ClosuresAttribute.AllAttributeSuperKey(this.attributes).charAt(CKcurrPos));

            if(!attributeClosure.contains(viability)){
                str = str + viability;
            }
        }
        return String.valueOf(str.charAt(0));
    }

    //generates all possible CKs based on common attributes through replacement process
    public Set<String>getAllCandidateKeys()
    {
        Set<String> CKs = new TreeSet<>();
        String firstCK = this.firstCK();
        CKs.add(firstCK);
        int currSize = CKs.size();

        while(CKs.size() != currSize){//maxCKsize ensures all replacable attributes
            int maxCKsize = CandidateKeyTester.findLargestCKSize(CKs);
            currSize = CKs.size();
            CKs = generateNewCandidateKeys(CKs,maxCKsize);
        }
        return CKs;
    }

    //replacement process of CKs
    public Set<String>generateNewCandidateKeys(Set<String>input ,int MaxCKcurrSize)
    {

        for(String s : input)
        {
            List<String> commonAttributes = setOpsAttributes.findCommonAttributes();
            int CKcurrPos = 0;

            while(commonAttributes.size() != 0) {
                List<PairCpp<String,String>>Dependees=new Dependencies().getLeftAttributeFD(commonAttributes);

                if(generateNewCandidateKeys(Dependees, s, input, CKcurrPos++, MaxCKcurrSize))
                    break;//break the loop for redundant SKs
                commonAttributes = setOpsAttributes.findCommonAttributes();
            }
        }
        return input;
    }

    private boolean generateNewCandidateKeys(List<PairCpp<String,String>>Dependents,String CK, Set<String>current,int CKcurrPos,int maxCKsize){
        boolean flag=false;
        for(PairCpp<String,String> s : Dependents)
        {
            String CKcurr = CK.replace(s.first, s.second);
            if(new CandidateKeyTester(this.attributes).isCK(CKcurr) && !CKcurr.equals(CK))
            {
                current.add(CKcurr);
                if(CKcurrPos == maxCKsize)
                {
                    CKcurrPos = setOpsAttributes.CommonAttributesReseter(s);
                }
            }
            else{
                flag = true;
            }
        }
        return flag;
    }
}
