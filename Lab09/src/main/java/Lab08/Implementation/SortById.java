package Lab08.Implementation;

import java.util.Comparator;

public class SortById implements Comparator<Student> {
    public int compare(Student a, Student b){
//        return (int) (a.CGPA - b.CGPA);
          return  a.ID.compareTo(b.ID);
    }
}
