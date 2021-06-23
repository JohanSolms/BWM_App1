import java.util.ArrayDeque;
import java.util.Deque;

//Johan Solms, 2021/06/23

public class Stack {
    private Deque<Integer> myStack;

    Stack(){
        myStack = new ArrayDeque<>();
    }
    Stack(Deque<Integer> myStack){
        this.myStack = myStack;
    }

    public boolean push(int element){ //offer returns null instead of throwing an exception
        return myStack.offerFirst(element);
    }

    public Integer pop(){ //Integer wrapper returned in case the poll returns null
        return myStack.pollFirst();
    }

    public boolean empty(){
        return myStack.isEmpty();
    }

    public int count(){
        return myStack.size();
    }

    @Override
    public String toString(){
        StringBuilder value = new StringBuilder();
        for(int i : myStack){
           value.append(i).append(" ");
        }
        return value.toString();
    }
}
