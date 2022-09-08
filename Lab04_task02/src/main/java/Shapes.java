import java.lang.reflect.Array;
import java.util.*;


public class Shapes {

    ArrayList<String> arr = new ArrayList<>(Arrays.asList("Circle", "Square", "Rectangle"));

    //declaring methods like this is bad code. We need to implement more and more methods if we want to add new shapesd

    public String Circle()
    {
        return "Drawing Circle\n";
    }

    public String Square()
    {
        return "Drawing Square\n";
    }
    public String Rectangle()
    {
        return "Drawing Rectangle\n";
    }

    public String DrawShape()
    {
        String line = "";
        for(String str: arr)
        {
            if(str == "Circle")
            {
                line += Circle();
            }
            else if (str == "Rectangle") {
               line += Rectangle();
            }
            else if(str=="Square"){
                line += Square();
            }
        }
        //Using multiple if statements cause cascading conditions. this is a bad code
        return line;
    }







}
