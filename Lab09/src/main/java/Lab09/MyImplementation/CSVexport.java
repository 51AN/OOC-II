package Lab09.MyImplementation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVexport implements Exporter{



    @Override
    public void print(List<Student> students , String path) throws IOException {

//        String csvFilePath = "D:\\Java Projects\\OOC-II\\Lab09\\test.csv";
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(path));

//        StudentEnrollment studentEnrollment = new StudentEnrollment();
//        List<Student> students = studentEnrollment.getAll();

        for (Student student : students){
            String line = student.print();

            fileWriter.newLine();
            fileWriter.write(line);
        }

        fileWriter.close();


    }
}
