package CandidateKey;
import java.util.*;
public class SetOpsAttributes {
    public List<String> PAs;
    public List<String> DAs;
    public SetOpsAttributes(){
        this.PAs = new ArrayList<>();
        this.DAs = Dependencies.findDependAttributes();
    }
    //Finds common attributes in PAs and DAs in the replacement process
    public Integer CommonAttributesReseter(PairCpp<String,String>dependee){
        for(int i = 0 ; i<dependee.second.length() ; i++)
        {
            if(!PAs.contains(String.valueOf(dependee.second.charAt(i)))){
                PAs.add(String.valueOf(dependee.second.charAt(i)));
            }
        }
        for(int i=0;i<dependee.first.length();i++)
        {
            if(DAs.contains(String.valueOf(dependee.first.charAt(i)))){
                DAs.remove(String.valueOf(dependee.first.charAt(i)));
            }
        }
        return 0;//reset index of CKcurrPos
    }

    public List<String> findCommonAttributes()
    {
        List<String> CAs = new ArrayList<>();
        for(String str: PAs)
        {
            if(DAs.contains(str)){
                CAs.add(str);
            }
        }
        return CAs;
    }
}
