package lab05.task02;
import java.util.*;
public class MinStack {
    private Stack<Integer> stack = new Stack<>();
    private List<Integer> minList = new ArrayList<>();
    private Integer min = 2147483647;
    public void push(Integer val){

        stack.push(val);

        if(val < min){
            min = val;
            minList.add(min);
        }
        else{
            minList.add(min);
        }

    }

    public Integer pop()
    {
        if(stack.empty()) {
            return -1;
        }
        else{
            Integer temp = stack.peek();
            minList.remove((minList.size()-1));
            stack.pop();
            return temp;

        }

    }

    public Integer min(){
        Integer minimum = minList.get((minList.size()-1));
        return minimum;
    }
}
