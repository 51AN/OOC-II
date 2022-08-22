import java.util.*;
public class Main {
    public static void main(String[] args) {

        String s;
        Scanner scan = new Scanner(System.in);
        s = scan.nextLine();

        DirectionClass dir = new DirectionClass();

        System.out.println("I am in the " + DirectionClass.Directions.valueOf(s));
        System.out.println("I have to go " + DirectionClass.Directions.valueOf(s).getText());



    }
}