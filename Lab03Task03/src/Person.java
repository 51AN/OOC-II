import java.util.*;

public class Person {

    String number;


    //NumberException ex = new NumberException();

    public void setNumber(String s)
    {

        boolean ErrcheckNum = true;

        try
        {
            if(s.length() >= 8) {
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '_') {
                        this.number = s;
                        ErrcheckNum = false;
                        break;
                    }
                }
            }
            else {
                throw new NumberException();
            }

            if(ErrcheckNum){
                throw new NumberException();

            }
            else
            {
                System.out.println("OK");
            }
        }
        catch (NumberException e)
        {
            System.out.println(e.ToString());

    }






}


    public String getNumber()
    {
        return number;
    }



}
