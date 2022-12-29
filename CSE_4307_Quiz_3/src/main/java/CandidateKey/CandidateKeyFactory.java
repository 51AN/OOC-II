package CandidateKey;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
//factory class for showing proper candidate keys
public class CandidateKeyFactory {

    private Set<String> candidateKeys;
    public CandidateKeyFactory(String filename){
        FactoryInput factoryInput = new FactoryInput(filename);//passing file address to input format class
        CandidateKeyFinder candidateKeyFinder = new CandidateKeyFinder(factoryInput.getAttributes());//finding out CKs
        this.candidateKeys = candidateKeyFinder.getAllCandidateKeys();//getting solved CKs
    }
    public void outputCandidateKeys(String filename)//write to output file (Appropriate CKs)
    {
        FileWriter fw;
        try{
            fw=new FileWriter(filename);
            WriteFileHeader(fw,this.candidateKeys.size());
            int i = 1;
            for(String s:this.candidateKeys)
            {
                fw.write(String.format("CK%d: %s\n",i++,s));
            }
            fw.close();

        }
        catch (IOException e)
        {
            System.out.println("Could not write to file \n");
            e.printStackTrace();
        }
    }
    public void WriteFileHeader(FileWriter fw,Integer numCandidateKeys) throws IOException //writing to output file (number of CKS)
    {
        if(numCandidateKeys > 1)
        {
            fw.write(String.format("There are a total of %d possible CKs. They are given below:\n", numCandidateKeys));
        }
        else if(numCandidateKeys == 1){
            fw.write(String.format("There is only 1 possible CK. It is given below:\n"));
        }
        else{
            fw.write(String.format("There is no possible CK.\n"));
        }
    }



}
