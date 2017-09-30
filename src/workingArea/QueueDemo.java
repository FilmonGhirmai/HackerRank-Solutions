package workingArea;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by
 * Filmon Ghirmai (skynet) on 8/8/17.
 * Software Developer
 */
public class QueueDemo {
    Queue<String> queue ;

    QueueDemo(){
        queue = new LinkedList<>();
    }

    public void enQueue(String s){
        queue.add(s);
    }
    public String deQueue(){
        return queue.poll();
    }

    public int queueSize(){
        return queue.size();
    }

    public boolean isQueueEmpty(){
       return queue.isEmpty();
    }

    public void printQueue(){
        if(!isQueueEmpty()) {
            for (int i = 0; i < queueSize(); i++) {
                System.out.print(deQueue());
                System.out.print(" ");
            }
        }else
            System.out.println("Queue is empty...");
    }

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        QueueDemo q = new QueueDemo();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            q.enQueue(in.next());
        }

        System.out.println("Queue size is : " + q.queueSize());
        q.printQueue();
    }
}
