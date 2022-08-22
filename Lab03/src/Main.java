import java.util.Date;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String s;
        Scanner scan = new Scanner(System.in);
        s = scan.next();


        ErrorCodeClass errorCode = new ErrorCodeClass();

        //System.out.println(s);
        //errorCode.checkCode("C_401");
        //errorCode.checkCode("C_402");
        //System.out.println(s.compareTo("C_402"));
        System.out.println(ErrorCodeClass.code.valueOf(s).getValue());



    }
}