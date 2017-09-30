package workingArea;
import java.util.*;

/**
 * Created by
 * Filmon Ghirmai (skynet) on 8/7/17.
 * Software Developer
 */
public class stackTest {
    private  static void printStack(Stack<Number> stack){
        if(stack.isEmpty()){
            System.out.println("Stack is empty...");
        }else{
            System.out.println("stack list" + stack);
        }
    }
    public static void main(String[] args) {
        Stack<Number>  stack = new Stack<>();
        PriorityQueue<String>  queue = new PriorityQueue<>();
        Queue<Character> queuelist = new LinkedList<>();
        //queuelist.remove();

        queue.offer("filmon");
        queue.offer("ghirmai");
        stack.push(12);
        stack.push(33);
        stack.push(39);
        stack.push(77);

        printStack(stack);
        System.out.println(stack.peek());
        printStack(stack);
        System.out.println(stack.pop());
        printStack(stack);
        System.out.println("queue");
        System.out.println(queue);
        System.out.println(queue.poll());
    }
}
