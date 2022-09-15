package lab05.Bonus;
import java.util.*;
public class MinStackGen <T extends Comparable>{
    private Stack<T> stack = new Stack<T>();
    private List<T> minList = new ArrayList<T>();

    private T min;


    public void Push(T val){

        stack.push(val);

        if(stack.size() == 1){
            min = val;
        }

        if(val.compareTo(min) < 0){
            min = val;
            minList.add(min);
        }
        else{
            minList.add(min);
        }
    }

    public T pop()
    {
        if(stack.empty()) {
            return null;
        }
        else{
            T temp = stack.peek();
            minList.remove((minList.size()-1));
            stack.pop();
            return temp;

        }

    }

    public T min(){
        T minimum = minList.get((minList.size()-1));
        return minimum;
    }

}
