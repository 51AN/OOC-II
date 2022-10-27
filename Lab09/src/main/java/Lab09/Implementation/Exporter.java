package Lab09.Implementation;
import java.util.*;
import java.io.*;
public class Exporter {



    public void writeCSV(List<Student> students) throws IOException {
        String csvFilePath = "D:\\Java Projects\\OOC-II\\Lab09\\test.csv";
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(csvFilePath));

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
