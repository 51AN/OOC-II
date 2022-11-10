import Lab10.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.*;
public class AnnotationTest {

    @Test
    public void TestClassAnnotation(){
        Course c1 = new Course("4301","OOC",3.0f,Type.theory);
        Course c2 = new Course("4302","OOC",1.5f,Type.lab);

        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(c1);
        courses.add(c2);

        Faculty faculty = new Faculty("Md. Jubair Ibna Mostafa", "Lecturer", 80000, courses);
        Class[] classes = faculty.getClass().getDeclaredClasses();
        List<String> ClassNames = new ArrayList<String>();

        for(Class c : classes){
            boolean isAnnotationPresent = c.isAnnotationPresent(DevelopmentHistory.class);
            if(isAnnotationPresent){
                ClassNames.add(c.getName());
            }
        }

        ArrayList<String> checkClasses = new ArrayList<>();
        checkClasses.add("Lab10.Faculty");

        assertTrue(checkClasses.containsAll(ClassNames));

    }

    @Test
    public void TestConstructorAnnotation(){
        Course c1 = new Course("4301","OOC",3.0f,Type.theory);
        Course c2 = new Course("4302","OOC",1.5f,Type.lab);

        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(c1);
        courses.add(c2);

        Faculty faculty = new Faculty("Md. Jubair Ibna Mostafa", "Lecturer", 80000, courses);
        Constructor[] constructors = faculty.getClass().getDeclaredConstructors();
        List<String> ConstructorNames = new ArrayList<String>();

        for(Constructor c : constructors){
            boolean isAnnotationPresent = c.isAnnotationPresent(DevelopmentHistoryWithReviewer.class);
            if(isAnnotationPresent){
                ConstructorNames.add(c.getName());
            }
        }

        ArrayList<String> checkConstructor = new ArrayList<>();
        checkConstructor.add("Lab10.Faculty");
        checkConstructor.add("Lab10.Faculty");

        assertTrue(checkConstructor.containsAll(ConstructorNames));


    }

    @Test
    public void TestMethodAnnotation(){
        Course c1 = new Course("4301","OOC",3.0f,Type.theory);
        Course c2 = new Course("4302","OOC",1.5f,Type.lab);

        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(c1);
        courses.add(c2);

        Faculty faculty = new Faculty("Md. Jubair Ibna Mostafa", "Lecturer", 80000, courses);
        Method[] methods = faculty.getClass().getDeclaredMethods();
        List<String> MethodNames = new ArrayList<String>();

        for(Method m : methods){
            boolean isAnnotationPresent = m.isAnnotationPresent(DevelopmentHistoryWithReviewer.class);
            if(isAnnotationPresent){
                MethodNames.add(m.getName());
            }
        }
        ArrayList<String> checkMethod = new ArrayList<>();
        checkMethod.add("teach");
        checkMethod.add("research");

        assertTrue(checkMethod.containsAll(MethodNames));
    }



}
