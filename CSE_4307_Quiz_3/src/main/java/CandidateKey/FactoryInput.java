package CandidateKey;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
//formats the input file
public class FactoryInput {

    public String fileContent;
    public String fileName;
    public String attributes;

    public FactoryInput(String fileName){
        this.fileName = fileName;
        fileContent = "";
        Dependencies.dependencyTable = new HashMap<>();
        this.fileRead(); // reads input file into fileContent.
        this.formatString(); // formats the read file
    }


    private void fileRead(){
        try{
            FileReader fileReader=new FileReader(this.fileName);
            Character ch;
            ch = (char)fileReader.read();
            while(true){
                fileContent += ch;
                int x = fileReader.read();
                if(x == -1){
                    break;
                }
                else{
                    ch = (char)x;
                }
            }
            this.fileContent=this.fileContent.replace("\n", "").replace("\r", "").trim();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found !!!");
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void formatString(){
        //the newlines and trailing and leading spaces were removed while reading the file and storing as string
        int indexEndAttribute = this.fileContent.indexOf(')');
        this.attributes = this.fileContent.substring(0,indexEndAttribute+1);//inclusive
        String dependent = this.fileContent.substring(indexEndAttribute+1);
        String[] allFDs = dependent.split(",");
        for(String str : allFDs){
            String[] allDependencies = str.split("->");
            Dependencies.dependencyTable.put(allDependencies[0].trim(),allDependencies[1].trim());
        }
    }

    public List<String> getAttributes(){
        List<String> allAttributes = new ArrayList<>();
        String[] rawAttributes = this.attributes.split(",");
        for(String str: rawAttributes){
            if(str.contains(")")){
                allAttributes.add(str.split("\\)")[0].trim());

            }
            else if(str.contains("(")){
                allAttributes.add(str.split("\\(")[1].trim());
            }
            else{
                allAttributes.add(str);
            }
        }
        return allAttributes;
    }


}
