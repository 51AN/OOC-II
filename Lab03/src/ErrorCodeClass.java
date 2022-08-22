import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ErrorCodeClass {

    //List<String> codes = new ArrayList<>();

    public enum code{


        C_400("Bad Request"),
        C_401("Unauthorized"),
        C_403("Forbidden"),
        C_404("Not Found"),
        C_408("Request Timeout");


        public final String label;
        code(String s) {
            this.label = s;
        }

        public String getValue()
        {
            return label;
        }
    }



}
