package lesson7.queue;

public class QueueTest {

    public static void main(String[] args) {

        MyQueue queue = new MyQueue();

        System.out.println(queue.empty());
        System.out.println(queue.size());

        queue.push("A");
        queue.push("B");
        queue.push("C");
        queue.push("D");

        System.out.println(queue.empty());
        System.out.println(queue.size());

        System.out.println(queue.pop());
        System.out.println(queue.pop());

        System.out.println(queue.size());

        System.out.println(queue.pop());
        System.out.println(queue.pop());

        System.out.println(queue.empty());
        System.out.println(queue.size());

        System.out.println(queue.pop());

        queue.push("E");
        queue.push("F");
        queue.push("G");
        queue.push("H");
    }
}
