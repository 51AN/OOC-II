import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class Shapes_test {



    @Test
    void BadShapesTest(){
        Shapes shapes = new Shapes();

        String expected = shapes.DrawShape();

        assertEquals(expected, "Drawing Circle\nDrawing Square\nDrawing Rectangle\n"); //This is a bad way of testing as we need to change the string everytime we check
    }

    @Test
    void ShapesTest(){

        List<Object> shapes = new ArrayList<>();

        Circle circle = new Circle();
        shapes.add(circle);

        Square square = new Square();
        shapes.add(square);

        //modifications are done here
        Rectangle rectangle = new Rectangle();
        shapes.add(rectangle);


        for(Object shape : shapes)
        {

            assertTrue(shape instanceof Drawable);

        }



    }



}
