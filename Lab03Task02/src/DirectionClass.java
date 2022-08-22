import java.util.*;
public class DirectionClass {

    public enum Directions{
        North("South"),
        South("North"),
        East("West"),
        West("East");

        public final String label;
        Directions(String s) {
            this.label = s;
        }

        public String getText() {
            return label;
        }

    }






}
