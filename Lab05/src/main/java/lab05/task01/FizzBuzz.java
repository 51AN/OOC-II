package lab05.task01;

public class FizzBuzz {
    String getFizzyBuzz(int n){
        String line = "";
        if((n%7 == 0) && (n%3 == 0)){
            line = "Fizzbuzz";
        }
        else if(n%7 == 0){
            line = "Buzz";
        }
        else if(n%3 == 0){
            line = "Fizz";
        }
        else{
            line = "Gotcha";
        }
        return line;
    }
}
