package Lab09.MyImplementation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

public class XMLexport implements Exporter {
    @Override
    public void print(List<Student> students, String path) throws IOException {

//        String xmlFilePath = "D:\\Java Projects\\OOC-II\\Lab09\\test.xml";
//        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(xmlFilePath));
        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(path), "UTF-16");

        for(Student student : students){
            String line = student.print();

            out.write("\n");
            out.write(line);

        }
        out.close();


    }


}
